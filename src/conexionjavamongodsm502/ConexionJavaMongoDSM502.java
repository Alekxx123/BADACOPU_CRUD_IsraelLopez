package conexionjavamongodsm502;
import java.util.Scanner;
/*
* Author: Israel Alejandro López Tovar
* Date: 15/02/2022
* Desc: CRUD MONGO Y JAVA
*/
public class ConexionJavaMongoDSM502{
    public static void main(String[] args) {
        String accion = null, accionNueva;
        int op = 0;
        Scanner sc = new Scanner(System.in);
        Conexion conec = new Conexion();
        do{
        System.out.println("Bienvenido a CRUD MONGO DE LA UTL DEL GRUPO DSM502");
        System.out.println("***** Que opcion desea realizar :) ****");
        System.out.println("1.- Insertar ");
        System.out.println("2.- Actualizar");
        System.out.println("3.- Eliminar");
        System.out.println("4.- Mostrar");
        System.out.println("5.- Salir");
        op = sc.nextInt();
        }while(op > 5);
        switch(op){
            case 1:
            if(op == 1){
                System.out.println("Ingrese la accion a realizar");
                accion = sc.next();
                conec.insertar(accion);
                System.out.println("Se ah agregado correctamente");
            }
                break;
            case 2:
                if(op == 2){
                System.out.println("Ingrese el dato viejo");
                accion = sc.next();
                System.out.println("Ingrese el dato nuevo");
                accionNueva = sc.next();
                conec.Actualizar(accion,accionNueva);
                System.out.println("Se ah actualizado de manera correcta");
                }
                break;
            case 3:
                if(op == 3){
                    System.out.println("Ingrese el valor a eliminar");
                    accion=sc.next();
                    conec.Eliminar(accion);
                    System.out.println("Se ah eliminado de manera correcta");
                }
                break;
            case 4:
                if(op == 4){
                    System.out.println("*** Estos son los datos almacenados ***");
                    conec.mostrar();
                }
                break;
            case 5:
                System.out.println("Hasta la proxima :)");
                break;
            default:
                System.out.println("Esta opcion no existe");
        }
    }   
}