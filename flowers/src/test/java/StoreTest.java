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

        final int NEW_PRICE = 10;
        flower.setPrice(NEW_PRICE);
        
        final int AMOUNT_ONE = 10;
        final int AMOUNT_TWO = 3;

        flowerPackOne = new FlowerPack(flower, AMOUNT_ONE);
        flowerPackTwo = new FlowerPack(new Chamomile(), AMOUNT_TWO);


        store = new Store(new FlowerPack[]{flowerPackOne});
    }

    @Test
    public void testAddPack() {
        flower = new Rose();

        final int NEW_PRICE = 10;
        flower.setPrice(NEW_PRICE);
        
        final int AMOUNT_ONE = 10;
        final int AMOUNT_TWO = 3;

        flowerPackOne = new FlowerPack(flower, AMOUNT_ONE);
        flowerPackTwo = new FlowerPack(new Chamomile(), AMOUNT_TWO);


        store = new Store(new FlowerPack[]{flowerPackOne});

        store.addPack(flowerPackTwo);
        Assertions.assertTrue(store.isPackInInventory(flowerPackTwo));
    }

    @Test
    public void testIsPackInInventory() {
        flower = new Rose();

        final int NEW_PRICE = 10;
        flower.setPrice(NEW_PRICE);
        
        final int AMOUNT_ONE = 10;
        final int AMOUNT_TWO = 3;

        flowerPackOne = new FlowerPack(flower, AMOUNT_ONE);
        flowerPackTwo = new FlowerPack(new Chamomile(), AMOUNT_TWO);


        store = new Store(new FlowerPack[]{flowerPackOne});

        Assertions.assertTrue(store.isPackInInventory(flowerPackOne));
        Assertions.assertFalse(store.isPackInInventory(flowerPackTwo));
    }

    @Test
    public void testIsFlowerInAnyPack() {
        flower = new Rose();

        final int NEW_PRICE = 10;
        flower.setPrice(NEW_PRICE);
        
        final int AMOUNT_ONE = 10;
        final int AMOUNT_TWO = 3;

        flowerPackOne = new FlowerPack(flower, AMOUNT_ONE);
        flowerPackTwo = new FlowerPack(new Chamomile(), AMOUNT_TWO);


        store = new Store(new FlowerPack[]{flowerPackOne});

        Assertions.assertTrue(store.isFlowerInAnyPack(flower));
        Assertions.assertFalse(store.isFlowerInAnyPack(new Chamomile()));
    }

    @Test
    public void testTotalPrice() {
        flower = new Rose();

        final int NEW_PRICE = 10;
        flower.setPrice(NEW_PRICE);
        
        final int AMOUNT_ONE = 10;
        final int AMOUNT_TWO = 3;

        flowerPackOne = new FlowerPack(flower, AMOUNT_ONE);
        flowerPackTwo = new FlowerPack(new Chamomile(), AMOUNT_TWO);


        store = new Store(new FlowerPack[]{flowerPackOne});

        final int EXPECTED_VALUE = 100;
        Assertions.assertEquals(EXPECTED_VALUE, store.totalPrice());
    }

    @Test
    public void testBuyPack() {
        flower = new Rose();

        final int NEW_PRICE = 10;
        flower.setPrice(NEW_PRICE);
        
        final int AMOUNT_ONE = 10;
        final int AMOUNT_TWO = 3;

        flowerPackOne = new FlowerPack(flower, AMOUNT_ONE);
        flowerPackTwo = new FlowerPack(new Chamomile(), AMOUNT_TWO);


        store = new Store(new FlowerPack[]{flowerPackOne});

        store.buyPack(flowerPackOne);
        Assertions.assertFalse(store.isPackInInventory(flowerPackOne));
    }
}
