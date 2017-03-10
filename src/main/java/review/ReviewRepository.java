package review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		
//		Collection<Review> reviewList = new ArrayList<Review>();
//		
//		//iterating inside my map and put review objects to a list
//		 Iterator <Entry<Long,Review>> iterator = reviews.entrySet().iterator();
//		    while (iterator.hasNext()) {
//		        Map.Entry<Long,Review> entry = (Map.Entry<Long, Review>) iterator.next();
//		        
//		        reviewList.add(entry.getValue());
//		    }
//		    
		
		
		Collection col = reviews.values(); 
		
 		
		return col;
	}
	
	public Review findOne(Long id) {
		
		Review review = reviews.get(id);
		
		return review;
	}
	

}
