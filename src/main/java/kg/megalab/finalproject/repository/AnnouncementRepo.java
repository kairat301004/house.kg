package kg.megalab.finalproject.repository;

import kg.megalab.finalproject.models.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepo extends JpaRepository<Announcement, Integer> {
}
