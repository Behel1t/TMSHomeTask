package org.examle.abstract_factory;

public class HumanMikeAbstractFactoryImpl implements HumanAbstractFactory {
    @Override
    public ActivityService activityService() {
        return new ActivityMikeServiceImpl() ;
    }

    @Override
    public FoodService foodService() {
        return new FoodMikeServiceImpl() ;
    }

    @Override
    public SleepService sleepService() {
        return new SleepMikeServiceImpl();
    }
}