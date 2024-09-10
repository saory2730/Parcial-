public class Novela extends Libro {
    String tipo[]= {"Historica","Romantica","Policiaca","Realista","Ciencia ficcion","Aventuras"};
    
    public void novela(String titulo, String autor, String propietario,double precio,String curso,String facultad,String tipo ){

        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Propietario: "+propietario);
        System.out.println("Precio: "+precio);
        System.out.println("Curso: "+curso);
        System.out.println("Facultad: "+facultad);
        System.out.println("Tipo: "+tipo);

}
public void imprimir(){
    System.out.println("Titulo del libro:"+titulo);
    System.out.println("Autor del libro:"+autor);
    System.out.println("Propietario del libro:"+propietario);
    System.out.println("Precio del libro"+precio);
    System.out.println("Tipo de novela: "+ tipo);
    
}
}
