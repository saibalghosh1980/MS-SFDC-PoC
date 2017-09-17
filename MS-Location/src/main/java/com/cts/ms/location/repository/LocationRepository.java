package com.cts.ms.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ms.location.dao.Location;

@Repository("springManagedLocationRepository")
public interface LocationRepository extends JpaRepository<Location, String> {

}
