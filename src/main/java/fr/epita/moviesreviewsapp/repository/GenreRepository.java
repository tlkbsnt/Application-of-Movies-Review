package fr.epita.moviesreviewsapp.repository;

import fr.epita.moviesreviewsapp.domain.Genres;
import org.springframework.data.repository.CrudRepository;


public interface GenreRepository extends CrudRepository<Genres, Integer> {

}
