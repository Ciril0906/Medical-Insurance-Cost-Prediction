package com.qeats.service;

import com.qeats.model.Restaurant;
import java.util.List;

public interface RestaurantService {
    List<Restaurant> getRestaurants(double latitude, double longitude);
}