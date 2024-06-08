package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends JpaRepository<State, Integer> {
}
