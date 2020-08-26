public class Vehicle {

  int numLegs = 0;
  int numDoors = 0;
  String oName = "";

  public Vehicle (int numLegs, int numDoors, String oName) {
    this.numLegs = numLegs;
    this.numDoors = numDoors;
    this.oName  = oName;
    System.out.println("Constuctor from Vehicle class");
  }

  void start() {
    System.out.println("Car starting...");
  }

  void move() {
    System.out.println("Car moving...");
  }

  void run() {
    System.out.println("Car running...");
  }

  void stop() {
    System.out.println("Car stopping...");
  }

}