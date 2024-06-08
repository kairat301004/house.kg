package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Heating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeatingRepo extends JpaRepository<Heating, Integer> {
}
