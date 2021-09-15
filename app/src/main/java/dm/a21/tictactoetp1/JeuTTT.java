package dm.a21.tictactoetp1;

import android.widget.ImageView;

public class JeuTTT extends ModeleJeu {
    private Joueur joueur;
    private int iNbToursJoués = 0;
    private boolean bPartieTerminée = false;

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
    public void tourJoué () { iNbToursJoués++; }

    public String Logique (char[] casesJeu) {
        //X = 700068
        //O = 700061
        if(casesJeu[0] != '\u0000' && casesJeu[0] == casesJeu[1] && casesJeu[1] == casesJeu[2])
        {
            //Ligne Horizontale #1
            return "Partie Gagnée par " + Character.toString(casesJeu[0]);
        }
        else if (casesJeu[3] != '\u0000' && casesJeu[3] == casesJeu[4] && casesJeu[4] == casesJeu[5])
        {
            //Ligne Horizontale #2
            return "Partie Gagnée par " + Character.toString(casesJeu[3]);
        }
        else if (casesJeu[6] != '\u0000' && casesJeu[6] == casesJeu[7] && casesJeu[7] == casesJeu[8])
        {
            //Ligne Horizontale #3
            return "Partie Gagnée par " + Character.toString(casesJeu[6]);
        }
        else if (casesJeu[0] != '\u0000' && casesJeu[0] == casesJeu[3] && casesJeu[3] == casesJeu[6])
        {
            //Ligne Verticale #1
            return "Partie Gagnée par " + Character.toString(casesJeu[0]);
        }
        else if (casesJeu[1] != '\u0000' && casesJeu[1] == casesJeu[4] && casesJeu[4] == casesJeu[7])
        {
            //Ligne Verticale #2
            return "Partie Gagnée par " + Character.toString(casesJeu[1]);
        }
        else if (casesJeu[2] != '\u0000' && casesJeu[2] == casesJeu[5] && casesJeu[5] == casesJeu[8])
        {
            //Ligne Verticale #3
            return "Partie Gagnée par " + Character.toString(casesJeu[2]);
        }
        else if (casesJeu[0] != '\u0000' && casesJeu[0] == casesJeu[4] && casesJeu[4] == casesJeu[8])
        {
            //Diagonale #1
            return "Partie Gagnée par " + Character.toString(casesJeu[0]);
        }
        else if (casesJeu[2] != '\u0000' && casesJeu[2] == casesJeu[4] && casesJeu[4] == casesJeu[6])
        {
            //Diagonale #2
            return "Partie Gagnée par " + Character.toString(casesJeu[2]);
        }
        else
        {
            if(iNbToursJoués == 9)
                return "Partie nulle!";
            else
                return "Rien";
        }
    }
}
