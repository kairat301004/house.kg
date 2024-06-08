package kg.megalab.finalproject.services;

import jakarta.persistence.criteria.Join;
import kg.megalab.finalproject.dto.AnnouncementFilterDto;
import kg.megalab.finalproject.models.*;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.criteria.Predicate;

public class FilterSpecification {
    public static Specification<Announcement> getAnnouncementsByFilter(AnnouncementFilterDto filterDTO) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (filterDTO.getTransactionType() != null) {
                Join<Announcement, TransactionType> dealTypeJoin = root.join("transactionType");
                predicates.add(criteriaBuilder.equal(dealTypeJoin.get("name"), filterDTO.getTransactionType()));
            }
            if (filterDTO.getPropertyType() != null) {
                Join<Announcement, PropertyType> propertyTypeJoin = root.join("propertyType");
                predicates.add(criteriaBuilder.equal(propertyTypeJoin.get("name"), filterDTO.getPropertyType()));
            }
            if (filterDTO.getRoomCount() != null) {
                Join<Announcement, RoomCount> roomCountJoin = root.join("roomCount");
                predicates.add(criteriaBuilder.equal(roomCountJoin.get("countOfRoom"), filterDTO.getRoomCount()));
            }
            if (filterDTO.getResidentialComplex() != null) {
                Join<Announcement, ResidentialComplex> residentialComplexJoin = root.join("residentialComplex");
                predicates.add(criteriaBuilder.equal(residentialComplexJoin.get("name"), filterDTO.getResidentialComplex()));
            }
            if (filterDTO.getSeries() != null) {
                Join<Announcement, Series> seriesJoin = root.join("series");
                predicates.add(criteriaBuilder.equal(seriesJoin.get("name"), filterDTO.getSeries()));
            }
            if (filterDTO.getTypeOfStructure()!= null) {
                Join<Announcement, TypeOfStructure> buildingTypeJoin = root.join("typeOfStructure");
                predicates.add(criteriaBuilder.equal(buildingTypeJoin.get("name"), filterDTO.getTypeOfStructure()));
            }
            if (filterDTO.getYearOfConstruction() != null) {
                predicates.add(criteriaBuilder.equal(root.get("yearOfConstruction"), filterDTO.getYearOfConstruction()));
            }
            if (filterDTO.getFloor() != null) {
                predicates.add(criteriaBuilder.equal(root.get("floor"), filterDTO.getFloor()));
            }
            if (filterDTO.getHeating() != null) {
                Join<Announcement, Heating> heatingJoin = root.join("heating");
                predicates.add(criteriaBuilder.equal(heatingJoin.get("name"), filterDTO.getHeating()));
            }
            if (filterDTO.getState() != null) {
                Join<Announcement, State> conditionJoin = root.join("state");
                predicates.add(criteriaBuilder.equal(conditionJoin.get("name"), filterDTO.getState()));
            }
            if (filterDTO.getLocation() != null) {
                Join<Announcement, Location> locationJoin = root.join("location");
                predicates.add(criteriaBuilder.equal(locationJoin.get("name"), filterDTO.getLocation()));
            }
            if (filterDTO.getRegion() != null) {
                Join<Location, Location> regionJoin = root.join("location").join("region");
                predicates.add(criteriaBuilder.equal(regionJoin.get("name"), filterDTO.getRegion()));
            }
            if (filterDTO.getCity() != null) {
                Join<Location, Location> cityJoin = root.join("location").join("city");
                predicates.add(criteriaBuilder.equal(cityJoin.get("name"), filterDTO.getCity()));
            }

            if (filterDTO.getStreetName() != null) {
                predicates.add(criteriaBuilder.equal(root.get("streetName"), filterDTO.getStreetName()));
            }
            if (filterDTO.getHouseNumber() != null) {
                predicates.add(criteriaBuilder.equal(root.get("houseNumber"), filterDTO.getHouseNumber()));
            }
            if (filterDTO.getPriceMin() != 0) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("price"), filterDTO.getPriceMin()));
            }

            if (filterDTO.getPriceMax() != 0) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("price"), filterDTO.getPriceMax()));
            }

            if (filterDTO.getCurrencies() != null) {
                Join<Announcement, Currencies> currencyJoin = root.join("currencies");
                predicates.add(criteriaBuilder.equal(currencyJoin.get("name"), filterDTO.getCurrencies()));
            }
            if (filterDTO.getTypeOfPrice() != null) {
                Join<Announcement, TypeOfPrice> priceTypeJoin = root.join("typeOfPrice");
                predicates.add(criteriaBuilder.equal(priceTypeJoin.get("name"), filterDTO.getTypeOfPrice()));
            }
            if (filterDTO.getInstallmentPlan() != null) {
                Join<Announcement, InstallmentPlan> installmentPlanJoin = root.join("installmentPlan");
                predicates.add(criteriaBuilder.equal(installmentPlanJoin.get("possibilityOfInstallments"), filterDTO.getInstallmentPlan()));
            }
            if (filterDTO.getMortgage() != null) {
                Join<Announcement, Mortgage> mortgageJoin = root.join("mortgage");
                predicates.add(criteriaBuilder.equal(mortgageJoin.get("mortgagePossibility"), filterDTO.getMortgage()));
            }
            if (filterDTO.getPossibilityOfExchange() != null) {
                Join<Announcement, PossibilityOfExchange> exchangeOptionJoin = root.join("possibilityOfExchange");
                predicates.add(criteriaBuilder.equal(exchangeOptionJoin.get("status"), filterDTO.getPossibilityOfExchange()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
