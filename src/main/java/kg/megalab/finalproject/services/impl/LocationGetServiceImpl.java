package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.Location;
import kg.megalab.finalproject.repository.LocationRepo;
import kg.megalab.finalproject.services.LocationGetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationGetServiceImpl implements LocationGetService {
    private final LocationRepo locationRepo;

    public LocationGetServiceImpl(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    @Override
    public List<Location> getAllLocation() {
        return locationRepo.findAll();
    }
    @Override
    public List<String> getRegions() {
        return locationRepo.findAll().stream()
                .filter(location -> location.getCity() == null && location.getRegion() == null)
                .map(Location::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getCitiesByRegion(Integer idRegion) {
        return locationRepo.findAll().stream()
                .filter(location -> location.getRegion() != null && location.getRegion().getId().equals(idRegion))
                .map(Location::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAreasByCity(Integer idCity) {
        return locationRepo.findAll().stream()
                .filter(location -> location.getCity() != null && location.getCity().getId().equals(idCity))
                .map(Location::getName)
                .collect(Collectors.toList());
    }
}
