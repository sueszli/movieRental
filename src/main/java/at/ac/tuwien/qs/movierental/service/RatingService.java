package at.ac.tuwien.qs.movierental.service;

import at.ac.tuwien.qs.movierental.entity.Movie;
import at.ac.tuwien.qs.movierental.exceptions.NoMovieFoundException;
import at.ac.tuwien.qs.movierental.exceptions.ServiceNotAvailableException;
import at.ac.tuwien.qs.movierental.exceptions.TooManyMoviesFound;

public interface RatingService {

    /**
     * Look up the rating for a movie in a service.
     *
     * @param movie which should be looked up in the database
     * @return the rating for the movie between 0 an 5
     * @throws TooManyMoviesFound           if more than one matching movie is found
     * @throws NoMovieFoundException        if no matching movies are found
     * @throws ServiceNotAvailableException if the underlying service is not available or malfunctioning
     */
    Float loadRatingForMovie(Movie movie) throws TooManyMoviesFound, NoMovieFoundException, ServiceNotAvailableException;

}
