// 4.Условные операторы:Программа для вывода условий температуры на улице.
import java.util.Scanner;

public class temperatureOutside {
    public static void main(String[] args) {
        System.out.println("Какая температура на улице?");
        Scanner number=new Scanner(System.in);
        int temperature=number.nextInt();
        if (temperature>-5){
            System.out.println("Тепло");
        }
        else if (temperature>-20 && temperature<=-5){
            System.out.println("Нормально");
        }
        else if (temperature<-20){
            System.out.println("Холодно");
        }
    }
}
