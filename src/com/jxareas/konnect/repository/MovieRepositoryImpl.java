package com.jxareas.konnect.repository;

import com.jxareas.konnect.data.FakeMoviesData;
import com.jxareas.konnect.model.Movie;
import com.jxareas.konnect.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class MovieRepositoryImpl implements MovieRepository {

    private static List<Movie> movieList = new ArrayList<>(FakeMoviesData.fakeMovies);

    @Override
    public List<Movie> getAll() {
        return movieList;
    }

    @Override
    public void insert(Movie movie) {
        movieList.add(movie);
    }

    @Override
    public void insertAll(List<Movie> movies) {
        movieList.addAll(movies);
    }

    @Override
    public boolean exists(Movie movie) {
        return movieList.stream()
                .anyMatch(currentMovie -> currentMovie.equals(movie));
    }

    @Override
    public void deleteById(int movieId) {
        movieList.removeIf(user -> user.getId() == movieId);
    }

}
