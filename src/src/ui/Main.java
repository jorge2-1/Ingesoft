package ui;
import model.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    Controller controller = new Controller();
    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();

    }

    public void CreatedUser(){
        try {
            System.out.print("Bienvenido:\n Por favor ingrese los siguentes datos:\n");
            System.out.print("Nombre completo: ");
            String name = reader.readLine();
            System.out.print("Numero de contactos: ");
            String number = reader.readLine();
            System.out.print("Numero de identificacion: ");
            String id = reader.readLine();
            String mensaje = controller.addUser(name, number, id);
            System.out.println(mensaje);
        }catch (Exception e){}
    }
    public void searchUserByName(){
        try {
            System.out.print("Nombre del usuario: ");
            String name = reader.readLine();
            System.out.print(controller.searchUserForName(name));
        }catch (Exception e){}
    }
    public void searchUserByPhoneNumber(){
        try {
            System.out.print("Numero de contacto: ");
            String number = reader.readLine();
            System.out.print(controller.searchUserForPhoneNumber(number));
        }catch (Exception e){}
    }
    public void searchUserById(){
        try {
            System.out.print("Ingresa la identificacion del usuario: ");
            String id = reader.readLine();
            System.out.print(controller.searchUserForId(id));
        } catch (Exception e) {
        }
    }
    public void search(){
        while(true) {
            try {
                System.out.print("De que manera deseas buscar:\n1)Nombre\n2)Identificacion\n3)Numero de telefono");
                String decision = reader.readLine();
                if (decision.equalsIgnoreCase("1")) {
                    searchUserByName();
                    break;
                } else if (decision.equalsIgnoreCase("2")) {
                    searchUserById();
                    break;
                } else if (decision.equalsIgnoreCase("3")) {
                    searchUserByPhoneNumber();
                    break;
                }
            } catch (Exception e) {
            }
        }
    }
    public void menu(){
        boolean exit = false;
        while(!exit) {
            try {
                System.out.print("\nBienvenido\n1)Ingresar nuevo usuario\n2)Buscar usuario\n3)salir\n");
                String decision =   reader.readLine();
                if(decision.equals("1")){
                    CreatedUser();
                }
                else if(decision.equals("2")){
                    search();
                } else if (decision.equals("3")) {
                    System.out.print("Hasta luego\n");
                    exit = true;
                }
                else{
                    System.out.println("Opcion no correcta");
                }

            }catch (Exception e){}

        }
    }
}
