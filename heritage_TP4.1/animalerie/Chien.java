package iset.dsi2.animalerie;

public class Chien  extends Animal{
    private String race;

    public Chien() {
    }

    public Chien(String couleur, int poids, String race) {
        super(couleur, poids);
        this.race = race;
    }
}
