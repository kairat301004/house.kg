package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.PossibilityOfExchange;
import kg.megalab.finalproject.repository.PossibilityOfExchangeRepo;
import kg.megalab.finalproject.services.PossibilityOfExchangeGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PossibilityOfExchangeGetServiceImpl implements PossibilityOfExchangeGetService {
    private final PossibilityOfExchangeRepo possibilityOfExchangeRepo;

    public PossibilityOfExchangeGetServiceImpl(PossibilityOfExchangeRepo possibilityOfExchangeRepo) {
        this.possibilityOfExchangeRepo = possibilityOfExchangeRepo;
    }

    @Override
    public List<PossibilityOfExchange> getAllFromPossibilityOfExchange() {
        List<PossibilityOfExchange> possibilityOfExchanges = possibilityOfExchangeRepo.findAll();
        return possibilityOfExchanges;
    }
}
