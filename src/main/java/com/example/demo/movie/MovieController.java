package com.example.demo.movie;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository repo;

    public MovieController(MovieRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return repo.save(movie);
    }

    @GetMapping("/{id}")
public Movie getMovieById(@PathVariable Long id) {

    return repo.findById(id).orElse(null);
}

@PutMapping("/{id}")
public Movie updateMovie(
        @PathVariable Long id,
        @RequestBody Movie movie) {

    Movie existing =
            repo.findById(id).orElse(null);

    if (existing != null) {

        existing.setTitle(movie.getTitle());
        existing.setGenre(movie.getGenre());
        existing.setDirector(movie.getDirector());

        return repo.save(existing);
    }

    return null;
}

    @GetMapping
    public List<Movie> getMovies() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
public String deleteMovie(@PathVariable Long id) {

    repo.deleteById(id);

    return "Movie Deleted Successfully";
}
}