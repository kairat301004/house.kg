package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepo extends JpaRepository<TransactionType, Integer> {
}
