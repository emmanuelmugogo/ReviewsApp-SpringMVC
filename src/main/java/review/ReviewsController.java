package review;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {
	
	@Resource
	ReviewRepository reviewRepository;
	
	@CrossOrigin(origins = "http://localhost:8090")
	@GetMapping(value = "/all")
	public List<Review> showAll() {
		return reviewRepository.findAll();
	}
	
	@RequestMapping("/{title}")
	public List<Review> showReviewByTitle(@PathVariable final String title) {
		return reviewRepository.findByTitle(title);
	}
	
	@GetMapping(value = "/{id}")
	public Review showReview(@PathVariable Long id)	{
		return reviewRepository.findOne(id);
	}
	
	@PostMapping(value = "/load")
	public List<Review> load(@RequestBody final Review review) {
		reviewRepository.save(review);
		return reviewRepository.findByTitle(review.getTitle());
	}
	

}
