package menu;

import enums.TypeOfAccount;
import model.Assignments;
import model.User;
import model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainMenu {

public static ArrayList<Worker> getListOfWorkers(){
    //****************************************************************************** Workers
    ArrayList<Worker>workers = new ArrayList<>();
    workers.add(new Worker(1,"Janybek","123",15000,getListOfAssignments()));
    workers.add(new Worker(2,"Artur","1234",10000,null));
    workers.add(new Worker(3,"Artem","12345",12000,null));
    return workers;
}
public static ArrayList<Assignments> getListOfAssignments(){
    ArrayList<Assignments> assignments = new ArrayList<>();
    assignments.add(new Assignments("Test assignment",false));
    assignments.add(new Assignments("Test assignment",true));
    assignments.add(new Assignments("Test assignment",false));
    return assignments;
}
public static ArrayList<User> getListOfUsers(){
    //****************************************************************************** Users
    ArrayList<User> users = new ArrayList<>();
    users.add(new User(TypeOfAccount.MANAGER, "Astik", "123"));
    users.add(new User(TypeOfAccount.MARKETING, "Azik", "123"));
    users.add(new User(TypeOfAccount.DIRECTOR, "Alma", "123"));
    users.add(new User(TypeOfAccount.SALE_MANAGER, "Asel", "123"));
    users.add(new User(TypeOfAccount.HR, "Raim", "123"));
    users.add(new User(TypeOfAccount.WORKER, "Test", "123"));
    return users;
}
    public static void start() {
        ArrayList<Assignments> assignments = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String login = "";
        String password = "";
        String typeOfAcc="";
        String typeWorker=TypeOfAccount.WORKER.name();
        boolean success = true;
        Worker w = null;
        while (true) {
            System.out.println("Для запуска программы, пожалуйста введите тип аккаунта, логин и пароль>>> ");
            System.out.println("Введите тип аккаунта: ");
            String type = sc.next();
            System.out.println("Тип аккаунта: "+type);
            System.out.println("Введите логин пароль: ");
            login = sc.next();
            sc.nextLine();
            sc.nextLine();
            password = sc.nextLine();
            System.out.println("Введенный логин: " + login);
            System.out.println("Введенный пароль: " + password);
            User u = null;
            if (type.toUpperCase().equals(TypeOfAccount.MARKETING.name())) {
                u = new User(TypeOfAccount.MARKETING,login,password);
            }
            else if (type.toUpperCase().equals(TypeOfAccount.DIRECTOR.name())){
                 u = new User(TypeOfAccount.DIRECTOR,login,password);
            }
            else if (type.toUpperCase().equals(TypeOfAccount.HR.name())){
                u = new User(TypeOfAccount.HR,login,password);
            }
            else if (type.toUpperCase().equals(TypeOfAccount.WORKER.name())){//с воркером не заходит
                for (Worker worker: getListOfWorkers()) {
                    if(worker.getLogin().contains(login) && worker.getPassword().contains(password)){
                        w = new Worker(worker.getId(),worker.getLogin(),worker.getPassword(),worker.getSalary(),worker.getAssignments());
                    }
                }
            }
            else if (type.toUpperCase().equals(TypeOfAccount.SALE_MANAGER.name())){
                u = new User(TypeOfAccount.SALE_MANAGER,login,password);
            }
            else if (type.toUpperCase().equals(TypeOfAccount.MANAGER.name())){
                u = new User(TypeOfAccount.MANAGER,login,password);
            }
            ArrayList<User>users = getListOfUsers();
            ArrayList<Worker>workers = getListOfWorkers();
            boolean isWorkerExists = contains(getListOfWorkers(),w);
            boolean isExists = contains(users,u);
            System.out.println(isExists);
            if(isExists || isWorkerExists){
                System.out.println("Вы успешно вошли в аккаунт!");
                typeOfAcc = u.getTypeOfAccount().name();
                typeWorker = w.getTypeOfAccount().name();
                break;
            }
            else {
                System.out.println("Извините, но мы не нашли такой тип аккаунта, логин или пароль, пожалуйста повторите.");
            }

        }

        System.out.println(typeOfAcc);
        if (typeOfAcc.toUpperCase().equals(TypeOfAccount.MARKETING.name())){
            MarketMenu.start();
        }
       else if (typeOfAcc.toUpperCase().equals(TypeOfAccount.MANAGER.name())){
            ManagerMenu.start();
        }
       else if(typeWorker.toUpperCase().equals(TypeOfAccount.WORKER.name())){

           WorkerMenu.start(w);
        }
    }
        private static boolean contains(List <User> list, User user) {
            for (User e : list) {
                if (Objects.equals(e, user)) {
                    return true;
                }
            }
            return false;
        }
    private static boolean contains(List <Worker> list, Worker worker) {
        for (Worker w : list) {
            if (Objects.equals(w ,worker)) {
                return true;
            }
        }
        return false;
    }



}
