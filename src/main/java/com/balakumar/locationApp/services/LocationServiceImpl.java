package com.balakumar.locationApp.services;

import com.balakumar.locationApp.entity.Location;
import com.balakumar.locationApp.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements  LocationServices {

    @Autowired
    private LocationRepo repo;

    @Override
    public Location saveLocation(Location location) {


        return repo.save(location);
    }

    @Override
    public Location updateLocation(Location location) {

        return repo.save(location);
    }

    @Override
    public void deleteLocation(Location location) {

         repo.delete(location);

    }

    @Override
    public Location getLocationById(int locationId) {
        return repo.findById(locationId).get();
    }

    @Override
    public List<Location> getAllLocation() {
        return repo.findAll();
    }
}
