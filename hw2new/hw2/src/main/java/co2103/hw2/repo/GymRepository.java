package co2103.hw2.repo;
import co2103.hw2.model.Gym;
import co2103.hw2.model.Trainer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface GymRepository extends CrudRepository<Gym, Integer>  {
    List<Gym> findByLocation(String location);
    List<Gym> findByManager_Name(String name);



}
