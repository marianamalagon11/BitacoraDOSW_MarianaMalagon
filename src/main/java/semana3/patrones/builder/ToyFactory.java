package semana3.patrones.builder;

public class ToyFactory {
    public ToyDoll constructDoll(ToyDollBuilder builder) {
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
        return builder.getResult();
    }
}
