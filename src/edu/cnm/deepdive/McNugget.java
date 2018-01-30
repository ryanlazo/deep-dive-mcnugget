package edu.cnm.deepdive;

public class McNugget implements Composable {

  @Override
  public boolean test(double value, double... components) {
    return false;
  }

  @Override
  public boolean test(int testVal, int... packSizes) {
    if (testVal == 0) {
      return true;
    }
    boolean lessThanAllPacks = true;
    for(int currentPack : packSizes) {
      if (testVal >= currentPack) {
        lessThanAllPacks = false;
        break;
      }
    }
    if (lessThanAllPacks) {
      return false;
      }
    for (int currentPack : packSizes) {
      if (test(testVal - currentPack, packSizes)) {
        return true;
      }
    }
    return false;
  }
}
