package lets_code.play_ground;

import java.util.Scanner;
import lets_code.oop_redo.Vehicle;

 class Calculator {
  
  public static void main(String[] args) {

    Vehicle audi = new Vehicle(4, 2, "Dash2020");
    audi.start();
    audi.move();


    /*
    Scanner scanner = new Scanner(System.in);
    boolean done = false;

    while (done == false) {

      System.out.print("Input a number: ");
      int number = scanner.nextInt();
      int checkForFive = number % 5,
          checkForThree = number % 3;

      if (checkForFive == 0 && checkForThree == 0) {
        System.out.println("FizzBuzz");
      } else if (checkForFive == 0) {
        System.out.println("Fizz");
      } else if (checkForThree == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(number);
      }

      System.out.print("Would you like to enter another number? (Yes/No) \n: ");
      String checker = scanner.next();
      
      if (checker.equals("No")) {
        done = true;
        System.out.println("See you soon!!!");
        break;
      }
      */
    }
  }
