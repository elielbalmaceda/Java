public class EjercicioIntegrador {
    public static void main(String[] args) throws Exception {

        // Creo los pokemones en forma de objeto
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();

        // Llamo a cada uno
        squirtle.atacarHidrobomba();
        squirtle.atacarMordisco();
        charmander.atacarAscuas();
        charmander.atacarAraniazo();
        bulba.atacarHojaAfilada();
        bulba.atacarAraniazo();
        pika.atacarImpactrueno();
        pika.atacarMordisco();

    }
}
