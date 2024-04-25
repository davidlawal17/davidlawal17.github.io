package co2103.hw2.model;
import jakarta.persistence.*;


@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int identifier;
    private int duration;

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "identifier=" + identifier +
                ", duration=" + duration +
                '}';
    }
}
