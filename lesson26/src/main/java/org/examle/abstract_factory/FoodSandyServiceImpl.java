package org.examle.abstract_factory;

public class FoodSandyServiceImpl implements FoodService {
    @Override
    public void food(Human human) {
        System.out.println("eat pizza");
    }
}
