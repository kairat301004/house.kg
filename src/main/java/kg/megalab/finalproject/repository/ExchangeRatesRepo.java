package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.ExchangeRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRatesRepo extends JpaRepository<ExchangeRates, Integer> {
}
