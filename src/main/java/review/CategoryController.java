package review;

import java.util.Collection;
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
@RequestMapping(value = "/categories")
public class CategoryController {
	
	@Resource
	CategoryRepository categories;
	
	@RequestMapping
	public Set<Category> showCategories() {
		return categories.findAll();
		
	}
	
	@RequestMapping("/{id}")
	public DetailedCategory showCategory(@PathVariable Long id) {
		return new DetailedCategory(categories.findOne(id));
	}

	@RequestMapping("/search/{categoryTitle}")
	public List<Category> showCategoriesByTitle(@PathVariable final String categoryTitle) {
		return categories.findByTitle(categoryTitle);
	}
	
	@PostMapping(value = "/loadCategory")
	public List<Category> load(@RequestBody final Category category) {
		categories.save(category);
		return categories.findByTitle(category.getTitle());
	}
	
	public static class DetailedCategory {

		private Category category;

		public DetailedCategory(Category category) {
			this.category = category;
		}

		public Category getCategory() {
			return category;
		}
		
		public Collection<Review> getReviews() {
			return category.getReviews();
		}
	}
}
