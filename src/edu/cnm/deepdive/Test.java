package edu.cnm.deepdive;

public class Test {

  public static void main(String... args) {
    int [] sizes = {6,9,20};
    Composable tester = new McNugget();
    for (int i = 1; i <= 100; i++) {
      System.out.printf("%d,%b,%n", i, tester.test(i, 6, 9, 20));
    }
  }
}
