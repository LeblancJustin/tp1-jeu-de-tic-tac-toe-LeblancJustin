package dm.a21.tictactoetp1;

public class JeuTTT extends ModeleJeu {
    public Joueur changementTourDeJeu (Joueur j) {
        if(j == Joueur.O)
            return Joueur.X;
        else
            return Joueur.O;
    }
    public Joueur tourDeJeuActuel  (Joueur j) {
        return j;
    }
}
