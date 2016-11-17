package sk.tnet.cloud;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author bystriansky
 *
 */
@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {
	@Query("select b from Book b order by RAND()")
	List<Book> getBooksRandomOrder();
}
