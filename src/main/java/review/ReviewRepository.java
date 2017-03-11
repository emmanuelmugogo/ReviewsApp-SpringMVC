package review;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository { 
	
	
	private Map<Long, Review> reviews = new HashMap<Long, Review>();
	
	//constructor
	public ReviewRepository () {
 	    long id = 1l;
		
		Review review = new Review(1, "title", "imageU", "Categ", "cont");
		reviews.put(id, review);
		
		reviews.put(2l, new Review(2, "Iphone", "imageUrl", "mobiele Phones", "calls and Messages"));
		reviews.put(3l, new Review(3, "Bread", "imageUrl", "Food", "Wheat"));
		reviews.put(4l, new Review(4, "Beer", "imageUrl", "drinks", "alcohol and water"));
		reviews.put(5l, new Review(5, "Mazda", "imageUrl", "vehicles", "Metals and Plastics"));
	}
	
	public Collection<Review> findAll() {
			
		return reviews.values(); 
	}
	
	public Review findOne(Long id) {
		
		return reviews.get(id);
	}
	

}
