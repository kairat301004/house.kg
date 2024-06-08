package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.PropertyType;
import kg.megalab.finalproject.repository.PropertyTypeRepo;
import kg.megalab.finalproject.services.PropertyTypeGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropertyTypeGetServiceImpl implements PropertyTypeGetService {
    private final PropertyTypeRepo propertyTypeRepo;

    public PropertyTypeGetServiceImpl(PropertyTypeRepo propertyTypeRepo) {
        this.propertyTypeRepo = propertyTypeRepo;
    }

    @Override
    public List<PropertyType> getAllFromPropertyType() {
        List<PropertyType> propertyTypes = propertyTypeRepo.findAll();
        return propertyTypes;
    }
}
