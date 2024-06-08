package kg.megalab.finalproject.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "installment_plan")
public class InstallmentPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @JsonProperty("possibility_of_installments")
    String possibilityOfInstallments;
    private boolean active;
}
