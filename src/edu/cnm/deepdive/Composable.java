package edu.cnm.deepdive;

public interface Composable {

  boolean test(int value, int... components);

  boolean test(double value, double...components);

}
