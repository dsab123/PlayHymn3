$(document).ready(function() {

	$.ajax({
		url: "http://"+window.location.host+"/week/all"
	}).then(function(data, status, jqkhr) {

		$(data).each(function(index, value) {
			// in order to reference the index from inside value
			value.index = index;			
			
			$.get('templates.html', function(data) {
				var template = $(data).filter("#week_snippet").html();
				var html = Mustache.render(template, value);
				$('#dropdown-list').append(html);				
			});
		})
	});

	function retrieveHymn(hymn) {
		var newURI = "http://"+window.location.host+"/hymn/"+hymn

		// for when I get pushState-like functionality working
		// get current url, and append the hymn to it
		//history.pushState({}, '', hymn)

		$.ajax({
			url: newURI
		}).then(function(data, status, jqxhr) {
			$('#hymn-name').text(data.name);
			$('#hymn-number').text(data.number);

			$('#hymn-lyrics').load(data.lyrics);
			$('#hymn-lyrics').val().replace("\n", "<br>", "g");
			
			$('#hymn-uri-mp3').attr("src", data.mp3Uri);
			$('#hymn-uri-ogg').attr("src", data.oggUri);			

			var audio = $("#audioBar");
			audio.load();
		});		
	}

	$(window).bind('popstate', function event() {
		$('#progress').text("state was popped! IMPLEMENT")	
	});

	function retrieveWeek(week) {
		$('#progress').text("loading...");

		var newURI = "http://"+window.location.host+"/week/"+week
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

	$('#dropdown-list').on('click', '.week', function(event) {
		var week = $(this).text();	
		unselectHymn();
		retrieveWeek(week);
			
		// going overboard with the templating, am I?
		$.get('templates.html', function(data) {
			var template = $(data).filter("#week_heading").html();
			console.log(week);
			var html = Mustache.render(template, week);
			$('#dropdownMenu1').html(html);
		});			
	});
	

	$('[class^="list"]').on("click", function(event) {
		event.preventDefault();
		event.stopPropagation();
		
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