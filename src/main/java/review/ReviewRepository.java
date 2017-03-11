package review;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository { 
	
	
	private Map<Long, Review> reviews = new HashMap<Long, Review>();
	
	//contructor
	public ReviewRepository () {
 	    long id = 42l;
		
		Review review = new Review(2, "title", "imageU", "Categ", "cont");
		reviews.put(id, review);
	}
	
	public Collection<Review> findAll() {
			
		return reviews.values(); 
	}
	
	public Review findOne(Long id) {
		
		return reviews.get(id);
	}
	

}
