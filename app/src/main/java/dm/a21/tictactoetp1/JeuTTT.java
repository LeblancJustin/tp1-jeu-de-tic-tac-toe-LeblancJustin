package dm.a21.tictactoetp1;

import static android.provider.Settings.System.getString;

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

    public boolean partieEnCours() {
        if(bPartieTerminée == false)
            return true;
        else
            return false;
    }

    public String Logique (char[] casesJeu) {
        //X = 700068
        //O = 700061
        if(casesJeu[0] != '\u0000' && casesJeu[0] == casesJeu[1] && casesJeu[1] == casesJeu[2])
        {
            //Ligne Horizontale #1
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[0]);
            return sGagnant;
        }
        else if (casesJeu[3] != '\u0000' && casesJeu[3] == casesJeu[4] && casesJeu[4] == casesJeu[5])
        {
            //Ligne Horizontale #2
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[3]);
            return sGagnant;
        }
        else if (casesJeu[6] != '\u0000' && casesJeu[6] == casesJeu[7] && casesJeu[7] == casesJeu[8])
        {
            //Ligne Horizontale #3
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[6]);
            return sGagnant;
        }
        else if (casesJeu[0] != '\u0000' && casesJeu[0] == casesJeu[3] && casesJeu[3] == casesJeu[6])
        {
            //Ligne Verticale #1
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[0]);
            return sGagnant;
        }
        else if (casesJeu[1] != '\u0000' && casesJeu[1] == casesJeu[4] && casesJeu[4] == casesJeu[7])
        {
            //Ligne Verticale #2
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[1]);
            return sGagnant;
        }
        else if (casesJeu[2] != '\u0000' && casesJeu[2] == casesJeu[5] && casesJeu[5] == casesJeu[8])
        {
            //Ligne Verticale #3
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[2]);
            return sGagnant;
        }
        else if (casesJeu[0] != '\u0000' && casesJeu[0] == casesJeu[4] && casesJeu[4] == casesJeu[8])
        {
            //Diagonale #1
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[0]);
            return sGagnant;
        }
        else if (casesJeu[2] != '\u0000' && casesJeu[2] == casesJeu[4] && casesJeu[4] == casesJeu[6])
        {
            //Diagonale #2
            bPartieTerminée = true;
            String sGagnant = Character.toString(casesJeu[2]);
            return sGagnant;
        }
        else
        {
            if(iNbToursJoués == 9)
                return Integer.toString(R.string.partieNulle);
            else
                return "";
        }
    }
}
