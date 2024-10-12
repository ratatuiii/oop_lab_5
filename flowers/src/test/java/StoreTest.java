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
    private FlowerPack flowerPackOne;
    private FlowerPack flowerPackTwo;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Rose();

        int newPrice = 10;
        flower.setPrice(newPrice);

        int newAmountOne = 5;
        int newAmountTwo = 3;
        flowerPackOne = new FlowerPack(flower, newAmountOne);
        flowerPackTwo = new FlowerPack(new Chamomile(), newAmountTwo);


        store = new Store(new FlowerPack[]{flowerPackOne});
    }

    @Test
    public void testAddPack() {
        store.addPack(flowerPackTwo);
        Assertions.assertTrue(store.isPackInInventory(flowerPackTwo));
    }

    @Test
    public void testIsPackInInventory() {
        Assertions.assertTrue(store.isPackInInventory(flowerPackOne));
        Assertions.assertFalse(store.isPackInInventory(flowerPackTwo));
    }

    @Test
    public void testIsFlowerInAnyPack() {
        Assertions.assertTrue(store.isFlowerInAnyPack(flower));
        Assertions.assertFalse(store.isFlowerInAnyPack(new Chamomile()));
    }

    @Test
    public void testTotalPrice() {
        int expectedValue = 50;
        Assertions.assertEquals(expectedValue, store.totalPrice());
    }

    @Test
    public void testBuyPack() {
        store.buyPack(flowerPackOne);
        Assertions.assertFalse(store.isPackInInventory(flowerPackOne));
    }
}
