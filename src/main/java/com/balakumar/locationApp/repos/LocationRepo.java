package com.balakumar.locationApp.repos;

import com.balakumar.locationApp.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepo  extends JpaRepository<Location,Integer> {


}
