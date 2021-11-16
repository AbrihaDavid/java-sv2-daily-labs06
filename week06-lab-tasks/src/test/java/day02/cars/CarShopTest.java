package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("Car",100);

    @BeforeEach
    void init(){
        carShop.addCar(new Car("KIA",1.2,Color.BLUE,100));
        carShop.addCar(new Car("KIA",1.2,Color.BLUE,80));
        carShop.addCar(new Car("KIA",1.2,Color.BLUE,10));
    }

    @Test
    void createCarShopTest(){

        CarShop carShop = new CarShop("Car",100);

        assertEquals("Car",carShop.getName());
        assertEquals(100,carShop.getMaxPrice());
        assertEquals(0,carShop.getCarsForSell().size());
    }

    @Test
    void addCarWithValidPriceTest(){

        boolean result = carShop.addCar(new Car("KIA",1.2,Color.BLUE,20));

        assertTrue(result);
        assertEquals(3,carShop.getCarsForSell().size());
        assertEquals("KIA",carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void addCarWithInvalidPriceTest(){

        boolean result = carShop.addCar(new Car("KIA",1.6,Color.BLUE,200));
        assertFalse(result);
        assertEquals(2,carShop.getCarsForSell().size());

    }

    @Test
    void sumPriceOfCarsTest(){

        assertEquals(90,carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThan(){

        assertEquals(2,carShop.numberOfCarsCheaperThan(99));
    }

}