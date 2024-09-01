package org.example.model;

import org.example.controller.ControllerA;

import java.util.Scanner;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private DigitalWallet digitalWallet;



    public User(String name, String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.name= name;
        this.email=email;
        this.password=password;
        this.digitalWallet= new DigitalWallet();
    }

    public DigitalWallet getDigitalWallet() {
        return digitalWallet;
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
        String generalMessage= "Welcome to "+this.name+"\n***You ID i"+this.id+"\n1.See Balance\n2.Exchange \n3.Deposit \n4.Buy\n5.Exit";
        String option ="99";
        while (!option.equals("5")){
            System.out.println(generalMessage);
            System.out.println("Enter an option: ");
            option =scanner.nextLine();
            if(option.equals("1")){
                System.out.println("metodo para ver tu balance");
                System.out.println(digitalWallet.getMoneyBalance());

            }else if(option.equals("2")){
                System.out.println("metodo para intercambiar");

            }else if(option.equals("3")){
                System.out.println("Enter the amount of money you want to deposit");
                double money= scanner.nextDouble();
                digitalWallet.depositMoney(money);


            }else if(option.equals("4")){
                CryptoMarket cryptoMarket = new CryptoMarket();
                System.out.println("metodo para comaprr");
                cryptoMarket.AvailableCrypto(cryptoMarket.getAvailableCryptocurrencies());


            }else if(option.equals("5")){
            System.out.println("Logging out!");

            }else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }


}
