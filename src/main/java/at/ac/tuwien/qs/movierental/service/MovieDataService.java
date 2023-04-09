package at.ac.tuwien.qs.movierental.service;

import at.ac.tuwien.qs.movierental.entity.Movie;
import at.ac.tuwien.qs.movierental.exceptions.ServiceNotAvailableException;

import java.util.List;

public interface MovieDataService {

    /**
     * Lookup a given movie in a service and fill as many fields as possible.
     * The fields have to be valid.
     *
     * @param movie which should be looked up
     * @return a list of matching movies
     * @throws ServiceNotAvailableException if the underlying service is not available or malfunctioning
     */
    List<Movie> searchMovies(Movie movie) throws ServiceNotAvailableException;

}
