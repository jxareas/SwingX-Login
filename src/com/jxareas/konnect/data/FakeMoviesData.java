package com.jxareas.konnect.data;

import com.jxareas.konnect.model.Movie;
import com.jxareas.konnect.model.User;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class FakeMoviesData {
  
    public static List<Movie> fakeMovies = Arrays.asList(
            new Movie(1, "Terrifier 2", "After being resurrected by a sinister entity, Art the Clown returns to Miles County where he must hunt down and destroy a teenage girl and her younger brother on Halloween night.  As the body count rises, the siblings fight to stay alive while uncovering the true nature of Art's evil intent."),
            new Movie(2, "Black Adam", "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world."),
            new Movie(3, "Jeepers Creepers: Reborn", "Forced to travel with her boyfriend to a horror festival, Laine begins to experience disturbing visions associated with the urban legend of The Creeper. As the festival arrives and the blood-soaked entertainment builds to a frenzy, she becomes the center of it while something unearthly has been summoned.")
    );
}
