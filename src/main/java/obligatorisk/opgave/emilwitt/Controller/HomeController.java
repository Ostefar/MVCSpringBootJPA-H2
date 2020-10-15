package obligatorisk.opgave.emilwitt.Controller;

import obligatorisk.opgave.emilwitt.Model.Movie;
import obligatorisk.opgave.emilwitt.Repository.MovieRepository;
import obligatorisk.opgave.emilwitt.Repository.ProducerRepository;
import obligatorisk.opgave.emilwitt.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    ProducerRepository producerRepository;
    MovieRepository movieRepository;
    MovieService movieService;

    @GetMapping("/")
    public String index(Model model) {
        Iterable<Movie> movieList = movieRepository.findAll();
        model.addAttribute("movies", movieList);
        return "index";
    }

/*
    @GetMapping("/fillDB")
    public String fillDB(Model model){
        Movie obj = new Movie();
        model.addAttribute("Movie",obj);
        return "fillDB";
    }

    @PostMapping("/fillDB")
    public String fillDB(@ModelAttribute Movie m){
        movieService.save(m);
        System.out.println("success");
        return "redirect:/";
    }*/
}
