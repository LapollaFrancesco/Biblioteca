public class Libro{
    //Definizione attributi
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;
    private Scaffale collocazione;

    //Definizione costruttore
    public Libro(String titolo, String autore, float prezzo, int npag, String editore){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.npag = npag;
        this.editore = editore;
    }
    
    //Definire metodo toString()
    public String toString(){
        return String.format("titolo: «%s», \nautore: %s, \nprezzo: %.2f€, \nnumero di pagine: %d, \neditore: %s, ", titolo, autore, prezzo, npag, editore) + collocazione + ".\n";
    }
    
    public void setCollocazione(Scaffale s){
        this.collocazione = s;
    }
    
    public String getAutore(){
        return autore;
    }
    
    public float getPrezzo(){
        return prezzo;
    }
}
