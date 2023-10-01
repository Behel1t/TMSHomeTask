package org.example.observer;

public class InstagramUser implements Subscriber{
    @Override
    public void showNotification(String text) {
        System.out.println("Пользователь обновил фото:"+text);
    }
}
