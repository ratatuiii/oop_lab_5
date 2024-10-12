package ua.ucu.edu;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;


    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }


    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }


    public int getPrice() {
        int totalPrice = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            totalPrice += flowerPack.getPrice();
        }
        return totalPrice;
    }
}