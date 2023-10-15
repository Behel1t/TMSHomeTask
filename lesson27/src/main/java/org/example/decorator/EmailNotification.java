package org.example.decorator;

public class EmailNotification implements Notification {
    private Notification notification;

    public EmailNotification() {
    }

    public EmailNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(){
        if(notification!=null) {
            notification.send();
        System.out.println("Отправка e-mail сообщения");
        }
    }

}
