package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.TypeOfStructure;
import kg.megalab.finalproject.repository.TypeOfStructureRepo;
import kg.megalab.finalproject.services.TypeOfStructureServices;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeOfStructureServicesImpl implements TypeOfStructureServices {
    private final TypeOfStructureRepo typeOfStructureRepo;

    public TypeOfStructureServicesImpl(TypeOfStructureRepo typeOfStructureRepo) {
        this.typeOfStructureRepo = typeOfStructureRepo;
    }

    @Override
    public List<TypeOfStructure> getAllFromTypeOfStructure() {
        List<TypeOfStructure> typeOfStructures = typeOfStructureRepo.findAll();
        return typeOfStructures;
    }
}
