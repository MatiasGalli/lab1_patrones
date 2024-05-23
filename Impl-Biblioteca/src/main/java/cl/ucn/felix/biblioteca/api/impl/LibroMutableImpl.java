package cl.ucn.felix.biblioteca.api.impl;

public class LibroMutableImpl {
    public LibroMutableImpl(String isbn) {
    }

    public String toString ( ) {
        StringBuffer buf = new StringBuffer ( ) ;
        buf.append(this.getCategoria()).append(": ");
        buf.append(this.getTitulo()).append("de").append(this.getAutor());
        return buf.toString();
    }

    private String getIsbn(){
        return null;
    }
    private String getAutor() {
        return null;
    }

    private String getTitulo() {
        return null;
    }

    private String getCategoria() {
        return null;
    }
}
