package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.ResidentialComplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentialComplexRepo extends JpaRepository<ResidentialComplex, Integer> {
}
