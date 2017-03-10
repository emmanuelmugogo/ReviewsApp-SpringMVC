package review;

public class Review {
	
	long id;
	String title;
	String imageUrl;
	String reviewCategory;
	String content;
	
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
	
	public String getContent() {
		return content;
	}

	public Review(long id, String title, String imageUrl, String reviewCategory, String content) {
		super();
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.content = content;
	}


}
