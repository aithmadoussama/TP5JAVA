package exercice4;

public class Main {
    public static void main(String[] args) {
        
        Bibliotheque maBibliotheque = new Bibliotheque();
        System.out.println("\n[Bibliotheque]");
        System.out.println(maBibliotheque.toString());

        Document doc1 = new Document(101, "La Science pour Tous");
        System.out.println("\n[Document]");
        System.out.println(doc1.toString());

        Livre livre1 = new Livre(201, "Java pour les Débutants", "A. Einstein", 500);
        System.out.println("\n[Livre]");
        System.out.println(livre1.toString());
        System.out.println("Pages du livre: " + livre1.getNbrPages()); 
        
        Revue revue1 = new Revue(); 
        revue1.numEnreg = 301; 
        revue1.titre = "Magazine Technologique";
        System.out.println("\n[Revue]");
        System.out.println(revue1.toString());
        
        Dictionnaire dict1 = new Dictionnaire();
        dict1.numEnreg = 401;
        dict1.titre = "Dictionnaire Français-Anglais";
        System.out.println("\n[Dictionnaire]");
        System.out.println(dict1.toString());
        System.out.println("Langue: " + dict1.getLangue());

        Roman roman1 = new Roman();
        roman1.numEnreg = 501;
        roman1.titre = "Le Seigneur des Anneaux";
        roman1.auteur = "J.R.R. Tolkien";
        roman1.nbrPages = 1200;
        System.out.println("\n[Roman]");
        System.out.println(roman1.toString());

        Manuel manuel1 = new Manuel();
        manuel1.titre = "Algorithmique Avancée";
        System.out.println("\n[Manuel]");
        System.out.println(manuel1.toString());
        System.out.println("Niveau: " + manuel1.getNiveau());
        
        System.out.println("\n--- Fin du Test ---");
    }
}
