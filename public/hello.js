$(document).ready(function() {
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

	function retrieveHymn(hymn, whichHymn) {
		$('#progress').text("loading...");

		var newURI = "http://localhost:8080/hymn/"+hymn
		$('#progress').text("loading "+newURI);

		history.pushState({}, '', hymn)

		$.ajax({
			url: newURI
		}).then(function(data, status, jqxhr) {
			$('.hymn-'+whichHymn+'-name').text(data.name);
			$('.hymn-'+whichHymn+'-lyrics').text(data.lyrics);
			$('.hymn-'+whichHymn+'-number').text(data.number);
			console.log(jqxhr);
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
			$('.active-hymn1-text').text(data.hymn1);
			$('.active-hymn2-text').text(data.hymn2);
			$('.active-hymn3-text').text(data.hymn3);
			console.log(jqxhr);
		});
	}

	$('.active-hymn1').click(function(event) {
		$('.hymn-1-div').slideToggle("fast");
		$('.hymn-1-lyrics').slideToggle("fast");
		
		if ($('.hymn-1-div').is(':visible')) {
			retrieveHymn($(this).text(), 1);
		}
	});
	
	$('.active-hymn2').click(function(event) {
		$('.hymn-2-div').toggle("fast");
		$('.hymn-2-lyrics').slideToggle("fast");

		if ($('.hymn-2-div').is(':visible')) {
			retrieveHymn($(this).text(), 2);
		}
	});
	
	$('.active-hymn3').click(function(event) {
		$('.hymn-3-div').toggle("fast");
		$('.hymn-3-lyrics').slideToggle("fast");

		
		if ($('.hymn-3-div').is(':visible')) {
			retrieveHymn($(this).text(), 3);
		}
	});

	$('.week').click(function event() {
		retrieveWeek($(this).text());
	});



});