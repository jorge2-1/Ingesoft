package ui;
import model.Controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    Controller controller = new Controller();
    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        Main main = new Main();

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
        }catch (Exception e){}



    }
}
