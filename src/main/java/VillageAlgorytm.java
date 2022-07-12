public class VillageAlgorytm {
  public static void main(String[] args) {

    Village newVillage = new Village();
    newVillage.createVillagersQueue(7);

    newVillage.displayQueue();

    Bucket newBucket = new Bucket();
    System.out.println(newBucket.getBucketVolumeAfterPickUp());
    System.out.println(newBucket.getBucketVolumeAfterPickUp());
    System.out.println(newBucket.getBucketVolumeAfterPickUp());
    System.out.println(newBucket.getBucketVolumeAfterPickUp());
    System.out.println(newBucket.checkIfBucketEmpty());
    System.out.println("--------------------");

    Barrel newBarrel = new Barrel();
    newBarrel.addWater(3.5);
    newBarrel.addWater(4.5);
    newBarrel.addWater(6);
    System.out.println("Beczka jest pełna: " + newBarrel.oldManCheckIfBarrelIsFull(5));
    System.out.println("Beczka jest pełna: " + newBarrel.oldManCheckIfBarrelIsFull(100));

    System.out.println("--------------------");

    Villager newVillager = new Villager();
    System.out.println("wieśniak ma wiadro: " + newVillager.checkIfHasBucket());
    newVillager.fillUpBucket();
    System.out.println("wieśniak ma wiadro: " + newVillager.checkIfHasBucket());
    newVillager.fillUpBarrel();
    System.out.println("wieśniak ma wiadro: " + newVillager.checkIfHasBucket());
   // newVillager.takeBucket();
    System.out.println("wieśniak ma wiadro: " + newVillager.checkIfHasBucket());

    System.out.println("--------------------");

    newVillage.startBarrelFilling();



  }
}
