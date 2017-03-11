package review;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {
	
	@Resource
	ReviewRepository repositorys;
	
	@RequestMapping("/showReviews")
	public String showAll(Model model) {
		model.addAttribute("repositorys", repositorys.findAll());
		return "reviews";
	}
	
	@RequestMapping("/showReview")
	public String showOne(Long id, Model model) {
		model.addAttribute("repositorys", repositorys.findOne(id));
		return "review";
	}
	

}
