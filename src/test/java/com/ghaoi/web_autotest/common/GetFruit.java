package com.ghaoi.web_autotest.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetFruit {
    private String[] fruitName = {"strawberry", "cherry", "lemon", "grape", "orange"};
    private Random random = new Random();

    public String getName() {

        int index = random.nextInt(fruitName.length);
        return fruitName[index];
    }

     public List<Integer> getPrice() {
        List<Integer> list = new ArrayList<>();
        int price = random.nextInt(200) + 1;
        int discount = random.nextInt(price);
        list.add(price);
        list.add(discount);
        return list;
     }
}
