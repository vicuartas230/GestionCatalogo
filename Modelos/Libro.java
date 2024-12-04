package Modelos;

public class Libro {
    private String titulo;
    private String autor;
    private Integer ISBN;

    public Libro(String titulo, String autor, Integer iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        ISBN = iSBN;
    }


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }


    @Override
    public boolean equals(Object obj) {
        Libro otroLibro = (Libro) obj;
        return otroLibro.ISBN.equals(ISBN);
        // return otroLibro.ISBN == ISBN;
    }

    @Override
    public int hashCode() {
        return ISBN;
    }
}
