public class Barrel {

 // private final static double INITIAL_BARREL_VOLUME = 0;
  private final static double MAX_BARREL_VOLUME = 100;
  private double currentBarrelVolume;
  private boolean isBarrelFull;

  public Barrel() {
    this.currentBarrelVolume = 0;
  }

  public double getCurrentBarrelVolume(){
    return currentBarrelVolume;
  }

  public double addWater(double additionalWater){
    currentBarrelVolume = currentBarrelVolume + additionalWater;
    System.out.println("current water volume in barrel: " + currentBarrelVolume);
    return currentBarrelVolume;
  }

  public boolean oldManCheckIfBarrelIsFull(double additionalWater){
    if (currentBarrelVolume + additionalWater > MAX_BARREL_VOLUME){
      isBarrelFull = true;
      return true;}
    return false;

  }


}
