package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {
}
