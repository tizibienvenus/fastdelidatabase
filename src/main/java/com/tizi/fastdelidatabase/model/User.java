package com.tizi.fastdelidatabase.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;

    // Constructeur par défaut
    public User() {
        // Vous pouvez ajouter du code d'initialisation ici si nécessaire
    }
    
   
    // Constructeur avec paramètres
    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
	// Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
