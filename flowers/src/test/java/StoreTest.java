import ua.ucu.edu.Store;
import ua.ucu.edu.Flower;
import ua.ucu.edu.FlowerPack;
import ua.ucu.edu.Rose;
import ua.ucu.edu.Chamomile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Store store;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Rose();
        flower.setPrice(10);
        flowerPack1 = new FlowerPack(flower, 5);
        flowerPack2 = new FlowerPack(new Chamomile(), 3);


        store = new Store(new FlowerPack[]{flowerPack1});
    }

    @Test
    public void testAddPack() {
        store.addPack(flowerPack2);
        Assertions.assertTrue(store.isPackInInventory(flowerPack2));
    }

    @Test
    public void testIsPackInInventory() {
        Assertions.assertTrue(store.isPackInInventory(flowerPack1));
        Assertions.assertFalse(store.isPackInInventory(flowerPack2));
    }

    @Test
    public void testIsFlowerInAnyPack() {
        Assertions.assertTrue(store.isFlowerInAnyPack(flower));
        Assertions.assertFalse(store.isFlowerInAnyPack(new Chamomile()));
    }

    @Test
    public void testTotalPrice() {
        Assertions.assertEquals(50, store.totalPrice());
    }

    @Test
    public void testBuyPack() {
        store.buyPack(flowerPack1);
        Assertions.assertFalse(store.isPackInInventory(flowerPack1));
    }
}
