package org.example.tms;

import java.util.Arrays;

public class MyCollectionImpl <T> implements MyCollection <T> {
    private T[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 1;

    public MyCollectionImpl() {
        this(DEFAULT_CAPACITY);
    }

    public MyCollectionImpl(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public void MyCollectionImpl(int capacity) {

    }

    public void add(T element) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyCollectionImpl{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}