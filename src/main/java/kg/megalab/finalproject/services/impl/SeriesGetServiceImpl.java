package kg.megalab.finalproject.services.impl;

import kg.megalab.finalproject.models.Series;
import kg.megalab.finalproject.repository.SeriesRepo;
import kg.megalab.finalproject.services.SeriesGetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeriesGetServiceImpl implements SeriesGetService {
    private final SeriesRepo seriesRepo;

    public SeriesGetServiceImpl(SeriesRepo seriesRepo) {
        this.seriesRepo = seriesRepo;
    }

    @Override
    public List<Series> getAllFromSeries() {
        List<Series> seriesList = seriesRepo.findAll();
        return seriesList;
    }
}
