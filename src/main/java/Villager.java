public class Villager {

  private Bucket bucket;
  private boolean hasBucket;
  private Bucket takenBucket;

  public boolean checkIfHasBucket() {
    return hasBucket;
  }

  public Bucket returnCurrentBucket(){
    return bucket;
  }

  public boolean takeBucket(Bucket takenBucket) {
    if (takenBucket != null) {
      hasBucket = true;
      this.bucket = takenBucket;
      bucket.getBucketVolumeAfterPickUp();
      System.out.println("I take bucket");
      return true;
    } else {
      System.out.println("Bucket was not available for pick up");
      return false;
    }
  }

  public Bucket fillUpBucket(){
    System.out.println("I fill up bucket");
    bucket = new Bucket();
    hasBucket = true;
    return bucket;
  }

  public void fillUpBarrel(){
    if (hasBucket == true) {
      System.out.println("fill up barrel");
      hasBucket = false;
      bucket = null;
    } else {
      System.out.println("barrel was not filled");
    }
  }

}
