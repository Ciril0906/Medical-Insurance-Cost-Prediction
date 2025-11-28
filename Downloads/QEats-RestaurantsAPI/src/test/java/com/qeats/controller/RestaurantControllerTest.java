package com.qeats.controller;

import com.qeats.model.Restaurant;
import com.qeats.service.RestaurantService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(RestaurantController.class)
public class RestaurantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestaurantService restaurantService;

    @Test
    void testGetRestaurants() throws Exception {
        Mockito.when(restaurantService.getRestaurants(12.9716, 77.5946))
                .thenReturn(Arrays.asList(new Restaurant("1", "Burger King", 12.9716, 77.5946)));

        mockMvc.perform(get("/restaurants?latitude=12.9716&longitude=77.5946"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Burger King"));
    }
}