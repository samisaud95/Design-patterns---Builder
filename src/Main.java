//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
// Creo un PersonBuilder per pottedere accedere a gli atributo e chiamarli per stampare ongi uno
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setNome("Juan");
        personBuilder.setCognome("Ramirez");
        personBuilder.setEta(34);
        personBuilder.setIndirizzo("Ovada-Piemonte");
        //aggiungo una nuova persona senza usare setters per accedere a gli atributti che già stanno dichiarato
        // cosi proviamo la funzione del Builder.
        Person person = personBuilder.build();
        System.out.println("Person" + person);
        Person person1= new Person("Pedro","Gonzales",23,"Frosinone-Lazio");
        //Stampiamo e possiamo guardare tutta la informazione
        System.out.println("Person1" + person1);

    }
}