//package review;
//
//import java.util.Set;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//
//public class DataLogger implements CommandLineRunner {
//	
//	private static Logger log = LoggerFactory.getLogger(DataLogger.class);
//	
//	private CategoryRepository categoryRepo;
//	private ReviewRepository reviewRepo;
//	
//	public DataLogger(CategoryRepository categoryRepo, ReviewRepository reviewRepo) {
//		this.categoryRepo = categoryRepo;
//		this.reviewRepo = reviewRepo;
//	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Iterable<Review> reviews = reviewRepo.findAll();
//		log.info("Reviews:");
//		for(Review review: reviews) {
//			log.info(review.toString());
//		}
//		
//		Set<Category> categories = categoryRepo.findAll();
//		log.info("Categories:");
//		for(Category category: categories) {
//			String msg = String.format("%s for review %s", category, category.getReviews());
//			log.info(msg);
//		}
//	}
//
//}
