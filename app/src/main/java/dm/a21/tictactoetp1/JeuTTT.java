package dm.a21.tictactoetp1;

public class JeuTTT extends ModeleJeu {
    Joueur joueur;
    public void changementTourDeJeu () {
        if(joueur == Joueur.O)
            joueur = Joueur.X;
        else
            joueur = Joueur.O;
    }
    public Joueur tourDeJeuActuel  () {
        return joueur;
    }
    public void initialiserTour () {
        joueur = Joueur.X;
    }
}
