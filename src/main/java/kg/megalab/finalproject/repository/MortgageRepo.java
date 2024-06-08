package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Mortgage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageRepo extends JpaRepository<Mortgage, Integer> {
}
