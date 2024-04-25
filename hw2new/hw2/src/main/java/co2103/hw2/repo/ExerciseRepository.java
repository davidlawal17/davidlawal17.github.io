package co2103.hw2.repo;
import org.springframework.data.repository.CrudRepository;
import co2103.hw2.model.Exercise;

import java.util.List;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {
    List<Exercise> findByDuration(int duration);

}
