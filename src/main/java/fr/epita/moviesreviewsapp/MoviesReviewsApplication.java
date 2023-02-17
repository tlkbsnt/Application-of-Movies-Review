package fr.epita.moviesreviewsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@ComponentScan
@EnableWebSecurity
@SpringBootApplication
@EnableAutoConfiguration
public class MoviesReviewsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoviesReviewsApplication.class, args);
	}
}
