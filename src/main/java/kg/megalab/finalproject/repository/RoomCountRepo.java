package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.RoomCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCountRepo extends JpaRepository<RoomCount, Integer> {
}
