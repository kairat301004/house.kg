package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.Heating;
import kg.megalab.finalproject.repository.HeatingRepo;
import kg.megalab.finalproject.services.HeatingGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeatingGetServiceImpl implements HeatingGetService {
    private final HeatingRepo heatingRepo;

    public HeatingGetServiceImpl(HeatingRepo heatingRepo) {
        this.heatingRepo = heatingRepo;
    }

    @Override
    public List<Heating> getAllFromHeating() {
        List<Heating> heatingList = heatingRepo.findAll();
        return heatingList;
    }
}
