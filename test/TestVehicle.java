package MyTest;

import vehicles.Car;
import vehicles.Motorbike;
import org.junit.Assert;
import org.junit.Test;

public class TestVehicle {

    @Test
    public void GIVEN_CAR_WHEN_PASSENGER_COUNT_8_AND_SPEED_100_THEN_FEE_750() {
        Car car = new Car("Toyota", "Red", 8, 100);
        Assert.assertEquals(750, car.additionalFineForCrowd());

    }

    @Test
    public void GIVEN_CAR_WHEN_PASSENGER_COUNT_3_AND_SPEED_100_THEN_FEE_150() {
        Car c = new Car("Toyota", "Red", 3, 100);
        Assert.assertEquals(150, c.additionalFineForCrowd());
    }

    @Test
    public void GIVEN_CAR_WHEN_PASSENGER_COUNT_3_AND_SPEED_70_THEN_FEE_0() {
        Car car = new Car("Toyota", "Red", 3, 70);
        Assert.assertEquals(0, car.additionalFineForCrowd());
    }

    @Test
    public void GIVEN_MOTORBIKE_WHEN_HELMET_IS_PRESENT_AND_SPEED_110_THEN_FEE_280() {
        Motorbike car = new Motorbike("Kawasaki", "Red", true, 110);
        Assert.assertEquals(280, car.additionalFineForNoHelmet());
    }

    @Test
    public void GIVEN_MOTORBIKE_WHEN_HELMET_IS_NOT_PRESENT_AND_SPEED_160_THEN_FEE_700() {
        Motorbike motorbike = new Motorbike("BMW", "Red", false, 160);
        Assert.assertEquals(700, motorbike.additionalFineForNoHelmet());
    }

    @Test
    public void GIVEN_MOTORBIKE_WHEN_HELMET_PRESENT_AND_SPEED_50_THEN_FEE_0() {
        Motorbike motorbike = new Motorbike("Mercedes", "Red", true, 50);
        Assert.assertEquals(0, motorbike.additionalFineForNoHelmet());
    }

}
