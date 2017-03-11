package review;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {
	
	@Resource
	ReviewRepository repositories;
	
	@RequestMapping("/showReviews")
	public String showAll(Model model) {
		model.addAttribute("repositories", repositories.findAll());
		return "reviews";
	}
	
	@RequestMapping("/showReview")
	public String showOne(@RequestParam ("id") Long id, Model model) {
		model.addAttribute("repositories", repositories.findOne(id));
		return "review";
	}
	

}
