package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.RoomCount;
import kg.megalab.finalproject.repository.RoomCountRepo;
import kg.megalab.finalproject.services.RoomCountGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomCountGetServiceImpl implements RoomCountGetService {
    private final RoomCountRepo roomCountRepo;

    public RoomCountGetServiceImpl(RoomCountRepo roomCountRepo) {
        this.roomCountRepo = roomCountRepo;
    }

    @Override
    public List<RoomCount> getAllFromRoomCount() {
        List<RoomCount> roomCounts = roomCountRepo.findAll();
        return roomCounts;
    }
}
