package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepo extends JpaRepository<Series, Integer> {
}
