package kg.megalab.finalproject.services;

import kg.megalab.finalproject.models.Location;

import java.util.List;

public interface LocationGetService {
    public List<Location> getAllLocation();
    public List<String> getRegions();
    public List<String> getCitiesByRegion(Integer idRegion);
    public List<String> getAreasByCity(Integer idCity);
}
