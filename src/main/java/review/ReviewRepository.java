package review;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
	
	List<Review> findByTitle(String Title);
	
	List<Review> findAll();
	
	Review findOne(Long id);
	
}






//@Component
//public class ReviewRepository { 
//	
//	
//	private Map<Long, Review> reviews = new HashMap<Long, Review>();
//	
//	//constructor
//	public ReviewRepository () {
// 	    long id = 1l;
//		
//		Review review = new Review(1, "Chucky", "/images/chucky.jpg", "Toys", "Stuff'd animal!");
//		reviews.put(id, review);
//		
//		reviews.put(2l, new Review(2, "Iphone", "/images/phone.jpg", "mobiele Phones", "calls and Messages"));
//		reviews.put(3l, new Review(3, "Bread", "/images/bread.jpg", "Food", "Wheat"));
//		reviews.put(4l, new Review(4, "Beer", "/images/beer.jpg", "drinks", "alcohol and water"));
//		reviews.put(5l, new Review(5, "Mazda", "/images/mazda.jpg", "vehicles", "Metals and Plastics"));
//		reviews.put(6l, new Review(6, "Rolex", "/images/rolex.jpg", "Watches", "Expensive stuff just put together"));
//	}
//	
//	public Collection<Review> findAll() {
//			
//		return reviews.values(); 
//	}
//	
//	public Review findOne(Long id) {
//		
//		return reviews.get(id);
//	}
//	
//
//}
