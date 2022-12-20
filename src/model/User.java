package model;

import enums.TypeOfAccount;

import java.util.Objects;

public class User {
    private TypeOfAccount typeOfAccount;
    private String login;
    private String password;

    public User(TypeOfAccount typeOfAccount, String login, String password) {
        this.typeOfAccount = typeOfAccount;
        this.login = login;
        this.password = password;
    }

    public TypeOfAccount getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return typeOfAccount == user.typeOfAccount && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAccount, login, password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
