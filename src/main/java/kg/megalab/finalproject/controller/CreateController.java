package kg.megalab.finalproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import kg.megalab.finalproject.models.Announcement;
import kg.megalab.finalproject.services.impl.AnnouncementCreateServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CreateController {
    private final AnnouncementCreateServiceImpl announcementCreateService;

    public CreateController(AnnouncementCreateServiceImpl announcementCreateService) {
        this.announcementCreateService = announcementCreateService;
    }

    @Operation(summary = "Метод для создания объявления")
    @PostMapping("/create/announcement")
    public ResponseEntity<Announcement> createAnnouncement(@RequestBody Announcement announcement){
        Announcement savedAnnouncement = announcementCreateService.filterAnnouncement(announcement);
        return ResponseEntity.ok(savedAnnouncement);
    }
}

