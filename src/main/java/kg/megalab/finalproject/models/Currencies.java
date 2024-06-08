package kg.megalab.finalproject.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "currencies")
public class Currencies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private boolean active;
}
