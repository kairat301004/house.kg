package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.Announcement;
import kg.megalab.finalproject.models.TypeOfPrice;
import kg.megalab.finalproject.repository.*;
import kg.megalab.finalproject.services.AnnouncementCreateService;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementCreateServiceImpl implements AnnouncementCreateService {
    private final AnnouncementRepo announcementRepo;
    private final TypeOfPriceRepo typeOfPriceRepo;
    private final TransactionTypeRepo transactionTypeRepo;
    private final PropertyTypeRepo propertyTypeRepo;
    private final RoomCountRepo roomCountRepo;
    private final SeriesRepo seriesRepo;
    private final ResidentialComplexRepo residentialComplexRepo;
    private final StateRepo stateRepo;
    private final TypeOfStructureRepo typeOfStructureRepo;
    private final PossibilityOfExchangeRepo possibilityOfExchangeRepo;
    private final HeatingRepo heatingRepo;
    private final MortgageRepo mortgageRepo;
    private final InstallmentPlanRepo installmentPlanRepo;
    private final LocationRepo locationRepo;
    private final CurrenciesRepo currenciesRepo;

    public AnnouncementCreateServiceImpl(AnnouncementRepo announcementRepo, TypeOfPriceRepo typeOfPriceRepo, TransactionTypeRepo transactionTypeRepo, PropertyTypeRepo propertyTypeRepo, RoomCountRepo roomCountRepo, SeriesRepo seriesRepo, ResidentialComplexRepo residentialComplexRepo, StateRepo stateRepo, TypeOfStructureRepo typeOfStructureRepo, PossibilityOfExchangeRepo possibilityOfExchangeRepo, HeatingRepo heatingRepo, MortgageRepo mortgageRepo, InstallmentPlanRepo installmentPlanRepo, LocationRepo locationRepo, CurrenciesRepo currenciesRepo) {
        this.announcementRepo = announcementRepo;
        this.typeOfPriceRepo = typeOfPriceRepo;
        this.transactionTypeRepo = transactionTypeRepo;
        this.propertyTypeRepo = propertyTypeRepo;
        this.roomCountRepo = roomCountRepo;
        this.seriesRepo = seriesRepo;
        this.residentialComplexRepo = residentialComplexRepo;
        this.stateRepo = stateRepo;
        this.typeOfStructureRepo = typeOfStructureRepo;
        this.possibilityOfExchangeRepo = possibilityOfExchangeRepo;
        this.heatingRepo = heatingRepo;
        this.mortgageRepo = mortgageRepo;
        this.installmentPlanRepo = installmentPlanRepo;
        this.locationRepo = locationRepo;
        this.currenciesRepo = currenciesRepo;
    }



    @Override
    public Announcement filterAnnouncement(Announcement announcement) {
        if (announcement.getTypeOfPriceId() != null) {
            announcement.setTypeOfPrice(typeOfPriceRepo.findById(announcement.getTypeOfPriceId()).orElse(null));
        }
        if (announcement.getTransactionTypeId() != null) {
            announcement.setTransactionType(transactionTypeRepo.findById(announcement.getTransactionTypeId()).orElse(null));
        }
        if (announcement.getPropertyTypeId() != null) {
            announcement.setPropertyType(propertyTypeRepo.findById(announcement.getPropertyTypeId()).orElse(null));
        }
        if (announcement.getRoomCountId() != null) {
            announcement.setRoomCount(roomCountRepo.findById(announcement.getRoomCountId()).orElse(null));
        }
        if (announcement.getSeriesId() != null) {
            announcement.setSeries(seriesRepo.findById(announcement.getSeriesId()).orElse(null));
        }
        if (announcement.getResidentialComplexId() != null) {
            announcement.setResidentialComplex(residentialComplexRepo.findById(announcement.getResidentialComplexId()).orElse(null));
        }
        if (announcement.getStateId() != null) {
            announcement.setState(stateRepo.findById(announcement.getStateId()).orElse(null));
        }
        if (announcement.getTypeOfStructureId() != null) {
            announcement.setTypeOfStructure(typeOfStructureRepo.findById(announcement.getTypeOfStructureId()).orElse(null));
        }
        if (announcement.getPossibilityOfExchangeId() != null) {
            announcement.setPossibilityOfExchange(possibilityOfExchangeRepo.findById(announcement.getPossibilityOfExchangeId()).orElse(null));
        }
        if (announcement.getHeatingId() != null) {
            announcement.setHeating(heatingRepo.findById(announcement.getHeatingId()).orElse(null));
        }
        if (announcement.getMortgageId() != null) {
            announcement.setMortgage(mortgageRepo.findById(announcement.getMortgageId()).orElse(null));
        }
        if (announcement.getInstallmentPlanId() != null) {
            announcement.setInstallmentPlan(installmentPlanRepo.findById(announcement.getInstallmentPlanId()).orElse(null));
        }
        if (announcement.getLocationId() != null) {
            announcement.setLocation(locationRepo.findById(announcement.getLocationId()).orElse(null));
        }
        if (announcement.getCurrenciesId() != null) {
            announcement.setCurrencies(currenciesRepo.findById(announcement.getCurrenciesId()).orElse(null));
        }

        return announcementRepo.save(announcement);
    }

}

