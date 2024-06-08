package kg.megalab.finalproject.services;

import kg.megalab.finalproject.dto.AnnouncementFilterDto;
import kg.megalab.finalproject.models.Announcement;
import kg.megalab.finalproject.repository.FilterRepo;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilterService {

    private final FilterRepo filterRepo;

    public FilterService(FilterRepo filterRepo) {
        this.filterRepo = filterRepo;
    }

    public List<Announcement> getAnnouncements(AnnouncementFilterDto filterDTO) {
        Specification<Announcement> specification = FilterSpecification.getAnnouncementsByFilter(filterDTO);
        return filterRepo.findAll(specification);
    }
}
