package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepo extends JpaRepository<Announcement, Integer>, JpaSpecificationExecutor<Announcement> {
}
