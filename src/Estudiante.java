public class Estudiante extends Persona {
    private int Codigo ;
    private String Carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int codigo, String carrera) {
        super(nombre, edad);
        Codigo = codigo;
        Carrera = carrera;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
