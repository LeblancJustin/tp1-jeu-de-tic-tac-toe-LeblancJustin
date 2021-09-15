package dm.a21.tictactoetp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InterfaceUtilisateur  {

    JeuTTT jeu = new JeuTTT();

    TextView txtTitres;
    ImageView imgGrille;
    ImageView imgCaseL1C1;
    ImageView imgCaseL1C2;
    ImageView imgCaseL1C3;
    ImageView imgCaseL2C1;
    ImageView imgCaseL2C2;
    ImageView imgCaseL2C3;
    ImageView imgCaseL3C1;
    ImageView imgCaseL3C2;
    ImageView imgCaseL3C3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Appel onCreate", Toast.LENGTH_SHORT).show();

        // Initialise le Joueur au tour de X
        jeu.initialiserTour();

        txtTitres = findViewById(R.id.titres);
        imgGrille = findViewById(R.id.grille);
        imgCaseL1C1 = findViewById(R.id.ligne1colonne1);
        imgCaseL1C2 = findViewById(R.id.ligne1colonne2);
        imgCaseL1C3 = findViewById(R.id.ligne1colonne3);
        imgCaseL2C1 = findViewById(R.id.ligne2colonne1);
        imgCaseL2C2 = findViewById(R.id.ligne2colonne2);
        imgCaseL2C3 = findViewById(R.id.ligne2colonne3);
        imgCaseL3C1 = findViewById(R.id.ligne3colonne1);
        imgCaseL3C2 = findViewById(R.id.ligne3colonne2);
        imgCaseL3C3 = findViewById(R.id.ligne3colonne3);

        ImageView[] casesImages = {imgCaseL1C1, imgCaseL1C2, imgCaseL1C3,
                                   imgCaseL2C1, imgCaseL2C2, imgCaseL2C3,
                                   imgCaseL3C1, imgCaseL3C2, imgCaseL3C3};

        int iCaseL1C1 = 0;
        int iCaseL1C2 = 1;
        int iCaseL1C3 = 2;
        int iCaseL2C1 = 3;
        int iCaseL2C2 = 4;
        int iCaseL2C3 = 5;
        int iCaseL3C1 = 6;
        int iCaseL3C2 = 7;
        int iCaseL3C3 = 8;

        char cX = 'X';
        char cO = 'O';
        char[] casesJeu = new char[9];

        // Initialise toutes les cases du jeu à vide au lancement de l'application
        for (int i = 0; i < casesImages.length; i++){
            casesImages[i].setImageResource(R.drawable.vide);
        }

        if(jeu.partieEnCours()) {
            imgCaseL1C1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL1C1.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL1C1.setImageResource(R.drawable.x);
                            casesJeu[iCaseL1C1] = cX;
                        } else {
                            imgCaseL1C1.setImageResource(R.drawable.o);
                            casesJeu[iCaseL1C1] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL1C2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL1C2.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL1C2.setImageResource(R.drawable.x);
                            casesJeu[iCaseL1C2] = cX;
                        } else {
                            imgCaseL1C2.setImageResource(R.drawable.o);
                            casesJeu[iCaseL1C2] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL1C3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL1C3.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL1C3.setImageResource(R.drawable.x);
                            casesJeu[iCaseL1C3] = cX;
                        } else {
                            imgCaseL1C3.setImageResource(R.drawable.o);
                            casesJeu[iCaseL1C3] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL2C1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL2C1.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL2C1.setImageResource(R.drawable.x);
                            casesJeu[iCaseL2C1] = cX;
                        } else {
                            imgCaseL2C1.setImageResource(R.drawable.o);
                            casesJeu[iCaseL2C1] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL2C2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL2C2.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL2C2.setImageResource(R.drawable.x);
                            casesJeu[iCaseL2C2] = cX;
                        } else {
                            imgCaseL2C2.setImageResource(R.drawable.o);
                            casesJeu[iCaseL2C2] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL2C3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL2C3.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL2C3.setImageResource(R.drawable.x);
                            casesJeu[iCaseL2C3] = cX;
                        } else {
                            imgCaseL2C3.setImageResource(R.drawable.o);
                            casesJeu[iCaseL2C3] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL3C1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL3C1.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL3C1.setImageResource(R.drawable.x);
                            casesJeu[iCaseL3C1] = cX;
                        } else {
                            imgCaseL3C1.setImageResource(R.drawable.o);
                            casesJeu[iCaseL3C1] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL3C2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL3C2.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL3C2.setImageResource(R.drawable.x);
                            casesJeu[iCaseL3C2] = cX;
                        } else {
                            imgCaseL3C2.setImageResource(R.drawable.o);
                            casesJeu[iCaseL3C2] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        if(jeu.partieEnCours()) {
            imgCaseL3C3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imgCaseL3C3.getDrawable().getConstantState() == MainActivity.this.getResources().getDrawable(R.drawable.vide).getConstantState()) {
                        if (jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X) {
                            imgCaseL3C3.setImageResource(R.drawable.x);
                            casesJeu[iCaseL3C3] = cX;
                        } else {
                            imgCaseL3C3.setImageResource(R.drawable.o);
                            casesJeu[iCaseL3C3] = cO;
                        }
                        jeu.changementTourDeJeu();
                        jeu.tourJoué();
                        String sGagnant = jeu.Logique(casesJeu).toString();
                        if(!sGagnant.equals(""))
                        {
                            //Afficher texte à l'écran (pas un toast)
                            txtTitres.setText(getText(R.string.partieGagnee) + " " + sGagnant);

                            //Boucle qui disable les onClicklistener des imageView
                            désactiverImages(casesImages);
                        }
                    } else
                        txtTitres.setText(R.string.caseRemplie);
                }
            });
        }
        //if(savedInstanceState != null){
         //   //chaque images de cases (casesImages ?)
         //   for(int i = 0; i < casesImages.length; i++)
         //   {
          //      casesImages[i].
         //   }
         //   //texte dans le txtTitres
         //   txtTitres.setText(savedInstanceState.getString(Constants.KEY_MOT_CACHÉ));
         //   //données des arrays de char (casesJeu)
//
         //  Toast.makeText(this, savedInstanceState.getString("message")+ " et récupéré",Toast.LENGTH_SHORT).show();
//
       // }
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Appel onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Appel onPause ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Appel onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Appel onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Appel onDestroy", Toast.LENGTH_LONG).show();
    }

    public void désactiverImages(ImageView[] tabImages) {
        for (int i = 0; i < tabImages.length; i++)
        {
            tabImages[i].setEnabled(false);
        }
    }
}