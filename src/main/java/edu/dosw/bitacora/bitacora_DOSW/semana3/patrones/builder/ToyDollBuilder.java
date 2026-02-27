package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.builder;

public interface ToyDollBuilder {
    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    void addAccessories();
    ToyDoll getResult();
}
