$(document).ready(function() {

	$.ajax({
		url: "https://"+window.location.host+"/week/all"
	}).then(function(data, status, jqkhr) {

		$(data).each(function(index, value) {
			$('#dropdown-list').append(
					"<a role=\"menuitem\" tabindex=\"" + index + "\" class=\"week\" href=\"#\">" + 
					value.date + "</a>"
			);	
		})
	});

	function retrieveHymn(hymn) {
		var newURI = "https://"+window.location.host+"/hymn/"+hymn

		// for when I get pushState-like functionality working
		// get current url, and append the hymn to it
		//history.pushState({}, '', hymn)

		$.ajax({
			url: newURI
		}).then(function(data, status, jqxhr) {
			$('#hymn-name').text(data.name);
			$('#hymn-lyrics').load(data.lyrics);
			$('#hymn-number').text(data.number);

			$('#hymn-uri-mp3').attr("src", data.mp3Uri);
			$('#hymn-uri-ogg').attr("src", data.oggUri);			

			// chalk not finding this out to my lack of html/js experience
			var audio = $("#audioBar");
			audio.load();
		});		
	}

	$(window).bind('popstate', function event() {
		$('#progress').text("state was popped! IMPLEMENT")	
	});

	function retrieveWeek(week) {
		$('#progress').text("loading...");

		var newURI = "https://"+window.location.host+"/week/"+week
		$('#progress').text("loading "+week);

		// for when I get pushState-like functionality working
		//history.pushState({}, '', week)

		$.ajax({
			url: newURI
		}).then(function(data, status, jqxhr) {
			$('.week').text(data.week);
			$('#hymn1-text').text(data.hymn1);
			$('#hymn2-text').text(data.hymn2);
			$('#hymn3-text').text(data.hymn3);
		});
	}

	$('#dropdown-list').on('click', '.week', function() {	
			unselectHymn();
			retrieveWeek($(this).text());
	});
	

	$('[class^="list"]').on("click", function() {
		var whichActive = $(this).parent().find(".active");

		$(this).parent().find(".active").removeClass("active");
		$(this).addClass("active");

		retrieveHymn($(this).first().text());

		if ($(this).is(whichActive)) {
			unselectHymn();
		} else {
			$('#hymn-div').fadeIn("fast");
			$('#hymn-lyrics').fadeIn("fast");
		}
	})
	
	function unselectHymn() {
		$('.active').removeClass('active');
		$('#hymn-div').fadeOut("fast");
		$('#hymn-lyrics').fadeOut("fast");
	}
});