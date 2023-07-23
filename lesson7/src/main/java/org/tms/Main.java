package org.tms;

public class Main {
    public static void main(String[] args) {
        Phone samsung=new Phone("295598204","Samsung A3",100);
        Phone iphone=new Phone("334896735","Iphone X13",90);
        Phone xiaomi=new Phone("298759930","Xiaomi 13-PRO",120);
        samsung.getInfo();
        iphone.getInfo();
        xiaomi.getInfo();
        samsung.receiveCall("Николай","296333145");
        iphone.receiveCall("Asuka Langley Soryu","334444825");
        xiaomi.receiveCall("Gena","295554893");
        samsung.sendMessage("298744930","298752549","298759931");
        iphone.sendMessage("292759930","296589930");
        xiaomi.sendMessage("298979930","295559930");


    }
}
