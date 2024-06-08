package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.TypeOfPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfPriceRepo extends JpaRepository<TypeOfPrice, Integer> {
}
