public class POO {
    public static void main(String[] args) throws Exception {
     
        Alumno alumnoUno = new Alumno(); //Le cargue valores desde el metodo SET
        Alumno alumnoDos = new Alumno(1 , "Santino", "Balmaceda"); //Cargue valores a mano
        
        //Para mostrar resultados
        System.out.println("El id del alumno 2 es: " + alumnoDos.getId());
        System.out.println("El nombre del alumno 2 es: " + alumnoDos.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alumnoDos.getApellido());
    
        //Cargue los datos
        alumnoUno.setId(2);
        alumnoUno.setNombre("Carlos");
        alumnoUno.setApellido("Pirulo");

        System.out.println("----------------------------"); //Es para dejar espacio nomas
        
        System.out.println("El id del alumno 1 es: " + alumnoUno.getId());
        System.out.println("El nombre del alumno 1 es: " + alumnoUno.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumnoUno.getApellido());
    
        System.out.println("----------------------------"); //Es para dejar espacio nomas

        alumnoDos.setId(4); //Sobreescribe el valor anterior, osea modifico
        //Muestro los datos de nuevo pero con el id modificado
        System.out.println("El id del alumno 2 es: " + alumnoDos.getId());
        System.out.println("El nombre del alumno 2 es: " + alumnoDos.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alumnoDos.getApellido());
    
    
    }
}
