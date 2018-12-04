package Paquete_Main;
import java.util.Scanner;

public class Main {

   public static Scanner Scan=new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }


////////////////Menú Principal
///////////////////////////////
    public static void Menu(){

        System.out.println("Ingresa la opción");

        System.out.println("1.- Administrador");
        System.out.println("2.- Profesor");
        System.out.println("3.- Alumno");

        int opt=Scan.nextInt();

        switch (opt){
            case 1:
                Admin();
                break;

            case 2:
                Profesor();
                break;

            case 3:
                Alumno();
                break;
        }
    }


/////
    //////////////Menús de acuerdo a elección en Menu Principal

    public static void Admin(){
        PedirUsuario(0);
        if (Valido==true){
            System.out.println("Ingresa la opción");

            System.out.println("1.- Ver cuentas de usuario");
            System.out.println("2.- Registrar Profesor o alumno");
            System.out.println("3.- Eliminar un profesor o alumno");
            System.out.println("4.- Modificar la información de un profesor o alumno");
            System.out.println("5.- Asignar materias a un profesor");
            System.out.println("6.- Asignar grado y grupo a un alumno");
            System.out.println("6.- Asignar materias a un grado y grupo");
        }
        else Menu();

    }

    public static void Profesor(){
        PedirUsuario(1);

    }

    public static void Alumno(){
        PedirUsuario(2);

    }


///////////////
    //////////////////////Inicio de sesión

    public static void PedirUsuario(int NivelPriv){
        //NivelPriv recibe el nivel de privilegio de inicio de sesión.
        // 0 es de Administrador
        // 1 es de Profesor
        // 2 es de Alumno

        String Usuario;
        String Contraseña;
        Boolean Validado=false;

        System.out.println("Ingresa el Usuario: ");
        Usuario=Scan.next();
        System.out.println("\nIngresa la Contraseña: ");
        Contraseña=Scan.next();

        switch (NivelPriv){
            case 0:
                Validado=ValidarAdmin(Usuario,Contraseña);
                setValido(Validado);
                break;

            case 1:
                break;

            case 2:
                break;
        }
    }


/////////////////Variable global para saber si se ha validado
    private static boolean Valido;

    public static void setValido(Boolean Val){
        Valido=Val;
    }

    public static boolean getValido(){
        return Valido;
    }


////////////////
    ////////////////Validaciones
    public static boolean ValidarAdmin(String Usua, String Contra){
        if (Usua.equals("Root")&&Contra.equals("Admin")){
            System.out.println("Usuario validado");
            return true;
        }
        else System.out.println("Usuario inválido, intente de nuevo");
        return false;
    }

    public static boolean ValidarProf(String Usua, String Contra){
        return false;
    }

    public static boolean ValidarAlumno(String Usua, String Contra){
        return false;
    }


}

