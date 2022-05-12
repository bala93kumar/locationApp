package com.balakumar.locationApp.controller;


import com.balakumar.locationApp.entity.Location;
import com.balakumar.locationApp.services.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    LocationServices service;

    @RequestMapping("/showCreate")
    public String createLocation() {

        return "CreateLocation";
    }


    @RequestMapping(value = "/saveloc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelmap) {

        Location locationobj =  service.saveLocation(location);

        String msg = "Location saved with id : " + locationobj.getId();

        modelmap.addAttribute("msg", msg);

        return "CreateLocation";
    }

    @RequestMapping("/displaylocation")
    public String displaylocation(ModelMap model) {
        List<Location> locationsList  = service.getAllLocation();

        model.addAttribute("locations" , locationsList);
        return "displaylocation";
    }


    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap model) {

        Location location_value = service.getLocationById(id);
        service.deleteLocation(location_value);
        List<Location> locationsList  = service.getAllLocation();

        model.addAttribute("locations" , locationsList);
        return "displaylocation";

    }

    @RequestMapping("/updateLocation")
    public String showUpdatePage(@RequestParam("id") int id , ModelMap model) {
        Location loc_id = service.getLocationById(id);
        model.addAttribute("location"
                , loc_id);
        return "editLocation";
    }




}
