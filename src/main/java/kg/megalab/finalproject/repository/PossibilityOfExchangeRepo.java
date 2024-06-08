package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.PossibilityOfExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PossibilityOfExchangeRepo extends JpaRepository<PossibilityOfExchange, Integer> {
}
