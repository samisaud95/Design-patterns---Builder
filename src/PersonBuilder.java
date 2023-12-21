// Creo una classe Builder che permette atravesare la classe person
public class PersonBuilder {
    //Trasfiero tutti gli atributti della classe person.
    private String nome;
    private String cognome;
    private Integer eta;
    private String indirizzo;
    //Aggiungo un costruttore vuoto
    public PersonBuilder(){
    }
    //faccio anche tutti setters per accedere.
    public PersonBuilder setNome(String nome){
        this.nome= nome;
        return this;
    }
    public PersonBuilder setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }
    public PersonBuilder setEta(Integer eta) {
        this.eta = eta;
        return this;
    }
    public PersonBuilder setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
        return this;
    }
    public Person build(){
        return new Person(nome,cognome,eta,indirizzo);
    }

}

