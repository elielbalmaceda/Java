public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }

}
