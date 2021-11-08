package Zoo;

import java.util.*;

public class Zoo extends Animal {
    public int visiteur;
    public int nbvisiteurMaxParSecteur;
    List<Secteur> secteurAnimaux = new ArrayList();

    public Zoo(int nbvisiteurMaxParSecteur, int visiteur){
        this.visiteur=visiteur;
        this.nbvisiteurMaxParSecteur=nbvisiteurMaxParSecteur;
        try{
            this.nouveauVisiteur(visiteur);

        }catch (LimiteVisiteurException e) {
            e.printStackTrace();
        }
    }


    public void ajouterSecteur(TypeAnimal p) {
        Secteur secteuranimaux = new Secteur(p);
        secteurAnimaux.add(secteuranimaux);

    }

    public void nouveauVisiteur(int visiteur) throws LimiteVisiteurException {
        this.visiteur=visiteur;
        if (nbvisiteurMaxParSecteur<15){
            nbvisiteurMaxParSecteur+=1;
        }else{
            throw new LimiteVisiteurException("le nombre de visiteur est deja depassé");
        }

    }

    public int getLimiteVisiteur() {

        return visiteur;
    }

    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {

        for (Secteur secteur: secteurAnimaux){
            if (secteur.obtenirType() == animal.typeAnimal){
                secteurAnimaux.add(secteur);
            }else{
                throw new AnimalDansMauvaisSecteurException("l'animal est dans le mauvais secteur ");
            }

        }

    }

}