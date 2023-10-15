package org.examle.abstract_factory;

public class HumanSandyAbstractFactoryImpl implements HumanAbstractFactory {
    @Override
    public ActivityService activityService() {
        return new ActivitySandyServiceImpl();
    }

    @Override
    public FoodService foodService() {
        return new FoodSandyServiceImpl() ;
    }

    @Override
    public SleepService sleepService() {
        return new SleepSandyServiceImpl() ;
    }
}
