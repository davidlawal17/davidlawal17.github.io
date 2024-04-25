package co2103.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // primary key
    private String location;


    @ManyToMany(mappedBy = "gyms" , cascade =CascadeType.PERSIST)
    private List<Trainer> trainers;

    @OneToOne
    private Trainer manager;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Trainer getManager() {
        return manager;
    }

    public void setManager(Trainer manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", trainers=" + trainers +
                ", manager=" + manager +
                '}';
    }
}
