package kg.megalab.finalproject.controller;


import io.swagger.v3.oas.annotations.Operation;
import kg.megalab.finalproject.dto.AnnouncementFilterDto;
import kg.megalab.finalproject.models.Announcement;
import kg.megalab.finalproject.services.FilterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FilterController {
    private final FilterService filterService;

    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }
    @Operation(summary = "Метод для поиска объявлений в зависимости от указанных фильтров")
    @PostMapping("/filter/listings")
    public ResponseEntity<List<Announcement>> filterAnnouncements(@RequestBody(required = false) AnnouncementFilterDto filterDTO) {
        List<Announcement> announcements = filterService.getAnnouncements(filterDTO);
        return ResponseEntity.ok(announcements);
    }
}
