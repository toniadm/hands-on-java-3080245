package bank;

import java.util.Scanner;

public class Menu {
  
  private Scanner scanner;

  public static void main(String[] args) {
    System.out.println("Welcome to Globe Bank International!");

    Menu menu = new Menu();
    menu.scanner = new Scanner(System.in);







    menu.scanner.close();
  }

  private Customer authenticateUser(){
    System.out.println("Please enter your username");
    String username = scanner.next();
    
    System.out.println("Please enter your password");
    String password = scanner.next();
  }

}
