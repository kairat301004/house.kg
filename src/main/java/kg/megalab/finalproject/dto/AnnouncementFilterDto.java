package kg.megalab.finalproject.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnnouncementFilterDto {
        private String transactionType;
        private String propertyType;
        private Integer roomCount;
        private String residentialComplex;
        private String series;
        private String typeOfStructure;
        private Integer yearOfConstruction;
        private Integer floor;
        private String heating;
        private String state;
        private String location;
        private String region;
        private String city;
        private String streetName;
        private String houseNumber;
        private double priceMin;
        private double priceMax;
        private String currencies;
        private String typeOfPrice;
        private String installmentPlan;
        private String mortgage;
        private String possibilityOfExchange;



}
