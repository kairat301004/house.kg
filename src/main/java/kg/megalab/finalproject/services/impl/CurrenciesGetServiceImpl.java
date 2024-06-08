package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.Currencies;
import kg.megalab.finalproject.repository.CurrenciesRepo;
import kg.megalab.finalproject.services.CurrenciesGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurrenciesGetServiceImpl implements CurrenciesGetService {
    private final CurrenciesRepo currenciesRepo;

    public CurrenciesGetServiceImpl(CurrenciesRepo currenciesRepo) {
        this.currenciesRepo = currenciesRepo;
    }

    @Override
    public List<Currencies> getAllFromCurrencies() {
        List<Currencies> currencies = currenciesRepo.findAll();
        return currencies;
    }
}
