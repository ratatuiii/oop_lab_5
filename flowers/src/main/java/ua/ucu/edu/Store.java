package ua.ucu.edu;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerPack> inventory;


    public Store(FlowerPack[] flowerPacks) {
        inventory = new ArrayList<>();
        if (flowerPacks != null) {
            for (FlowerPack pack : flowerPacks) {
                inventory.add(pack);
            }
        }
    }


    public Store() {
        inventory = new ArrayList<>();
    }


    public boolean isPackInInventory(FlowerPack flowerPack) {
        return inventory.contains(flowerPack);
    }


    public boolean isFlowerInAnyPack(Flower flower) {
        for (FlowerPack pack : inventory) {
            if (pack.getFlower().equals(flower)) {
                return true;
            }
        }
        return false;
    }


    public void addPack(FlowerPack flowerPack) {
        inventory.add(flowerPack);
    }


    public int totalPrice() {
        int totalPrice = 0;
        for (FlowerPack pack : inventory) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }


    public void buyPack(FlowerPack flowerPack) {
        inventory.remove(flowerPack);
    }
}
