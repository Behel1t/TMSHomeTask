package org.examle.abstract_factory;

public class HumanProcess {
    public void doDay(Human human,HumanAbstractFactory humanAbstractFactory){
        humanAbstractFactory.activityService().activity(human);
        humanAbstractFactory.sleepService().sleep(human);
        humanAbstractFactory.foodService().food(human);

    }
}
