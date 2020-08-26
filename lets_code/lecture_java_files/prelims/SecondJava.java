package lets_code.lecture_java_files.prelims;

class SecondJava { // class naming convention - capital letters

	public static void main(String[] args) {
    int j = 5,a=0,b=0;

    for(int i = 0; i <= 5; i++) {
      System.out.println("j initial is "+j);
      // a ++j; // perform the incrementation first then assign
      System.out.println("j after (++j) is "+j);
      b = j++; // perform the operation first then increment

      System.out.println("j after (++j) and (j++) is "+j);
      System.out.println("a (++j) is "+a);
      System.out.println("b (j++) is "+b+"\n");
    }
  }

}


