public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo Carga");
    }

}
