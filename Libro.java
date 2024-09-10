public class Libro {
    String titulo;
    String autor;
    String propietario;
    double precio;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void  libro(String titulo, String autor) {
    System.out.println(titulo);
    System.out.println(autor);
    }

    public void imprimir(String titulo, String autor, String propietario, double precio){
        System.out.println("Titulo del libro:"+titulo);
        System.out.println("Autor del libro:"+autor);
        System.out.println("Propietario del libro:"+propietario);
        System.out.println("Precio del libro"+precio);
    }
    
}
