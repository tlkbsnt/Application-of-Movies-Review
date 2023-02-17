package fr.epita.moviesreviewsapp.repository;

import fr.epita.moviesreviewsapp.domain.Movies;
import org.springframework.data.repository.CrudRepository;


public interface MoviesRepository extends CrudRepository<Movies, Integer> {

}
