package review;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Set<Category> findAll(); //set because it can not contain duplicates
	
}
