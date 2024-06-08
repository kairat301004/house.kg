package kg.megalab.finalproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "announcement")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonProperty("street_name")
    private String streetName;
    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("year_of_construction")
    private Integer yearOfConstruction;
    private Integer floor;
    private Double price;
    @JsonProperty("price_min")
    private Double priceMin;
    @JsonProperty("price_max")
    private Double priceMax;
    @ManyToOne
    @JoinColumn(name = "id_type_of_price")
    private TypeOfPrice typeOfPrice;

    @ManyToOne()
    @JoinColumn(name = "id_transaction_type")
    private TransactionType transactionType;

    @ManyToOne()
    @JoinColumn(name = "id_property_type")
    private PropertyType propertyType;

    @ManyToOne()
    @JoinColumn(name = "id_room_count")
    private RoomCount roomCount;

    @ManyToOne()
    @JoinColumn(name = "id_series")
    private Series series;

    @ManyToOne()
    @JoinColumn(name = "id_residential_complex")
    private ResidentialComplex residentialComplex;

    @ManyToOne()
    @JoinColumn(name = "id_state")
    private State state;

    @ManyToOne()
    @JoinColumn(name = "id_type_of_structure")
    private TypeOfStructure typeOfStructure;

    @ManyToOne()
    @JoinColumn(name = "id_possibility_of_exchange")
    private PossibilityOfExchange possibilityOfExchange;

    @ManyToOne()
    @JoinColumn(name = "id_heating")
    private Heating heating;

    @ManyToOne()
    @JoinColumn(name = "id_mortgage")
    private Mortgage mortgage;

    @ManyToOne()
    @JoinColumn(name = "id_installment_plan")
    private InstallmentPlan installmentPlan;

    @ManyToOne()
    @JoinColumn(name = "id_location")
    private Location location;
    @ManyToOne()
    @JoinColumn(name = "id_currencies")
    private Currencies currencies;

    @Transient
    private Integer typeOfPriceId;
    @Transient
    private Integer transactionTypeId;
    @Transient
    private Integer propertyTypeId;
    @Transient
    private Integer roomCountId;
    @Transient
    private Integer seriesId;
    @Transient
    private Integer residentialComplexId;
    @Transient
    private Integer stateId;
    @Transient
    private Integer typeOfStructureId;
    @Transient
    private Integer possibilityOfExchangeId;
    @Transient
    private Integer heatingId;
    @Transient
    private Integer mortgageId;
    @Transient
    private Integer installmentPlanId;
    @Transient
    private Integer locationId;
    @Transient
    private Integer currenciesId;
}

