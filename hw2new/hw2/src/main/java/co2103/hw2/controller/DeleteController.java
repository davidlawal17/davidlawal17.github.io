package co2103.hw2.controller;
import co2103.hw2.model.Gym;
import co2103.hw2.model.Trainer;
import co2103.hw2.model.Exercise;

import co2103.hw2.repo.ExerciseRepository;
import co2103.hw2.repo.GymRepository;
import co2103.hw2.repo.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;


@Controller
public class DeleteController {
    @Autowired
    private GymRepository repoGym;
    @Autowired
    private ExerciseRepository repoEx;
    @Autowired
    private TrainerRepository repoT;

    @GetMapping("/deleteGym")
    public String deleteGym(@RequestParam int Gym) {
        if(repoGym.findById(Gym).isPresent()) {
            repoGym.delete(repoGym.findById(Gym).get());
        }
        return "redirect:/list";

    }

    @GetMapping("/deleteTrainer")
    public String deleteTrainer(@RequestParam String name) {
        // list for the manager
        //list for the trainers
        List<Gym> managername = repoGym.findByManager_Name(name);

        List<Trainer> trainers_ = repoT.findByName(name);

       for (Trainer trainer :  trainers_) {
           for (Gym gym : managername) {
               if (gym.getManager().equals(name)) {
                   gym.setManager(null);
                   repoGym.save(gym);
               }
               if (trainer.getName().equals(name)) {
                   trainers_.remove(trainer);
               }

           }
       }
        return "redirect:/list";

    }


}
