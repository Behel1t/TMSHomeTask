package org.example.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class KidUserIterator implements Iterator<User> {
    private List<User> users;
    private int position;

    public KidUserIterator(List<User> users) {
        this.users = users;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        while (position<users.size()){
            if (users.get(position).getAge()<14){
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public User next() {
        if (hasNext()){
            User user=users.get(position);
            position++;
            return user;
        }else {
            throw new NoSuchElementException();
        }
    }
}
