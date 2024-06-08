package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.Mortgage;
import kg.megalab.finalproject.repository.MortgageRepo;
import kg.megalab.finalproject.services.MortgageGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MortgageGetServiceImpl implements MortgageGetService {
    private final MortgageRepo mortgageRepo;

    public MortgageGetServiceImpl(MortgageRepo mortgageRepo) {
        this.mortgageRepo = mortgageRepo;
    }

    @Override
    public List<Mortgage> getAllFromMortgage() {
        List<Mortgage> mortgages = mortgageRepo.findAll();
        return mortgages;
    }
}
