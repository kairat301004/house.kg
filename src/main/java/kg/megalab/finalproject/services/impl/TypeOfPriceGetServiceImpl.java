package kg.megalab.finalproject.services.impl;


import kg.megalab.finalproject.models.TypeOfPrice;
import kg.megalab.finalproject.repository.TypeOfPriceRepo;
import kg.megalab.finalproject.services.TypeOfPriceGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeOfPriceGetServiceImpl implements TypeOfPriceGetService {
    private final TypeOfPriceRepo typeOfPriceRepo;

    public TypeOfPriceGetServiceImpl(TypeOfPriceRepo typeOfPriceRepo) {
        this.typeOfPriceRepo = typeOfPriceRepo;
    }


    @Override
    public List<TypeOfPrice> getAllFromTypeOfPrice() {
        List<TypeOfPrice> typeOfPrice = typeOfPriceRepo.findAll();
        return typeOfPrice;
    }
}
