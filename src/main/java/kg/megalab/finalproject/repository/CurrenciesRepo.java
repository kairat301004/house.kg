package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Currencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrenciesRepo extends JpaRepository<Currencies, Integer> {
}
