package org.tms;

public class Phone {
    private String number;
    private String model;
    private int weight;
    private String name;

    public Phone(String number,String model,int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
        this.PhoneNumberModel(number,model);
    }
    public void PhoneNumberModel(String number,String model){
        this.number=number;
        this.model=model;
    }
    public void ConstructorPhone(){
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {

        return weight;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void getInfo() {

        System.out.println("Номер:"+number+", Модель:"+model+", Вес:"+weight);
    }
    public void receiveCall(String name,String number){
        System.out.println("Звонит "+name+" "+number);
    }

    public void sendMessage(String ... numbers){
        System.out.print("Отправить сообщение на номера: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

