package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.ResidentialComplex;
import kg.megalab.finalproject.repository.ResidentialComplexRepo;
import kg.megalab.finalproject.services.ResidentialComplexGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResidentialComplexGetServiceImpl implements ResidentialComplexGetService {
    private final ResidentialComplexRepo residentialComplexRepo;

    public ResidentialComplexGetServiceImpl(ResidentialComplexRepo residentialComplexRepo) {
        this.residentialComplexRepo = residentialComplexRepo;
    }

    @Override
    public List<ResidentialComplex> getAllFromResidentialComplex() {
        List<ResidentialComplex> residentialComplexes = residentialComplexRepo.findAll();
        return residentialComplexes;
    }
}
