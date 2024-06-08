package kg.megalab.finalproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import kg.megalab.finalproject.models.*;
import kg.megalab.finalproject.services.*;
import kg.megalab.finalproject.services.impl.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GetAllController {

    private final TypeOfPriceGetServiceImpl typeOfPriceGetService;
    private final TypeOfStructureServicesImpl typeOfStructureServices;
    private final ExchangeRatesGetServiceImpl exchangeRatesGetService;
    private final CurrenciesGetServiceImpl currenciesGetService;
    private final TransactionTypeGetServiceImpl transactionTypeGetService;
    private final PropertyTypeGetServiceImpl propertyTypeGetService;
    private final RoomCountGetServiceImpl roomCountGetService;
    private final SeriesGetServiceImpl seriesGetService;
    private final StateGetServiceImpl stateGetService;
    private final ResidentialComplexGetServiceImpl residentialComplexGetService;
    private final PossibilityOfExchangeGetServiceImpl possibilityOfExchangeGetService;
    private final HeatingGetServiceImpl heatingGetService;
    private final MortgageGetServiceImpl mortgageGetService;
    private final InstallmentPlanGetServiceImpl installmentPlanGetService;
    private final LocationGetServiceImpl locationService;

    public GetAllController(TypeOfPriceGetServiceImpl typeOfPriceGetService, TypeOfStructureServicesImpl typeOfStructureServices, ExchangeRatesGetServiceImpl exchangeRatesGetService, CurrenciesGetServiceImpl currenciesGetService, TransactionTypeGetServiceImpl transactionTypeGetService, PropertyTypeGetServiceImpl propertyTypeGetService, RoomCountGetServiceImpl roomCountGetService, SeriesGetServiceImpl seriesGetService, StateGetServiceImpl stateGetService, ResidentialComplexGetServiceImpl residentialComplexGetService, PossibilityOfExchangeGetServiceImpl possibilityOfExchangeGetService, HeatingGetServiceImpl heatingGetService, MortgageGetServiceImpl mortgageGetService, InstallmentPlanGetServiceImpl installmentPlanGetService, LocationGetServiceImpl locationService) {
        this.typeOfPriceGetService = typeOfPriceGetService;
        this.typeOfStructureServices = typeOfStructureServices;
        this.exchangeRatesGetService = exchangeRatesGetService;
        this.currenciesGetService = currenciesGetService;
        this.transactionTypeGetService = transactionTypeGetService;
        this.propertyTypeGetService = propertyTypeGetService;
        this.roomCountGetService = roomCountGetService;
        this.seriesGetService = seriesGetService;
        this.stateGetService = stateGetService;
        this.residentialComplexGetService = residentialComplexGetService;
        this.possibilityOfExchangeGetService = possibilityOfExchangeGetService;
        this.heatingGetService = heatingGetService;
        this.mortgageGetService = mortgageGetService;
        this.installmentPlanGetService = installmentPlanGetService;
        this.locationService = locationService;
    }


    @Operation(summary = "Метод для получения выпадающего списка типа цены")
    @GetMapping("/getAll/from/type-of-price")
    public ResponseEntity<List<TypeOfPrice>> getAllFromTypeOfPrice(){
        List<TypeOfPrice> typeOfPriceList = typeOfPriceGetService.getAllFromTypeOfPrice();
        return ResponseEntity.ok(typeOfPriceList);
    }
    @Operation(summary = "Метод для получения выпадающего списка типа строения")
    @GetMapping("/getAll/from/type-of-structure")
    public ResponseEntity<List<TypeOfStructure>> getAllFromTypeOfStructure(){
        List<TypeOfStructure> typeOfStructureList = typeOfStructureServices.getAllFromTypeOfStructure();
        return ResponseEntity.ok(typeOfStructureList);
    }
    @Operation(summary = "Метод для получения выпадающего списка курса валют")
    @GetMapping("/getAll/from/exchange-rates")
    public  ResponseEntity<List<ExchangeRates>> getAllFromExchangeRates(){
        List<ExchangeRates> exchangeRates = exchangeRatesGetService.getAllFromExchangeRates();
        return ResponseEntity.ok(exchangeRates);
    }
    @Operation(summary = "Метод для получения выпадающего списка валюты, доллары или сомы")
    @GetMapping("/getAll/from/currencies")
    public ResponseEntity<List<Currencies>> getAllFromCurrencies(){
        List<Currencies> currencies = currenciesGetService.getAllFromCurrencies();
        return ResponseEntity.ok(currencies);
    }
    @Operation(summary = "Метод для получения выпадающего списка типа сделки")
    @GetMapping("/getAll/from/transaction-type")
    public ResponseEntity<List<TransactionType>> getAllFromTransactionType(){
        List<TransactionType> transactionTypes = transactionTypeGetService.getAllFromTransactionType();
        return ResponseEntity.ok(transactionTypes);
    }
    @Operation(summary = "Метод для получения выпадающего списка типа недвижимости")
    @GetMapping("/getAll/from/property-type")
    public ResponseEntity<List<PropertyType>> getAllFromPropertyType(){
        List<PropertyType> propertyTypes = propertyTypeGetService.getAllFromPropertyType();
        return ResponseEntity.ok(propertyTypes);
    }
    @Operation(summary = "Метод для получения выпадающего списка количества комнат")
    @GetMapping("/getAll/from/room-count")
    public ResponseEntity<List<RoomCount>> getAllFromRoomCount(){
        List<RoomCount> roomCounts = roomCountGetService.getAllFromRoomCount();
        return ResponseEntity.ok(roomCounts);
    }

    @Operation(summary = "Метод для получения выпадающего списка серии домов")
    @GetMapping("/getAll/from/series")
    public ResponseEntity<List<Series>> getAllFromSeries(){
        List<Series> seriesList = seriesGetService.getAllFromSeries();
        return ResponseEntity.ok(seriesList);
    }
    @Operation(summary = "Метод для получения выпадающего списка состояния недвижимости")
    @GetMapping("/getAll/from/state")
    public ResponseEntity<List<State>> getAllFromStates(){
        List<State> states = stateGetService.getAllFromState();
        return ResponseEntity.ok(states);
    }

    @Operation(summary = "Метод для получения выпадающего списка жилых комплексов")
    @GetMapping("/getAll/from/residential-complex")
    public ResponseEntity<List<ResidentialComplex>> getAllFromResidentialComplex(){
        List<ResidentialComplex> residentialComplexes = residentialComplexGetService.getAllFromResidentialComplex();
        return ResponseEntity.ok(residentialComplexes);
    }
    @Operation(summary = "Метод для получения выпадающего списка возможности обмена")
    @GetMapping("/getAll/from/possibility-of-exchange")
    public ResponseEntity<List<PossibilityOfExchange>> getAllFromPossibilityOfExchange(){
        List<PossibilityOfExchange> possibilityOfExchanges = possibilityOfExchangeGetService.getAllFromPossibilityOfExchange();
        return ResponseEntity.ok(possibilityOfExchanges);
    }
    @Operation(summary = "Метод для получения выпадающего списка отопления")
    @GetMapping("/getAll/from/heating")
    public ResponseEntity<List<Heating>> getAllFromHeating(){
        List<Heating> heatingList = heatingGetService.getAllFromHeating();
        return ResponseEntity.ok(heatingList);
    }
    @Operation(summary = "Метод для получения выпадающего списка ипотеки")
    @GetMapping("/getAll/from/mortgage")
    public ResponseEntity<List<Mortgage>> getAllFromMortgage(){
        List<Mortgage> mortgages = mortgageGetService.getAllFromMortgage();
        return ResponseEntity.ok(mortgages);
    }
    @Operation(summary = "Метод для получения выпадающего списка рассрочки")
    @GetMapping("/getAll/from/installment-plan")
    public ResponseEntity<List<InstallmentPlan>> getAllFromInstallmentPlan(){
        List<InstallmentPlan> installmentPlans = installmentPlanGetService.getAllFromInstallmentPlan();
        return ResponseEntity.ok(installmentPlans);
    }

    @Operation(summary = "Метод для получения выпадающего списка всех локаций, не обязательно использовать")
    @GetMapping
    public ResponseEntity<List<Location>> getAllLocations() {
        return ResponseEntity.ok(locationService.getAllLocation());
    }

    @Operation(summary = "Метод для получения выпадающего списка регионов")
    @GetMapping("/regions")
    public ResponseEntity<List<String>> getRegions() {
        return ResponseEntity.ok(locationService.getRegions());
    }
    @Operation(summary = "Метод для получения выпадающего списка городов зависимых от регионов")
    @GetMapping("/cities")
    public ResponseEntity<List<String>> getCitiesByRegion(@RequestParam/*(name = "id_region")*/ Integer idRegion) {
        return ResponseEntity.ok(locationService.getCitiesByRegion(idRegion));
    }

    @Operation(summary = "Метод для получения выпадающего списка районов зависимых от городов")
    @GetMapping("/areas")
    public ResponseEntity<List<String>> getDistrictsByCity(@RequestParam/*(name = "id_city")*/ Integer idCity) {
        return ResponseEntity.ok(locationService.getAreasByCity(idCity));
    }













}
