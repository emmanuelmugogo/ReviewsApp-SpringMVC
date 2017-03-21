package review;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	// mappedBy: because in the database, things point the other direction
	// mappedBy "category" is referring to Categories.review
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> reviews;  //this need to be a Collection of Review instances
	
	//constructor for spring
	private Category() {   	
	}
	
	//constructor
	public Category(String categoryTitle, Collection<Review> reviews) {
		this.title = categoryTitle;
		this.reviews = reviews;
	}

	public String getTitle() {
		return title;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	

	@Override
	public String toString() {
		return "Category Title" + title;
	}

	
}
