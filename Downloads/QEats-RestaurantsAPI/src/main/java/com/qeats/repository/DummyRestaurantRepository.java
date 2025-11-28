package com.qeats.repository;

import com.qeats.model.Restaurant;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DummyRestaurantRepository implements RestaurantRepository {

    private List<Restaurant> restaurants;

    public DummyRestaurantRepository() {
        restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("1", "Burger King", 12.9716, 77.5946));
        restaurants.add(new Restaurant("2", "Pizza Hut", 12.9352, 77.6245));
        restaurants.add(new Restaurant("3", "KFC", 12.9611, 77.6387));
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurants;
    }
}