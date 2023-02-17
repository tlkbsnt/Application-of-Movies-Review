package fr.epita.moviesreviewsapp.repository;

import java.util.List;

import fr.epita.moviesreviewsapp.domain.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	@Query("Select user from UserEntity user where user.emailId = :emailId and user.active='Y'")
	List<UserEntity> fetchUserByEmailId(@Param("emailId") String emailId);
}
