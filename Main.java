class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale s1 = new Scaffale("250");
        
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro l1 = new Libro("Divina Commedia", "D. Alighieri", 11.40f, 360, "Mondadori");
        Libro l2 = new Libro("Decameron", "G. Boccaccio", 14.25f, 630, "Mondadori");
        Libro l3 = new Libro("Epistolario", "F. Petrarca", 13.23f, 377, "Feltrinelli");
        Libro l4 = new Libro("Secretum", "F. Petrarca", 13.50f, 364, "Feltrinelli");
        Libro l5 = new Libro("Vita Nova", "D. Alighieri", 7.40f, 293, "Mondadori");
        s1.aggiungi(l1);
        s1.aggiungi(l2);
        s1.aggiungi(l3);
        s1.aggiungi(l4);
        s1.aggiungi(l5);
        
        //Visualizzare il contenuto dello scaffale
        s1.elencaLibri();
        
        //Visualizza le opere di Dante Alighieri
        System.out.println("Libri scritti da D. Alighieri:");
        s1.elencaLibri("D. Alighieri");
        
        //Visualizza tutti i libri dello scaffale s1 il cui prezzo è compreso tra 11.50€ e 14.50€
        System.out.println("Libri aventi prezzo compreso tra 11,50€ e 14,50€:");
        s1.elencaLibri(11.50f, 14.50f);
    }
}