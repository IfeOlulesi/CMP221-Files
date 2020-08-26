package lets_code.lecture_java_files.prelims;

class FirstJava {

  public static float areaOfCircle(int r) {
    float PI = 3.142F;
    return PI * (r*r);
  }

	public static void main(String args[]) {
    System.out.println("The area of a circle of a radius 4 is ");
    System.out.println(areaOfCircle(4));

	}
}