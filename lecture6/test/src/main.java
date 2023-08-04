public class main {
  public static void main(String[] args) {
    int i = 10;
    for (int index = 0; index < i; index++) {
      System.out.println(i + index);
    }
    Auto test = new Auto(4, "test", 2, 10000);
    test.printInfo();
  }
}
