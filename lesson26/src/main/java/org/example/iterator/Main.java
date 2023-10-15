package org.example.iterator;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> myList = new ArrayList<User>();
        myList.add(new User("Rick",5));
        myList.add(new User("Roma",15));
        myList.add(new User("Sandy",8));
        myList.add(new User("Dima",6));



        Iterator<User> iterator = new KidUserIterator(myList);
        while(iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user.getName());
        }
    }
}
