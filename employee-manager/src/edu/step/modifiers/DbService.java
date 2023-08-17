package edu.step.modifiers;

public class DbService {  // App < ------- > DB (Oracle, mySQL)
    
    public static DbService instance = new DbService(); // Singleton

    private DbService() {
        // validam calea spre baza de date (adresa)
        // conexiune cu baza de date
    }
}
