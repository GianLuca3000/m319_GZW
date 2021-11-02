package org.launchcode;

import org.omg.CORBA.WStringSeqHelper;

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

    public String ToString(){
        return String.format("Name: %s, %s\nMail: %s", Nachname, Name, Mail);
    }
}
