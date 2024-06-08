package kg.megalab.finalproject.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "possibility_of_exchange")
public class PossibilityOfExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String status;
    private boolean active;
}
