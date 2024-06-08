package kg.megalab.finalproject.services;

import kg.megalab.finalproject.models.TypeOfPrice;
import kg.megalab.finalproject.repository.TypeOfPriceRepo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TypeOfPriceGetService  {
    public List<TypeOfPrice> getAllFromTypeOfPrice();

}
