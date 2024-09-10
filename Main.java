//Katerin Saory Cortes Quiñones

import java.util.*;
public class Main {
    public static void main(String[] args) {

System.out.println();
        System.out.println("*****LIBRO*****");

        Libro libro1=new Libro();
System.out.println();

libro1.libro("El coronel no tiene quien le escriba", "Gabriel Garcia");
libro1.imprimir("El coronel no tiene quien le escriba", "Gabriel Garcia", "Katerin cortes", 45000);
 System.out.println();
   LibroTexto libro2 =new LibroTexto();
   libro2.libroTexto("Cien años de soledad", "Gabriel Garcia", "Katerin cortes", 67000, "b411");
System.out.println();


   LibroTextoUniajc libro3=new LibroTextoUniajc();
   
libro3.LibroTextoUniajc("Sara tomate", "Tom", "Katerin cortes", 76000, "C421", "Salud");
System.out.println();
   Novela libro4= new Novela();
   libro4.novela("Satanas", "Andres", "Katerin cortes", 80000, "B311", "Ingenieria","Policiaca");
    }




    
}
