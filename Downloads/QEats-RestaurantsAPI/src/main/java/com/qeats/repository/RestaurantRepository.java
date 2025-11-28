package com.qeats.repository;

import com.qeats.model.Restaurant;
import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> findAll();
}