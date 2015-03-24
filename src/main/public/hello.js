$(document).ready(function() {
	$.ajax({
		url: "http://localhost:8000/"
	}).then(function(data, status, jqxhr) {
		$('.hymn-uri').append(data.uri);
		$('.hymn-content').append(data.name);
		$('.hymn-name').append(data.lyrics);
		$('.hymn-number').append(data.number);
		console.log(jqxhr);
	});

	$("#search").keypress(function(event) {

		var keycode = (event.keyCode ? event.keyCode : event.which);
		if (keycode == '13') {
			var hymnNum = $(this).val();
			$('#progress').text("loading...");

			var newURI = "http://localhost:8080/hymn/"+hymnNum
			$('#progress').text("loading "+newURI);

			history.pushState({}, '', hymnNum)

			$.ajax({
				url: newURI
			}).then(function(data, status, jqxhr) {
				$('.hymn-name').text(data.name);
				$('.hymn-lyrics').text(data.lyrics);
				$('.hymn-number').text(data.number);
				console.log(jqxhr);
			});		
		}

	});

	$(window).bind('popstate', function event() {
		$('#progress').text("state was popped!")	
	});


});