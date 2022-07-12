public class Bucket {

  private double currentBucketVolume;
  private final double loss = 0.05;
  private final static double EMPTY_BUCKET_RATIO = 0.05;
  private boolean isBucketEmpty;

  public Bucket() {
    this.currentBucketVolume = 5;
  }

  double getBucketVolumeAfterPickUp() {
    currentBucketVolume = currentBucketVolume - currentBucketVolume * loss;
    System.out.println("Current bucket volume is:" + currentBucketVolume);
    return currentBucketVolume;
  }

  boolean checkIfBucketEmpty() {
    if (currentBucketVolume < EMPTY_BUCKET_RATIO) {
      isBucketEmpty = true;
      return true;
    }
    return false;
  }


}
