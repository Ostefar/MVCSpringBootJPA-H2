package obligatorisk.opgave.emilwitt.Service;

import obligatorisk.opgave.emilwitt.Model.Movie;
import obligatorisk.opgave.emilwitt.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void save(Movie m) {
        movieRepository.save(m);
    }
}
