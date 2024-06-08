package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.State;
import kg.megalab.finalproject.repository.StateRepo;
import kg.megalab.finalproject.services.StateGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StateGetServiceImpl implements StateGetService {
    private final StateRepo stateRepo;

    public StateGetServiceImpl(StateRepo stateRepo) {
        this.stateRepo = stateRepo;
    }

    @Override
    public List<State> getAllFromState() {
        List<State> stateList = stateRepo.findAll();
        return stateList;
    }
}
