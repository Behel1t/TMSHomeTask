package org.examle.abstract_factory;

public class Main {
    public static void main(String[] args) {
       Human human=new Human();
        HumanProcess process=new HumanProcess();
        process.doDay(human, new HumanMikeAbstractFactoryImpl());

    }
}
