package com.restful.example.restful.service;

import com.restful.example.restful.domain.Difficulty;
import com.restful.example.restful.domain.Region;
import com.restful.example.restful.domain.Tour;
import com.restful.example.restful.domain.TourPackage;
import com.restful.example.restful.repo.TourPackageRepository;
import com.restful.example.restful.repo.TourRepository;
import org.springframework.stereotype.Service;

import java.nio.file.DirectoryIteratorException;
import java.util.Optional;

@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
        this.tourPackageRepository = tourPackageRepository;
        this.tourRepository = tourRepository;
    }

    public Tour createTour(String title, String description, String blurb, Integer price, String duration, String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName);
        if (tourPackage == null) {
            throw new RuntimeException("Tour does not exist " + tourPackageName);
        }
        return tourRepository.save(new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region));
    }

    public Iterable<Tour> lookup(){
        return tourRepository.findAll();
    }

    public long total(){
        return tourRepository.count();
    }

}
