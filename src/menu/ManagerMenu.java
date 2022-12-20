package menu;

import model.Assignments;
import model.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerMenu {

    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствую дорогой, Менеджер!\n" +
                "Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 0:\n");
        while (true){
            int menuItem;
            System.out.println("1-Показать список сотрудников");
            System.out.println("2-Показать список дел");
            System.out.println("3-Добавить дело");
            System.out.println("4-Показать список указаний к сотрудникам");
            System.out.println("5-Показать список всех зон покрытия ");
            System.out.println("0-Выход ");
            menuItem = sc.nextInt();
            if(menuItem == 1){
                System.out.println(MainMenu.getListOfWorkers());
            }
            else if(menuItem == 2){
                System.out.println(MainMenu.getListOfAssignments());
            }
            else if(menuItem == 3){
                System.out.println("Введите название дела: ");
                String title = sc.next();
                ArrayList<Assignments> assignments = MainMenu.getListOfAssignments();
                assignments.add(new Assignments(title,false));
            }
            else if(menuItem == 4){
                ArrayList<Worker>workers = MainMenu.getListOfWorkers();
                for (Worker w:workers) {
                    System.out.println("Дело: "+w.getAssignments());
                    System.out.println("Login: "+w.getLogin());
                }
            }
            else if(menuItem == 5){
                    System.out.println("1-Показать зону покрытия для Бишкека");
                    System.out.println("2-Показать зону покрытия для Таласа");
                    System.out.println("3-Показать зону покрытия для Джаллабада");
                    System.out.println("4-Показать зону покрытия для Оша");
                    System.out.println("5-Показать зону покрытия для Нарына");
                    System.out.println("6-Показать зону покрытия для Иссык Куля");
                    System.out.println("7-Показать зону покрытия для Баткена");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Зона покрытия для Бишкека составляет 85%\nКоличество клиентов: 20000");
                    } else if (choice == 2) {
                        System.out.println("Зона покрытия для Таласа составляет 60%\nКоличество клиентов: 8000");
                    } else if (choice == 3) {
                        System.out.println("Зона покрытия для Джаллабада составляет 80%\nКоличество клиентов: 15000");
                    } else if (choice == 4) {
                        System.out.println("Зона покрытия для Оша составляет 82%\nКоличество клиентов: 15500");
                    } else if (choice == 5) {
                        System.out.println("Зона покрытия для Нарына составляет 70%\nКоличество клиентов: 12000");
                    } else if (choice == 6) {
                        System.out.println("Зона покрытия для Иссык Куля составляет 90%\nКоличество клиентов: 40000");
                    } else if (choice == 7) {
                        System.out.println("Зона покрытия для Баткена составляет 55%\nКоличество клиентов: 10000");
                    } else if (choice == 0) {
                        System.out.println("Выход в главное меню...");
                        return;
                    } else {
                        System.out.println("Ошибка! Введите цифру из меню!");
                    }
            }
            else if (menuItem == 0){
                System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                return;
            }


        }

    }
}
