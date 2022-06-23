public class Person {

    public boolean checkUser(String user){
        return user.matches("[0-9a-zA-Z]{8,}$");
    }

    public boolean checkPassword(String password){
        return password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$");
    }


}
