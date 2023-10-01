package org.examle.abstract_factory;

public interface HumanAbstractFactory {
    ActivityService activityService();
    FoodService foodService();
    SleepService  sleepService();
}
