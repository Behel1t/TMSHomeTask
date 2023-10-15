package org.examle.abstract_factory;

public class SleepMikeServiceImpl implements SleepService {
    @Override
    public void sleep(Human human) {
        System.out.println("sleep");
    }
}
