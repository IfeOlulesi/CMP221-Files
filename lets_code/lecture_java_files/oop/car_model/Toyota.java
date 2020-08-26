package lets_code.lecture_java_files.oop.car_model;

import lets_code.lecture_java_files.oop.car_model.Vehicle;
import java.util.Scanner; // to be sure that imports are working

public class Toyota {
  
  public static void main(String[] args) {
    Vehicle camry = new Vehicle(6, 12, "Avenses");
    Scanner sc = new Scanner(System.in); // funny its working

    camry.start();
    System.out.println("");
  }

}