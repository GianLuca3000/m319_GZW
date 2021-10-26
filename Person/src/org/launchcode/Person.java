package org.launchcode;

public class Person {

    private String Name;
    private String Nachname;
    private String Mail;

    public Person(String name, String nachname, String mail){
        Name = name;
        Nachname = nachname;
        Mail = mail;
    }

    public String getMail() {
        return Mail;
    }

    public String getName() {
        return Name;
    }

    public String getNachname() {
        return Nachname;
    }
}
