package model;

public class Assignments {
    String text;
    boolean status;

    public Assignments(String text, boolean status) {
        this.text = text;
        this.status = status;
    }

    public Assignments() {
    }

    @Override
    public String toString() {
        return "Поручения: {" +
                "текст='" + text + '\'' +
                ", выполнено=" + status +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
