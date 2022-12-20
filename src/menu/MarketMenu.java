package menu;

import java.util.Scanner;

public class MarketMenu {

    static int budgetForFacebook = 1100;
    static int budgetForInstagram = 5000;
    static int budgetForTwitter = 3500;
    static int budgetForTikTok = 1535;
    static int budgetForYouTube = 8500;

    static int budgetForTelegram = 3500;
    static int maxBudget = 100000;

    public static void start() {
        System.out.println("Приветствую дорогой, Подрядчик!");
        System.out.println("Пожалуйста наберите номер меню для работы с программой, " +
                "если закончили, то наберите 0:");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int menuItem;
            System.out.println("1-Показать список всех зон охвата клиентов по регионам ");
            System.out.println("2-Показать список категорий для маркетинга");
            System.out.println("3-Показать выделенный бюджет для определенной категории мест для маркетинга");
            System.out.println("4-Показать общий бюджет для маркетинга");
            System.out.println("5-Потратить бюджет на продвижение");
            menuItem = sc.nextInt();
            if (menuItem == 1) {
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

            } else if (menuItem == 2) {
                System.out.println("Платформа: Facebook\nКоличество пользователей: 407 миллионов");
                System.out.println("Платформа: Instagram\nКоличество пользователей: 2,96 млрд");
                System.out.println("Платформа: Tik Tok\nКоличество пользователей: более 1 миллиарда");
                System.out.println("Платформа: Twitter\nКоличество пользователей: 1,3 млрд");
                System.out.println("Платформа: YouTube\nКоличество пользователей: 122 миллиона");
                System.out.println("Платформа: Telegram\nКоличество пользователей: более 700 миллионов");
            } else if (menuItem == 3) {
                System.out.println("Платформа: Facebook\nЦена за маркетинг: " + budgetForFacebook);
                System.out.println("Платформа: Instagram\nЦена за маркетинг: " + budgetForInstagram);
                System.out.println("Платформа: Tik Tok\nЦена за маркетинг: " + budgetForTikTok);
                System.out.println("Платформа: Twitter\nЦена за маркетинг: " + budgetForTwitter);
                System.out.println("Платформа: YouTube\nЦена за маркетинг: " + budgetForYouTube);
                System.out.println("Платформа: Telegram\nЦена за маркетинг: " + budgetForTelegram);
            }
            else if(menuItem == 4){
                System.out.println("Общий бюджет для маркетинга состовляет: "+maxBudget);
            }
            else if(menuItem == 5){
                System.out.println("Выберите название для продвижения: ");
                System.out.println("1-Facebook");
                System.out.println("2-Instagram");
                System.out.println("3-Tik Tok");
                System.out.println("4-Twitter");
                System.out.println("5-YouTube");
                System.out.println("6-Telegram");
                System.out.println("0-Выход");
                int choice = sc.nextInt();
                if(choice == 1 ){
                    System.out.println("Наберите сумму расхода, которую вы хотите потратить из бюджета: ");
                    int sum = sc.nextInt();
                    if(sum>maxBudget){
                        System.out.println("Ваша сумма превышает максимальный бюджет для маркетинга!");
                    }
                    else {
                        int remainder = maxBudget - sum;
                        System.out.println("Из бюджета("+maxBudget+") вычитается сумма("+sum+") остаток на балансе: "+remainder);
                        maxBudget = remainder;
                    }
                } else if (choice == 2) {
                    System.out.println("Наберите сумму расхода, которую вы хотите потратить из бюджета: ");
                    int sum = sc.nextInt();
                    if(sum>maxBudget){
                        System.out.println("Ваша сумма превышает максимальный бюджет для маркетинга!");
                    }
                    else {
                        int remainder = maxBudget - sum;
                        System.out.println("Из бюджета("+maxBudget+") вычитается сумма("+sum+") остаток на балансе: "+remainder);
                        maxBudget = remainder;
                    }
                }
                else if (choice == 3) {
                    System.out.println("Наберите сумму расхода, которую вы хотите потратить из бюджета: ");
                    int sum = sc.nextInt();
                    if(sum>maxBudget){
                        System.out.println("Ваша сумма превышает максимальный бюджет для маркетинга!");
                    }
                    else {
                        int remainder = maxBudget - sum;
                        System.out.println("Из бюджета("+maxBudget+") вычитается сумма("+sum+") остаток на балансе: "+remainder);
                        maxBudget = remainder;
                    }
                }
                else if (choice == 4) {
                    System.out.println("Наберите сумму расхода, которую вы хотите потратить из бюджета: ");
                    int sum = sc.nextInt();
                    if(sum>maxBudget){
                        System.out.println("Ваша сумма превышает максимальный бюджет для маркетинга!");
                    }
                    else {
                        int remainder = maxBudget - sum;
                        System.out.println("Из бюджета("+maxBudget+") вычитается сумма("+sum+") остаток на балансе: "+remainder);
                        maxBudget = remainder;
                    }
                }
                else if (choice == 5) {
                    System.out.println("Наберите сумму расхода, которую вы хотите потратить из бюджета: ");
                    int sum = sc.nextInt();
                    if(sum>maxBudget){
                        System.out.println("Ваша сумма превышает максимальный бюджет для маркетинга!");
                    }
                    else {
                        int remainder = maxBudget - sum;
                        System.out.println("Из бюджета("+maxBudget+") вычитается сумма("+sum+") остаток на балансе: "+remainder);
                        maxBudget = remainder;
                    }
                }
                else if (choice == 6) {
                    System.out.println("Наберите сумму расхода, которую вы хотите потратить из бюджета: ");
                    int sum = sc.nextInt();
                    if(sum>maxBudget){
                        System.out.println("Ваша сумма превышает максимальный бюджет для маркетинга!");
                    }
                    else {
                        int remainder = maxBudget - sum;
                        System.out.println("Из бюджета("+maxBudget+") вычитается сумма("+sum+") остаток на балансе: "+remainder);
                        maxBudget = remainder;
                    }
                }
                else if(choice == 0){
                    System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                    return;
                }
            }


        }
    }


}
