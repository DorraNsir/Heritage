package Heritage;

public class Entreprise {
    public static void main(String[] args) {
        Heritage.Salarie[] tabSalarie = new Heritage.Salarie[5];
        Heritage.Employe sal1 = new Heritage.Employe(12345, "walid", 2002, 15, 4);
        Heritage.Vendeur sal2 = new Heritage.Vendeur(23445, "yessmin", 2007, 1000, 0.1);
        Heritage.Vendeur sal3 = new Heritage.Vendeur(65478, "nassim", 2000, 700, 0.1);
        Heritage.Employe sal4 = new Heritage.Employe(87698, "Aymen ", 2003, 19, 5);
        Heritage.Employe sal5 = new Heritage.Employe(12345, "Khaled", 2008, 7, 4);
        tabSalarie[0] = sal1;
        tabSalarie[1] = sal2;
        tabSalarie[2] = sal3;
        tabSalarie[3] = sal4;
        tabSalarie[4] = sal5;
        System.out.println("******************************** Liste des Employés*****************************");

       for (int i=0;i<tabSalarie.length;i++){
           if(tabSalarie[i]instanceof Heritage.Employe){
               System.out.println(tabSalarie[i].affiche());
           }
       }


        System.out.println("********************************  Liste des Vendeurs*****************************");
        for (int i=0;i<tabSalarie.length;i++){
            if(tabSalarie[i]instanceof Heritage.Vendeur){
                System.out.println(tabSalarie[i].affiche());
            }
        }
        System.out.println("******************* Nom du salarié le plus ancien dans l'entreprise ********************");
        int index= Heritage.Salarie.teste(tabSalarie);
        System.out.println("nom : "+ tabSalarie[index].getNom()+" recrute en l'annee "+ tabSalarie[index].getRecrutement());
        System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");
        Salarie SalMax=null;
        for (int i=0;i<tabSalarie.length;i++){
            if(tabSalarie[i]instanceof Vendeur){
                if(SalMax==null){
                    SalMax=tabSalarie[i];
                }
                else{
                    if(SalMax.Salaire()<tabSalarie[i].Salaire()){
                        SalMax=tabSalarie[i];
                    }
                }

            }
        }
        System.out.println("Matricule = "+SalMax.getMatricule()+"de salaire = "+SalMax.Salaire());



    }

}

