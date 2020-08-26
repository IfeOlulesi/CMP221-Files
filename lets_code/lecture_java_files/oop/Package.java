package lets_code.lecture_java_files.oop;


import java.util.Scanner;

class Package {

  // We treated scanners
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("How many variable types exist in java? (Input a number) ");
    int counter = sc.nextInt();
    float flow = sc.nextFloat();
    System.out.print("Counter: "+counter);
    System.out.println(" Flow: "+flow);


  }


}