package views;

import models.Rol;
import models.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ===================== Rol ============================
        System.out.println("======== Inicio de recopilación de datos del ROL ========");

        Rol objRol = new Rol();

        System.out.print("Ingrese el ID del rol: ");
        int rolId = scan.nextInt();
        scan.nextLine(); // limpiar el buffer

        System.out.print("Ingrese el tipo de rol: ");
        String rolName = scan.nextLine();

        objRol.setRol_id(rolId);
        objRol.setRol_name(rolName);

        System.out.println("---- Datos del rol ----");
        System.out.println("ID: " + objRol.getRol_id());
        System.out.println("Nombre: " + objRol.getRol_name());

        System.out.println("--------- Finalizado los datos del rol ---------");

        // ===================== Usuario ============================
        System.out.println("======== Inicio de recopilación de datos del USUARIO ========");

        User objUser = new User();

        objUser.setRol_id(rolId); // Se usa el mismo rol ingresado anteriormente

        System.out.print("Ingrese el ID del Usuario: ");
        int userId = scan.nextInt();
        scan.nextLine(); // limpiar buffer

        System.out.print("Ingrese el nombre del Usuario: ");
        String nombre = scan.nextLine();

        System.out.print("Ingrese el apellido del Usuario: ");
        String apellido = scan.nextLine();

        System.out.print("Ingrese el correo del Usuario: ");
        String correo = scan.nextLine();

        System.out.print("Ingrese la contraseña del Usuario: ");
        String password = scan.nextLine();

        System.out.print("¿El usuario está activo? true(si) / false(no): ");
        boolean activo = scan.nextBoolean();

        objUser.setUser_id(userId);
        objUser.setUser_name(nombre);
        objUser.setUser_lastname(apellido);
        objUser.setUser_email(correo);
        objUser.setUser_pass(password);
        objUser.setUser_state(activo);

        System.out.println("---- Datos del Usuario ----");
        System.out.println("Rol ID: " + objUser.getRol_id());
        System.out.println("ID del usuario: " + objUser.getUser_id());
        System.out.println("Nombre: " + objUser.getUser_name());
        System.out.println("Apellido: " + objUser.getUser_lastname());
        System.out.println("Correo: " + objUser.getUser_email());
        System.out.println("Contraseña: " + objUser.getUser_pass());
        System.out.println("Estado activo: " + objUser.getUser_state());

        scan.close();
    }
}
