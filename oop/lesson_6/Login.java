package lesson_6;

import java.util.Objects;
import java.util.regex.Pattern;

public class Login {

    String login;
    String password;
    String confirmPassword;

    public Login(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login1 = (Login) o;
        return login.equals(login1.login) && password.equals(login1.password) && confirmPassword.equals(login1.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, confirmPassword);
    }

    public static void validateLogin(String login) throws WrongLoginException {
        if (Pattern.matches("[a-zA-Z0-9_]{1,20}", login)) {
            System.out.println(true);
        } else if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        } else if (!login.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongLoginException("Введены недопустимые символы");
        } else {
            System.out.println("Логин зарегистрирован");
        }
    }

    public static void validatePassword(String password) throws WrongPasswordException {
        if (Pattern.matches("[a-zA-Z0-9_]{1,20}", password)) {
            System.out.println(true);
        } else if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        } else if (!password.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongPasswordException("В пароль введены недопустимые символы");
        } else {
            System.out.println("Пароль введен");
        }
    }

    public static void validateConfirmPassword(String confirmPassword, String password) throws WrongPasswordException {
        if (confirmPassword.hashCode() == password.hashCode()){
            System.out.println("Введенные пароли совпадают");
        } else throw new WrongPasswordException("введенный пароль не совпадает с первоначальным");
    }

    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
       Login user = new Login("1456jhfuytr1456666225584553215645664", "987456ac","987456abc");

//        validateLogin(user.getLogin());
        validatePassword(user.getPassword());
        validateConfirmPassword(user.getPassword(), user.getConfirmPassword());
    }
}
