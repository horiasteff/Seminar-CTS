package factoryDesign;

public class FactoryPachetComplet implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetComplet();
    }
}
