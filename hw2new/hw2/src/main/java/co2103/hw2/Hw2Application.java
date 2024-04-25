package co2103.hw2;

import co2103.hw2.model.Exercise;
import co2103.hw2.model.Gym;
import co2103.hw2.model.Trainer;
import co2103.hw2.repo.ExerciseRepository;
import co2103.hw2.repo.GymRepository;
import co2103.hw2.repo.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {

    @Autowired
    private GymRepository repoGym;
    @Autowired
    private ExerciseRepository repoEx;
    @Autowired
    private TrainerRepository repoT;




    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Exercise A = new Exercise();
        A.setDuration(20);
        repoEx.save(A);

        Exercise B = new Exercise();
        B.setDuration(30);
        repoEx.save(B);

      Gym gym1 = new Gym();
      gym1.setLocation("Birmingham");
      repoGym.save(gym1);

      Gym gym2 = new Gym();
      gym2.setLocation("London");
      repoGym.save(gym2);

      Trainer trainer1 = new Trainer();
      trainer1.setExpert(A);
      trainer1.setName("James");
      repoT.save(trainer1);

      Trainer trainer2 = new Trainer();
      trainer2.setExpert(B);
      trainer2.setName("Jacob");
      repoT.save(trainer2);

      gym1.setManager(trainer1);
      gym2.setManager(trainer2);

      gym1.setTrainers(new ArrayList<>());
      gym1.getTrainers().add(trainer1);

      gym2.setTrainers(new ArrayList<>());
      gym2.getTrainers().add(trainer2);

      repoGym.save(gym1);
      repoGym.save(gym2);


     trainer1.setExercises(new ArrayList<Exercise>());
     trainer1.getExercises().add(A);

     trainer2.setExercises(new ArrayList<Exercise>());
     trainer2.getExercises().add(B);

     trainer1.setGyms(new ArrayList<Gym>());
     trainer1.getGyms().add(gym1);

     trainer2.setGyms(new ArrayList<Gym>());
     trainer2.getGyms().add(gym1);

     repoT.save(trainer1);
     repoT.save(trainer2);












    }

}