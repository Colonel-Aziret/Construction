package menu;

import model.Worker;

import java.util.Scanner;

public class WorkerMenu {
    public static void start(Worker worker){
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствую дорогой, Сотрудник  "+worker.getLogin() +"!\n" +
                "Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 5:\n");
    }
}
