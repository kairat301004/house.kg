package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyTypeRepo extends JpaRepository<PropertyType, Integer> {
}
