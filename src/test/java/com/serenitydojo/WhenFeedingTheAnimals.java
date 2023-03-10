package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", false).name();

        Assert.assertEquals(TUNA.name(), food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", false).name();

        Assert.assertEquals(CABBAGE.name(), food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", false).name();

        Assert.assertEquals(DOG_FOOD.name(), food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", true).name();

        Assert.assertEquals(SALMON.name(), food);

    }
}
