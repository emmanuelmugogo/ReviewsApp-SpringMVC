$(document).ready(function() {
    $.ajax({
        url: "/reviews/all"
    }).then(function(data) {
    	$.each(data, function(i, item) {
    		$('.review-Id').append(item.id);
    	    $('.review-Title').append(item.title);
    	    $('.review-imageUrl').append(item.imageUrl);
    	    $('.review-content').append(item.content);
    	})  
    });
});

//$(document).ready(function() {
//	var id = $('#review-Id');
//	var title = $('#review-Title');
//	var imageUrl = $('#review-imageUrl');
//	var content = $('#review-content');
//	
//	$.get('/reviews/all', function(data, status){
//
//            for(var i=0; i<data.length; i++){
//                var rId = data.id;
//                var rTitle = data.title;
//                var rImageUrl = data.imageUrl;
//                var rContent = data.content;
//                
//                
//                id.append(rId);
//                title.append(rTitle);
//                imageUrl.append(rImageUrl);
//                content.append(rContent);
//            
//            }
//             
//    });
//	
//});