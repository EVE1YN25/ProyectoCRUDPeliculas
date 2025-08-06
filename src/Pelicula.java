// No hay "package" porque estamos en el paquete por defecto

public class Pelicula {

    // Atributos de la clase, que corresponden a las columnas de la tabla
    private int idpeliculas;
    private String titulo;
    private String director;
    private int anio;
    private String genero;

    // Constructor vacío (necesario en muchos casos, por ejemplo, al crear un nuevo objeto)
    public Pelicula() {
    }

    // Constructor con todos los atributos (útil para crear objetos Pelicula completos)
    public Pelicula(int idpeliculas, String titulo, String director, int anio, String genero) {
        this.idpeliculas = idpeliculas;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    // --- Métodos Getters y Setters ---
    // Estos métodos permiten acceder y modificar los atributos de la clase de forma segura

    public int getIdpeliculas() {
        return idpeliculas;
    }

    public void setIdpeliculas(int idpeliculas) {
        this.idpeliculas = idpeliculas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + idpeliculas +
                ", titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", anio=" + anio +
                ", genero='" + genero + '\'' +
                '}';
    }
}
