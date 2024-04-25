package co2103.hw2.repo;
import co2103.hw2.model.Trainer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TrainerRepository extends CrudRepository<Trainer, String>{
    List<Trainer> findByName(String name);


}
