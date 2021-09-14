package dm.a21.tictactoetp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InterfaceUtilisateur  {

    JeuTTT jeu = new JeuTTT();


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

    int[] cases = {R.id.ligne1colonne1, R.id.ligne1colonne2, R.id.ligne1colonne3,
                   R.id.ligne2colonne1, R.id.ligne2colonne2, R.id.ligne2colonne3,
                   R.id.ligne3colonne1, R.id.ligne3colonne2, R.id.ligne3colonne3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Appel onCreate", Toast.LENGTH_SHORT).show();
        Log.i("OnCreate", "OnCreateMainActivity");

        // Initialise le Joueur au tour de X
        jeu.initialiserTour();
        Log.i("OnCreate", "initialiserTour");

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
        Log.i("OnCreate", "imgCases");

        ImageView[] cases = {imgCaseL1C1, imgCaseL1C2, imgCaseL1C3,
                             imgCaseL2C1, imgCaseL2C2, imgCaseL2C3,
                             imgCaseL3C1, imgCaseL3C2, imgCaseL3C3};
        Log.i("OnCreate", "tableauImageView");

        // Initialise toutes les cases du jeu à vide au lancement de l'application
        for (int i = 0; i < cases.length; i++){
            cases[i].setImageResource(R.drawable.vide);
        }
        Log.i("OnCreate", "boucleFor");

        //cases[3].
        //Passer une position(case) et un jeton à jouer (X ou O)
        //InterfaceUtilisateur.PlacerJetonDansCaseVide();


        imgCaseL1C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL1C1.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                       imgCaseL1C1.setImageResource(R.drawable.x);
                       jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL1C1.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });
        imgCaseL1C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCaseL1C2.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        imgCaseL1C2.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        imgCaseL1C2.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }
                }
                else
                {

                }
            }
        });

        imgCaseL1C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCaseL1C3.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        imgCaseL1C3.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        imgCaseL1C3.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }
                }
                else
                {

                }
            }
        });
        imgCaseL2C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL2C1.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                        imgCaseL2C1.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL2C1.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });
        imgCaseL2C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL2C2.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                        imgCaseL2C2.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL2C2.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });
        imgCaseL2C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL2C3.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                        imgCaseL2C3.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL2C3.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });
        imgCaseL3C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL3C1.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                        imgCaseL3C1.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL3C1.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });
        imgCaseL3C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL3C2.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                        imgCaseL3C2.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL3C2.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });
        imgCaseL3C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"onClickListener", Toast.LENGTH_SHORT).show();
                if (imgCaseL3C3.getDrawable().getConstantState() == MainActivity.this
                        .getResources().getDrawable(R.drawable.vide).getConstantState())
                {
                    Toast.makeText(getApplicationContext(),"if-Vide", Toast.LENGTH_SHORT).show();
                    if(jeu.tourDeJeuActuel() == ModeleJeu.Joueur.X)
                    {
                        Toast.makeText(getApplicationContext(),"tourX", Toast.LENGTH_SHORT).show();
                        imgCaseL3C3.setImageResource(R.drawable.x);
                        jeu.changementTourDeJeu();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"tourO", Toast.LENGTH_SHORT).show();
                        imgCaseL3C3.setImageResource(R.drawable.o);
                        jeu.changementTourDeJeu();
                    }

                }
                else
                {

                }
            }
        });

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


    @Override
    public void PlacerJetonDansCaseVide(String position, ImageView image, String joueur) {
        
    }
}