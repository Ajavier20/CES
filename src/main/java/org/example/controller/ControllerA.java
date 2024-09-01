package org.example.controller;
import org.example.model.Manage;
import org.example.model.User;
import org.example.model.Cryptocurrency;

import java.util.ArrayList;


public class ControllerA {
    private ArrayList<Cryptocurrency> availableCryptocurrencies;
    private Cryptocurrency cryptocurrencies;
    private Manage manage;

    public ControllerA() {
        this.manage = new Manage();
    }

    public void createUser(String name, String email, String password){
        User user= new User(name,email,password);
        manage.addUser(user);
    }

    public void login(String email,String password){
    User user= manage.check(email,password);
        if (user != null) {
            // Usuario encontrado, imprimir los detalles
           // System.out.println("Hola " + user.getName() + ", tu ID es: " + user.getId());
            user.Options();
        } else {
            // Usuario no encontrado, imprimir un mensaje de error
            System.out.println("Login fallido. Verifica tus credenciales.");
        }
    }




}
