package com.balakumar.locationApp.controller;


import com.balakumar.locationApp.entity.Location;
import com.balakumar.locationApp.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationRestController  {

     @Autowired
    LocationRepo repo;


     @GetMapping
     public List<Location> getLocation(){

         return  repo.findAll();
     }

     @PostMapping
    public Location insertLocation(@RequestBody  Location location) {

         return repo.save(location);

     }

     @PutMapping
    public Location updateLocation(@RequestBody Location location) {
         return repo.save(location);
     }

     @DeleteMapping("/{id}")
     public void deleteLocation(@PathVariable("id")  int id) {
           repo.deleteById(id);
     }

     @GetMapping("/{id}")
     public Location getOnleLocation(@PathVariable("id") int id) {

         return repo.findById(id).orElse(null);
     }



}
