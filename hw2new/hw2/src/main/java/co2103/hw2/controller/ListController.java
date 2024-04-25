package co2103.hw2.controller;
import co2103.hw2.model.Gym;
import co2103.hw2.model.Trainer;
import co2103.hw2.model.Exercise;
import co2103.hw2.repo.GymRepository;
import co2103.hw2.repo.TrainerRepository;
import co2103.hw2.repo.ExerciseRepository;
import co2103.hw2.Hw2Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.List;

import static co2103.hw2.Hw2Application.*;


@Controller
public class ListController {

    @Autowired
    private GymRepository repoGym;
    @Autowired
    private ExerciseRepository repoEx;
    @Autowired
    private TrainerRepository repoT;

    @GetMapping("/listGym")
    public String gyms(Model model) {
        model.addAttribute("data", repoGym.findAll());
        return "/list";
    }

    @GetMapping("/listTrainer")
    public String trainers(Model model) {
        model.addAttribute("data", repoT.findAll());
        return "/list";
    }

    @GetMapping("/listExercise")
    public String Exercises(Model model) {
        model.addAttribute("data", repoEx.findAll());
        return "/list";
    }




}
