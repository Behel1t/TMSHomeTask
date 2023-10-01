package org.examle.abstract_factory;

public class SleepSandyServiceImpl implements SleepService {
    @Override
    public void sleep(Human human) {
        System.out.println("don't sleep");
    }
}
