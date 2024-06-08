package kg.megalab.finalproject.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "mortgage")
public class Mortgage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @JsonProperty("mortgage_possibility")
    String mortgagePossibility;
    private boolean active;
}
