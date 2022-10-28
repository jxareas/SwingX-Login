package com.jxareas.konnect.repository;

import com.jxareas.konnect.model.Movie;
import com.jxareas.konnect.model.User;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public interface MovieRepository {

    List<Movie> getAll();

    void insert(Movie movie);

    void insertAll(List<Movie> movies);

    boolean exists(Movie movie);

    void deleteById(int movieId);

}
