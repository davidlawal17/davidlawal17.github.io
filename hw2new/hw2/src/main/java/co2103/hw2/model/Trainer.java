package co2103.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trainer {

    @Id
    private String name;

    @ManyToMany
    private List<Gym> gyms;

    @OneToMany(cascade= CascadeType.ALL, orphanRemoval = true)
    @JoinColumn
    private List <Exercise> exercises;
    @OneToOne
    private Exercise expert;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(List<Gym> gyms) {
        this.gyms = gyms;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Exercise getExpert() {
        return expert;
    }

    public void setExpert(Exercise expert) {
        this.expert = expert;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", exercises=" + exercises +
                ", expert=" + expert +
                '}';
    }
}
