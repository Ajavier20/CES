package org.example.viewer;

import org.example.controller.ControllerA;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ControllerA ctrlA= new ControllerA();
        String generalMessage= "Welcome to Crypto Exchange System! \n1.Exit \n2.Registration \n3.Login";
        String option ="99";
            while (!option.equals("1")){
                System.out.println(generalMessage);
                System.out.println("Enter an option: ");
                option =scanner.nextLine();
                if(option.equals("2")){
                    System.out.println("Enter the following data to register a new user:\nName:  ");
                    String userName= scanner.nextLine();
                    System.out.println("Email: ");
                    String userEmail= scanner.nextLine();
                    System.out.println("Password: ");
                    String userPassword= scanner.nextLine();
                    ctrlA.createUser(userName,userEmail,userPassword);


                }else if(option.equals("3")){
                    boolean validInput = false;
                    while (!validInput) {
                    System.out.println("Enter the following data to login:\nEmail:  ");
                    String userEmail= scanner.nextLine();
                    //comprobar que el email sea el existe en el caso que no se vuelve a pedir
                    System.out.println("Password: ");
                    //verificar que la contraseña sea la correcta;
                    String userPassword= scanner.nextLine();
                    ctrlA.login(userEmail,userPassword);
                    validInput = true;
                    }
                }
            }
        scanner.close();
        System.out.println("Program finished!");
    }
}