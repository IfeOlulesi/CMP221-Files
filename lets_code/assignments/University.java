package lets_code.assignments;

class University {

  String name = "";   // name, city, year of establishment
  String city = "";   // names = AUL, UNN AND ABU
  int yrOfEst = 0;  // Year of Establishment

  static void decor() {
    System.out.println("\n============================================================");
  }

  void addDetails(String name, String city, int yrOfEst) {
    this.name = name;
    this.city = city;
    this.yrOfEst = yrOfEst;
  }

  void showDetails () {
    System.out.println("Name: "+name+"\nCity: "+city+"\nYear of Establishment: "+yrOfEst);
  }

  public static void main(String[] main) {
    University aul = new University();
    University unn = new University();
    University abu = new University();

    aul.addDetails("Anchor University, Lagos (AUL)", "Lagos", 2017);
    unn.addDetails("University of Nsukka (UNN) ", "Nsukka", 1975);
    abu.addDetails("Afe Babalola University (ABU)", "Akwa-Ibom", 2000);

    decor();
    aul.showDetails();
    decor();
    unn.showDetails();
    decor();
    abu.showDetails();
  }
}