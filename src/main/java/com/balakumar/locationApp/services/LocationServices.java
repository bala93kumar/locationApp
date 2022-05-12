package com.balakumar.locationApp.services;

import com.balakumar.locationApp.entity.Location;

import java.util.List;

public interface LocationServices  {

    Location  saveLocation(Location location);
    Location  updateLocation(Location location );
    void deleteLocation(Location location );
    Location getLocationById(int locationId);
    List<Location> getAllLocation();
}
