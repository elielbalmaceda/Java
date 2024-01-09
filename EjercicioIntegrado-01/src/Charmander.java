public class Charmander extends Pokemon implements IFuego {

    public Charmander() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y estoy atacando con Arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puño de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanzallamas");
    }

}
