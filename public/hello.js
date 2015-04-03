$(document).ready(function() {

	$.ajax({
		url: "http://localhost:8080/week/all"
	}).then(function(data, status, jqkhr) {
		
		var list = $.parseJSON(data);
		
		$(list).each(function(index, value) {
			// iterate over all weeks, add new <a> to <li>
//			
//			<li class="dropdown" role="presentation">
//			<a role="menuitem" tabindex="-1" class="week" href="#">03-31-2015</a>
//		</li>
//			
			
			$('.dropdown').append(
					//"<li class=\"dropdown\" role\"presentation\">" +
					"<a role=\"menuitem\" tabindex=\"" + index + "\" class=\"week\" href=\"#\">" + 
					value.date + "</a>"
					//this.date + "</a>"
					//		+ "</li>"
					);	
		})
	});

	$('#search-keypress').keypress(function(event) {
		var keycode = (event.keyCode ? event.keyCode : event.which);
		if (keycode == '13') {
			var hymnNum = $(this).val();
			retrieveHymn(hymnNum);
		}

	});

	$('#search-click').click(function(event) {
		var hymnNum = $('#search-keypress').val();
		retrieveHymn(hymnNum);
	});

	function retrieveHymn(hymn) {
		var newURI = "http://localhost:8080/hymn/"+hymn

		// for when I get pushState-like functionality working
		//history.pushState({}, '', hymn)

		$.ajax({
			url: newURI
		}).then(function(data, status, jqxhr) {
			$('.hymn-name').text(data.name);
			$('.hymn-lyrics').text(data.lyrics);
			$('.hymn-number').text(data.number);

			$('.hymn-uri-mp3').attr("src", data.mp3Uri);
			$('.hymn-uri-ogg').attr("src", data.oggUri);			

			// chalk not finding this out to my lack of html/js experience
			var audio = $("#audioStuff");
			audio.load();
		});		
	}

	$(window).bind('popstate', function event() {
		$('#progress').text("state was popped! IMPLEMENT")	
	});

	function retrieveWeek(week) {
		$('#progress').text("loading...");

		var newURI = "http://localhost:8080/week/"+week
		$('#progress').text("loading "+week);

		history.pushState({}, '', week)

		$.ajax({
			url: newURI
		}).then(function(data, status, jqxhr) {
			$('.week').text(data.week);
			$('.hymn1-text').text(data.hymn1);
			$('.hymn2-text').text(data.hymn2);
			$('.hymn3-text').text(data.hymn3);
		});
	}

	$('.week').on("click", function event() {
		alert("hello, text: " + $(this).text());
		retrieveWeek($(this).text());
	});

	$('[class^="list"]').on("click", function() {
		var whichActive = $(this).parent().find(".active");

		$(this).parent().find(".active").removeClass("active");
		$(this).addClass("active");

		retrieveHymn($(this).first().text());

		if ($(this).is(whichActive)) {
			$('.hymn-div').fadeOut("fast");
			$('.hymn-lyrics').fadeOut("fast");
			$(this).removeClass("active");
		} else {
			$('.hymn-div').fadeIn("fast");
			$('.hymn-lyrics').fadeIn("fast");
		}
	})
});