package review;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/Categories")
public class CategoryController {
	
	@Resource
	CategoryRepository categories;
	
	@GetMapping("/allCategories")
	public Set<Category> showCategories() {
		return categories.findAll();
		
	}
	
	@RequestMapping("/{id}")
	public Category showCategory(@PathVariable Long id) {
		return categories.findOne(id);
	}

	@RequestMapping("/{categoryTitle}")
	public List<Category> showCategoriesByTitle(@PathVariable final String categoryTitle) {
		return categories.findByTitle(categoryTitle);
	}
	
	@PostMapping(value = "/loadCategory")
	public List<Category> load(@RequestBody final Category category) {
		categories.save(category);
		return categories.findByTitle(category.getTitle());
	}
}
