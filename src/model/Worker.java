package model;

import enums.TypeOfAccount;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Worker {
    private int id;
    private int salary;
    private List<Assignments> assignments;

    private String login;

    private String password;

  private  TypeOfAccount typeOfAccount;

    public Worker(int id, String login,String password, int salary, List<Assignments> assignments) {
        this.typeOfAccount = TypeOfAccount.WORKER;
        this.id = id;
        this.salary = salary;
        this.assignments = assignments;
        this.login = login;
        this.password = password;
    }

    public Worker(String login, String password) {
    }

    @Override
    public String toString() {
        return
                "id=" + id +"\n"+
                "зарплата=" + salary +"\n"+
                "поручения=" + assignments +"\n"+
                "логин='" + login + "\n"+
                "пароль='" + password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeOfAccount getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id == worker.id && salary == worker.salary && Objects.equals(assignments, worker.assignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, assignments);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Assignments> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignments> assignments) {
        this.assignments = assignments;
    }
}
