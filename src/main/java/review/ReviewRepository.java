package review;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

public class ReviewRepository { 
	
	@Resource
	private Map<Long, Review> reviews;
	
	public Collection<Review> findAll() {
		
		
		return null;
	}
	
	public Review findOne(Long id) {
		return null;
	}
	

}
