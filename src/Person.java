//Creo la classe Person
public class Person {
    //Dove creo tutti atributti
    private String nome;
    private String cognome;
    private Integer eta;
    private String indirizzo;
    //Facciamo anche il costruttore
    Person(String nome,String cognome,Integer eta,String indirizzo){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.indirizzo=indirizzo;
    }
// facciamo getters e setters per accedere
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
//faccio overide to string
    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}
