package PlayGround;

import java.util.Scanner;
import java.text.NumberFormat;

// NumberFormat.getCurrencyInstance()
class Mortgage_Calculator {
  
  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    int principal; 
    int numberOfPayments=0;
    float annualInterestRate = 0.0F;
    float monthlyInterestRate = 0.0F;
    byte years;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Principal ($1K - $1M) : ");
      principal = scanner.nextInt();
      if (principal <= 1000 | principal >= 1000001) {
        System.out.println("Enter a number between 1,000 and 1,000,000");
      } else
          break;
    }

    while (true) {
      System.out.print("Annual Interest Rate (1 - 30) : ");
      annualInterestRate = scanner.nextFloat();
      if (annualInterestRate <= 0 | annualInterestRate >= 31)
        System.out.println("Enter a value greater than 0 and less than or equal to 30"); 
      else {
        monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        break;
      }
    }

    while (true) {
      System.out.print("Period (Years) (1 - 30): ");
      years = scanner.nextByte();
      if (years <= 0 | years >= 31)
        System.out.println("Enter a number between 1 and 30"); 
      else {
        numberOfPayments = years * MONTHS_IN_YEAR; // in months
        break;
      }
    }

    NumberFormat newPrincipal = NumberFormat.getCurrencyInstance();
    String finalPrincipal = newPrincipal.format(principal);
    System.out.println("\nPrincipal: "+finalPrincipal+"\nRate: "+monthlyInterestRate+"\nTime(Months): "+numberOfPayments+" months");

    double initMortgage = principal * 
      (monthlyInterestRate*Math.pow((1+monthlyInterestRate), numberOfPayments))
      /(Math.pow((1+monthlyInterestRate), numberOfPayments)-1);

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String Mortgage = currency.format(initMortgage);
    System.out.println("\nMortgage = " + Mortgage);
  }
}