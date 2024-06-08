package kg.megalab.finalproject.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_region")
    private Location region;

    @ManyToOne
    @JoinColumn(name = "id_city")
    private Location city;

    @OneToMany(mappedBy = "region")
    private Set<Location> locations;

    @OneToMany(mappedBy = "city")
    private Set<Location> cities;

    private boolean active;




}

