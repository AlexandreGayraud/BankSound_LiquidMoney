package com.example.alext.nossons;
import android.widget.Button;

public class Son {

    // Id provenant de la base de données
    int id;
    //
    int buttonId;
    // Nom du son défini dans la BDD
    String nom;
    // Chemin amenant à l'image associée au son
    String imagePath;
    // Chemin amenant à la musique/son
    String sonPath;

    // Constructeur par défaut
    public Son() {
        this.id = -1;
        this.buttonId = -1;
        this.nom = "None";
        this.imagePath = "None";
        this.sonPath = "None";
    }
    // Constructeur avec paramètres
    public Son(int id, String nom, String imagePath, String sonPath, int buttonId) {
        this.id = id;
        this.buttonId = buttonId;
        this.nom = nom;
        this.imagePath = imagePath;
        this.sonPath = sonPath;
    }


}
