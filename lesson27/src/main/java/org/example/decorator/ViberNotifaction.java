package org.example.decorator;

public class ViberNotifaction implements Notification {
    private Notification notification;

    public ViberNotifaction() {
    }

    public ViberNotifaction(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if(notification!=null){
            notification.send();
            System.out.println("Отправка сообщения в мессенджер");
        }
    }
}
