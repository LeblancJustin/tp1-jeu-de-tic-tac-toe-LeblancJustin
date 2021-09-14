package dm.a21.tictactoetp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InterfaceUtilisateur {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Appel onCreate", Toast.LENGTH_SHORT).show();

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

        imgGrille = findViewById(R.id.grille);
        imgCaseL1C1 = findViewById(R.id.ligne1colonne1);
        imgCaseL1C2 = findViewById(R.id.ligne1colonne2);
        imgCaseL1C3 = findViewById(R.id.ligne1colonne3);
        imgCaseL2C1 = findViewById(R.id.ligne2colonne1);
        imgCaseL2C2 = findViewById(R.id.ligne1colonne2);
        imgCaseL2C3 = findViewById(R.id.ligne2colonne3);
        imgCaseL3C1 = findViewById(R.id.ligne3colonne1);
        imgCaseL3C2 = findViewById(R.id.ligne3colonne2);
        imgCaseL3C3 = findViewById(R.id.ligne3colonne3);

        //int[] cases = {R.id.ligne1colonne1, R.id.ligne1colonne2, R.id.ligne1colonne3,
        //               R.id.ligne2colonne1, R.id.ligne2colonne2, R.id.ligne2colonne3,
        //               R.id.ligne3colonne1, R.id.ligne3colonne2, R.id.ligne3colonne3};

        ImageView[] cases = {imgCaseL1C1, imgCaseL1C2, imgCaseL1C3,
                             imgCaseL2C1, imgCaseL2C2, imgCaseL2C3,
                             imgCaseL3C1, imgCaseL3C2, imgCaseL3C3};

        //
        for (int i = 0; i <= cases.length; i++){
            cases[0].setImageResource(R.drawable.vide);
        }

        //cases[3].
        //Passer une position(case) et un jeton à jouer (X ou O)
        //InterfaceUtilisateur.PlacerJetonDansCaseVide();


        imgCaseL1C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCaseL1C1.getId() == (int)R.drawable.vide)
                {
                    //Changer Jeton en X ou O (IntetrfaceUtilisateur.PlacerJeton...)
                }
            }
        });
        imgCaseL1C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCaseL1C2.getId() == (int)R.drawable.vide)
                {
                    //Changer Jeton en X ou O (IntetrfaceUtilisateur.PlacerJeton...)
                }
            }
        });

        imgCaseL1C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCaseL1C3.getId() == (int)R.drawable.vide)
                {
                    //Changer Jeton en X ou O (IntetrfaceUtilisateur.PlacerJeton...)
                }
            }
        });





        Toast.makeText(getApplicationContext(), Integer.toString(imgCaseL1C1.getId()), Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "hihi", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), Integer.toString(R.drawable.vide), Toast.LENGTH_LONG).show();
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