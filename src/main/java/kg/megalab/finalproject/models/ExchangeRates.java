package kg.megalab.finalproject.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "exchange_rates")
public class ExchangeRates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double rate;
    @JsonProperty("start_date")
    private Timestamp startDate;
    @JsonProperty("end_date")
    private Timestamp endDate;
    private boolean active;
}
