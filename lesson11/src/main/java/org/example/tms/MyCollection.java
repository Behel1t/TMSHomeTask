package org.example.tms;

public interface MyCollection <T>{
    void MyCollectionImpl(int capacity);
    void add(T element);
    void remove(int index);
    T get(int index);
    boolean contains(T element);
    void clear();
    int size();
}