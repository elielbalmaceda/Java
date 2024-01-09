public class Alumno {

    // Atributos
    private int id; // Siempre tiene que ir private
    private String nombre;
    private String apellido;

    // Constructor vacio
    public Alumno() { // Si pongo private no puedo usarlo en otro lado, me va a pedir que cree un
                      // constructor
    }

    // Constructor
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
