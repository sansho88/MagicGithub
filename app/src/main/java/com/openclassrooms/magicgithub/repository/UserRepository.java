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

    static List<User> userList = new ArrayList<>(FAKE_USERS);


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

    /* public static void main(String[] args) {
        //UserRepository.generateRandomUser();
        System.out.println(getUsers().size());
        userList.clear();
        generateRandomUser();
        //userList.remove(0);
        System.out.println(getUsers().size());
        /* deleteUser(userList.get(0));
        System.out.println(userList.size());

        System.out.println("Test removeTest:");
        User userToDelete = getUsers().get(0);
        System.out.println("userToDelete = " + userToDelete);
        deleteUser(userToDelete);
        System.out.println(userToDelete + " est présent? " + getUsers().contains(userToDelete));

    } */

    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user); // VVVVVVVVVVVVVVVVV



    }
}
