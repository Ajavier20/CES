package org.example.model;

import org.example.controller.ControllerA;

import java.util.Scanner;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private DigitalWallet  digitalWallet;


    public User(String name, String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.name= name;
        this.email=email;
        this.password=password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public boolean match(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }

    public void Options(){
        Scanner scanner = new Scanner(System.in);
        String generalMessage= "Welcome to "+this.name+"\n***You ID i"+this.id+"\n1.Exchange \n2.Deposit \n3.Buy\n4.Exit";
        String option ="99";
        while (!option.equals("4")){
            System.out.println(generalMessage);
            System.out.println("Enter an option: ");
            option =scanner.nextLine();
            if(option.equals("1")){
                System.out.println("metodo para intercambiar");

            }else if(option.equals("2")){
                System.out.println("metodo para depostitar");

            }else if(option.equals("3")){
                System.out.println("metodo para comaprr");

            }else if(option.equals("4")){
            System.out.println("Logging out!");

            }else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }


}
