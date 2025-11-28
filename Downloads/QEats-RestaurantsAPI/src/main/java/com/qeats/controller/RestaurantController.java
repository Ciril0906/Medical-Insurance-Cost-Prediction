package com.qeats.controller;

import com.qeats.model.Restaurant;
import com.qeats.service.RestaurantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<Restaurant> getRestaurants(@RequestParam double latitude, @RequestParam double longitude) {
        return restaurantService.getRestaurants(latitude, longitude);
    }
}