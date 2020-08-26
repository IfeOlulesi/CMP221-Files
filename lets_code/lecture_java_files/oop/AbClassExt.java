package lets_code.lecture_java_files.oop;

class AbClassExt extends AbClass{

  public void aMethod() {
    System.out.println("This is the implementation of aMethod");
  }

  public void bMethod() {
    System.out.println("This is the implementation of bMethod");
  }

  public static void main(String args[]) {

    AbClassExt extEx = new AbClassExt();
    extEx.aMethod();
    extEx.bMethod();

  }

}