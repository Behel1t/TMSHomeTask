package org.examle.abstract_factory;

public class FoodMikeServiceImpl implements FoodService {
    @Override
    public void food(Human human) {
        System.out.println("eat ice-cream");
    }
}
