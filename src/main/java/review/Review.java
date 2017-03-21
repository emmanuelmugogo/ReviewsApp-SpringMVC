package review;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String imageUrl;
	private String reviewCategory;
	private String content;
	
	@OneToMany(targetEntity = Category.class) 
	private Collection<Category> categories;
	
	//spring jpa requires no arg constructor
	protected Review() {
		
	}
	
	
	
	public Review(String title, String imageUrl, String reviewCategory, String content,
			Collection<Category> categories) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.categories = categories;
	}

	@Override
	public String toString() {
		return String.format("Review[id=%d, title='%s', imageUrl='%s', reviewCategory='%s', content='%s', categories='%s']", id, title, imageUrl, reviewCategory, content, categories);
	}


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
	
	public Collection<Category> getCategories() {
		return categories;
	}

}
