package review;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {
	
	@Resource
	ReviewRepository repository;
	
	@RequestMapping("/showReviews")
	public String showAll(Model model) {
		return "reviews";
	}
	
	@RequestMapping("/showReview")
	public String showOne(Long id, Model model) {
		return "review";
	}
	

}
