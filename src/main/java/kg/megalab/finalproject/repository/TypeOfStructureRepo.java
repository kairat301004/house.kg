package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.TypeOfStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfStructureRepo extends JpaRepository<TypeOfStructure, Integer> {
}
