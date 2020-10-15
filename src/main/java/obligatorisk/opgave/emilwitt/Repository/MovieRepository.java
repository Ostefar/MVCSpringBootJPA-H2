package obligatorisk.opgave.emilwitt.Repository;

import obligatorisk.opgave.emilwitt.Model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
