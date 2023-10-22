package iset.dsi2.animalerie;

public class TestHeritage {
    public static void main(String[] args) {
        Animal [] t=new Animal[3];
        t[0]=new Animal("Black",20);
        t[1]=new Chat("pink",5,true);
        t[2]=new Chien("yellow",12,"chiwawa");
        for(int i=0;i<3;i++){
            if (t[i]instanceof iset.dsi2.animalerie.Chat || t[i]instanceof iset.dsi2.animalerie.Chien) {
                t[i].decrisToi();
                t[i].crier();
                t[i].manger();
                t[i].boire();
            }
            else{
                System.out.println("L’espèce de cet animal est inconnue");
                t[i].decrisToi();
                t[i].crier();
                t[i].manger();
                t[i].boire();
            }
        }
    }
}
