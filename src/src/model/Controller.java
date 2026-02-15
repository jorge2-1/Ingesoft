package model;
import java.util.ArrayList;
public class Controller {
    ArrayList<User> users =  new ArrayList<>();

    public String searchUserForName(String name) {
        if (users.isEmpty()) {
            return "Usuario no existentes";
        }
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user.toString();
            }
        }
        return "No existe el usuario con el nombre : " + name;
    }

    public String addUser(String name,  String id, String phoneNumber) {
        User user = new User(name,id,phoneNumber);
        users.add(user);
        return "El usuario fue agregado correctamente";
    }

    public String searchUserForId(String id) {
        if (users.isEmpty()) {
            return "Usuario no existentes";
        }
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user.toString();
            }
        }
        return "No existe el usuario con el identificador : " + id;
    }
    public String searchUserForPhoneNumber(String number) {
        if (users.isEmpty()) {
            return "Usuario no existentes";
        }
        for (User user : users) {
            if (user.getPhoneNumber().equals(number)) {
                return user.toString();
            }
        }
        return "No existe el usuario con el numero : " + number;
    }
}
