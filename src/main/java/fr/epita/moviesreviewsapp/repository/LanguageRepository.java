package fr.epita.moviesreviewsapp.repository;

import fr.epita.moviesreviewsapp.domain.Languages;
import org.springframework.data.repository.CrudRepository;



public interface LanguageRepository extends CrudRepository<Languages, Integer> {

}
