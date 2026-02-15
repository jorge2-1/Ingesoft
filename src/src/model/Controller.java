package model;
import java.util.ArrayList;
public class Controller {
    ArrayList<User> users =  new ArrayList<>();

    public String searchUserForName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user.toString();
            }
        }
        return "No existe el usuario con el nombre : " + name;
    }
}
