package lets_code.lecture_java_files.prelims;

import java.util.Scanner;

class SwitchStatements {

  public static void switcher() {
    Scanner scanner =  new Scanner(System.in);
    byte day;

    while (true) {
      System.out.print("Enter a number <= 10 \n> ");
      day = scanner.nextByte();

      if (day <= 10)
        break;
      else
        System.out.println("Invalid Input!!");
    }

    switch (day) {
      case 1:
        System.out.println("Monday");        
        break;
      
      case 2:
        System.out.println("Tuesday");        
        break;
    
      case 3:
        System.out.println("Wednesday");        
        break;

      case 4:
        System.out.println("Thursday");        
        break;
      
      default:
        System.out.println("Holiday!!! wby cant i put emoji");
        break;
    }
  }

  public static void main(String[] args) {
    
  }
}