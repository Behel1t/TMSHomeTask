package org.example.observer;

public class Main {
    public static void main(String[] args) {
        InstagramChanel instagramChanel=new InstagramChanel();
        InstagramUser user1=new InstagramUser();
        InstagramUser user2=new InstagramUser();
        InstagramUser user3=new InstagramUser();
        InstagramUser user4=new InstagramUser();

        instagramChanel.addSubscriber(user1);
        instagramChanel.addSubscriber(user2);
        instagramChanel.addSubscriber(user3);
        instagramChanel.addSubscriber(user4);

        instagramChanel.removeSubscriber(user2);

        instagramChanel.updatePhotos("Моя поездка в Токио");
        

    }
}
