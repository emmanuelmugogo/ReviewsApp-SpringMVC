package review;

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
	private Review review;
	
	//constructor for spring
	private Category() {   	
	}
	
	//constructor
	public Category(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public Review getReview() {
		return review;
	}

	@Override
	public String toString() {
		return "Category Title" + categoryTitle;
	}
}
