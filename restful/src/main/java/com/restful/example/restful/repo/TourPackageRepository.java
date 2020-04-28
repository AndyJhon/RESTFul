package com.restful.example.restful.repo;

import com.restful.example.restful.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    TourPackage findByName(String name);
}
