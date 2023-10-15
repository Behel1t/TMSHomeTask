package org.example.decorator;

public class SmsNotifaction implements Notification {
    private Notification notification;

    public SmsNotifaction() {
    }

    public SmsNotifaction(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(){
        if(notification!=null) {
            notification.send();
            System.out.println("Отправка sms сообщения");
        }
    }
}
