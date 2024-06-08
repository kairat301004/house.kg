package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.ExchangeRates;
import kg.megalab.finalproject.repository.ExchangeRatesRepo;
import kg.megalab.finalproject.services.ExchangeRatesGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExchangeRatesGetServiceImpl implements ExchangeRatesGetService {
    private final ExchangeRatesRepo exchangeRatesRepo;

    public ExchangeRatesGetServiceImpl(ExchangeRatesRepo exchangeRatesRepo) {
        this.exchangeRatesRepo = exchangeRatesRepo;
    }

    @Override
    public List<ExchangeRates> getAllFromExchangeRates() {
        List<ExchangeRates> exchangeRates = exchangeRatesRepo.findAll();
        return exchangeRates;
    }
}
