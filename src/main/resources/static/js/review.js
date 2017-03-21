$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/all"
    }).then(function(data, status, jqxhr) {
       $('.review-Id').append(data.id);
       $('.review-Title').append(data.title);
       $('.review-imageUrl').append(data.imageUrl);
       $('.review-category').append(data.reviewCategory);
       $('.review-content').append(data.content);
       console.log(jqxhr);
    });
});