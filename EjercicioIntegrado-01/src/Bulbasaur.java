public class Bulbasaur extends Pokemon implements IPlanta { // Bulbasaur es un pokemon, por eso extiende la clase.
                                                            // Implementa metodos de la clase Planta

    public Bulbasaur() { // Implemento un constructor vacio

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con Latigo Cepa");
    }

}
