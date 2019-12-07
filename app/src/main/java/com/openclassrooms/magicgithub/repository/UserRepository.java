package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }



     public List<User> getUsers() {
        // TODO: A modifier

         return apiService.getUsers(); // VVVVV



    }

    public void generateRandomUser() {
        // TODO: A modifier

         apiService.generateRandomUser(); //VVVVVVVVVV


    }


    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user); // VVVVVVVVVVVVVVVVV



    }
}
