import java.util.ArrayList;
import java.util.List;

public class Village {

  private Villager villager;
  private int numbersOfVillagers;
  List<Villager> listOfVillagers;


  void createVillagersQueue(int numbersOfVillagers) {
    listOfVillagers = new ArrayList<>();

    for (int i = 0; i < numbersOfVillagers; i++) {
      listOfVillagers.add(new Villager());
      System.out.println("Villager added");
    }
  }

  void displayQueue() {
    for (Villager villager : listOfVillagers
    ) {
      System.out.println(villager);
    }
  }

  void startBarrelFilling() {

    int lastVillagerIndex = listOfVillagers.size() - 1;
    Barrel barrel = new Barrel();

    Bucket newfilledBucket = listOfVillagers.get(0).fillUpBucket();

    do {
      listOfVillagers.get(lastVillagerIndex).fillUpBarrel();
     // Bucket newfilledBucket = listOfVillagers.get(0).fillUpBucket();

      for (int i = lastVillagerIndex; i > 0; i--) {
        int previousVillagerIndex = i - 1;
        if (listOfVillagers.get(previousVillagerIndex).checkIfHasBucket() == true) {
          listOfVillagers.get(i).takeBucket(listOfVillagers.get(previousVillagerIndex).returnCurrentBucket());
          newfilledBucket = listOfVillagers.get(0).fillUpBucket();
        }
      //  Bucket anotherfilledBucket = listOfVillagers.get(0).fillUpBucket();
      }

    } while (!barrel.oldManCheckIfBarrelIsFull(5));

  }

}





