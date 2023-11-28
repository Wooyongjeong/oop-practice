package org.example.restaurant;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.restaurant.Cook;
import org.example.restaurant.Cooking;
import org.example.restaurant.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Cook cook = cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }

}
