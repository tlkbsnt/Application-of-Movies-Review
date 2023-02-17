package fr.epita.moviesreviewsapp.repository;

import java.util.List;

import fr.epita.moviesreviewsapp.domain.Ratings;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface RatingsRepository extends CrudRepository<Ratings, Integer> {
	
	@Query("Select rating from Ratings rating where rating.movieId= :movieId")
	List<Ratings> fetchRatingByMovieId(@Param("movieId") Integer movieId);

}
