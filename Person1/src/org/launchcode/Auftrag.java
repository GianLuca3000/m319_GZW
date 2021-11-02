package org.launchcode;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Auftrag {

    private Scanner scanner = new Scanner(System.in);

    private String Bezeichnung;
    private Date StartDate;
    private Person Auftraggeber;
    private Person Auftragnehmer;
    private int Kosten;
    private Date Enddatum;

    public Auftrag(Library lib){
        SetBezeichnung();
        SetStartDate();
        System.out.println("Auftragnehmer");
        SetAuftragnehmer(lib.GetListPerson());
        System.out.println("Auftraggeber");
        SetAutraggeber(lib.GetListPerson());
    }

    private void SetBezeichnung(){
        System.out.println("Geben sie eine Bezeichnung ein:");
        Bezeichnung = scanner.nextLine();
    }

    private void SetStartDate(){
        StartDate = new Date();
        StartDate.setDate(Calendar.DATE);
    }

    private void SetEnddatum(){
        Enddatum = new Date();
        Enddatum.setDate(Calendar.DATE);
    }

    private void SetAutraggeber(Person auftraggeber){
        Auftraggeber = auftraggeber;
    }

    private void SetAuftragnehmer(Person auftragnehmer){
        Auftragnehmer = auftragnehmer;
    }

    private void SetKosten(){
        Kosten = GetKosten();
    }

    private int GetKosten(){
        System.out.println("Insert costs of the auftrag");

        int kosten;
        boolean throwsException = false;

        do {
            try {
                kosten = Integer.parseInt(scanner.nextLine());
                return kosten;
            }catch (Exception e){
                System.out.println("Try it with a number");
                throwsException = true;
            }
        }while (throwsException);

        return GetKosten();
    }

    private String GetEndDatumString(){
        if (Enddatum != null){
            return Enddatum.toString();
        }
        return "unbekannt";
    }

    public void OutString(){
        System.out.format("Auftragsname: %s\n", Bezeichnung);
        System.out.format("Von-Bis: %s - %s\n", StartDate.toString(), GetEndDatumString());
        System.out.format("Auftraggeber\n %s\nAuftragnehmer\n %s\n", Auftraggeber.ToString(), Auftragnehmer.ToString());
        System.out.println("Kosten: " + Kosten);
    }

    public void Finish(){
        SetEnddatum();
        OutString();
    }
}
