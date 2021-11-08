package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Secteur {

    TypeAnimal typeAnimauxDansSecteur ;
    List<Animal> animauxDansSecteur = new ArrayList<Animal>();

    public Secteur(TypeAnimal typeAnimauxDansSecteur){
        this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
    }

    public Secteur(){

    }

    public void ajouterAnimal(Animal animal){
        animauxDansSecteur.add(animal);

    }

    public int getNombreAnimaux(){
        return animauxDansSecteur.size();

    }

    public TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }
}