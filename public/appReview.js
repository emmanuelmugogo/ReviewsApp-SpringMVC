$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8090/reviews/all"
    }).then(function(data) {
    	$.each(data, function(i, item) {
    		
    		$('#enp').append('<p/>' + item.id + '<br>' + item.title + '<br>' + item.imageUrl + '<br>' + item.content);
    		
    	})  
    });
});


//<p id="review-Id">ID -  </p>
//<p id="review-Title">Title - </p>
//<p id="review-imageUrl"> Image - </p>
//<p id="review-category"> Category - </p>
//<p id="review-content"> Content - </p>