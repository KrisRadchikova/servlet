package by.tms.home.model;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String login;
    private String password;
    private String question;
    private String answer;
    private Role role;
    private Basket basket;

    public User() {
    }

    public User(String name, String login, String password, Role role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User(String name, String login, String password, Role role, Basket basket) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.basket = basket;
    }

    public User(String name, String login, String password, String question, String answer, Role role, Basket basket) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.question = question;
        this.answer = answer;
        this.role = role;
        this.basket = basket;
    }

    public User(int id, String name, String login, String password, String question, String answer) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.question = question;
        this.answer = answer;
    }

    public Role getRole(){
        return role;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean setPassword(String password) {
        this.password = password;
        return false;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

}
