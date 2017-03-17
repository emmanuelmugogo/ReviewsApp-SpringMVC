package review;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String categoryTitle;
	
	@ManyToOne
	private Collection<Review> reviews;  //this need to be a Collection of Review instances
	
	//constructor for spring
	private Category() {   	
	}
	
	//constructor
	public Category(String categoryTitle, Collection<Review> reviews) {
		this.categoryTitle = categoryTitle;
		this.reviews = reviews;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	

	@Override
	public String toString() {
		return "Category Title" + categoryTitle;
	}

	
}
