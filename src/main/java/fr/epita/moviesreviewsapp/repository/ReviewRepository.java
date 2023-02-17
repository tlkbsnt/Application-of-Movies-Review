package fr.epita.moviesreviewsapp.repository;

import java.util.List;

import fr.epita.moviesreviewsapp.domain.Reviews;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface ReviewRepository extends CrudRepository<Reviews, Integer> {
	
	@Query("Select reviews from Reviews reviews where reviews.movieId= :movieId")
	List<Reviews> fetchReviewByMovieId(@Param("movieId") Integer movieId);

}
