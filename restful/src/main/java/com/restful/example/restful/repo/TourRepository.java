package com.restful.example.restful.repo;

import com.restful.example.restful.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {

}
