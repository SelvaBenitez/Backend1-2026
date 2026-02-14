package clase1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Scoop*/

public class App1 {

    final static int ANNO_ACTUAL = 2026;
/*No devuelve respuesta*/
    public static void msg(String msg){
        System.out.println(msg);
    }

   public static void main(String[] args) {
       final String MENSAJE_BIENVENIDO = "Bienvenidos a este nuevo semestre";
       String[] nombreEstudiantes = {"Isabel", "Jesus", "Gabriela", "Esteban", "Pedro"};
       int[] anosNacimiento = {2003, 2004, 2005, 2006, 2007};

       list<int[]> edadEstudiantes = ArrayList<>();
   }
/*Retorna elemento*/
   static int calcularEdad(int anosNacimiento){
        return ANNO_ACTUAL - anosNacimiento;
   }
}


