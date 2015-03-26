$(document).ready(function() {
	$("#search-keypress").keypress(function(event) {

		var keycode = (event.keyCode ? event.keyCode : event.which);
		if (keycode == '13') {
			var hymnNum = $(this).val();
			retrieveHymn(hymnNum);
		}

	});
	
	$("#search-click").click(function(event) {
		var hymnNum = $("#search-keypress").val();
		retrieveHymn(hymnNum);
	});
	
	function retrieveHymn(hymnNum) {
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

	$(window).bind('popstate', function event() {
		$('#progress').text("state was popped! IMPLEMENT")	
	});


});