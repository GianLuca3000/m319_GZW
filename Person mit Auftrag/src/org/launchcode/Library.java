package org.launchcode;

import java.io.Console;
import java.util.*;

public class Library {

    private Scanner scanner = new Scanner(System.in);
    //Our actual Library, where we store our persons
    private List<Person> Repos = new ArrayList<Person>();

    //Adds a person to Repos
    public void Add(){
        System.out.println("Let's create a person:");
        Repos.add(GetPerson());
        System.out.println("*added*");
    }

    public Person GetListPerson(){
        return Repos.get(GetPersonReposIndex());
    }

    //Deletes a person at a certain index
    public void Delete(){
        if (IsListEmpty("There are no items to delete.")){
            return;
        }

        Repos.remove(GetPersonReposIndex());
        System.out.println("*deleted*");
    }

    //Shows a person at a certain index
    public void Show(){
        if (IsListEmpty("There are no items to show")){
            return;
        }

        ShowPerson(GetPersonReposIndex() - 1);
    }

    //Shows all the person's names with their index
    private void ShowOverview(){
        for (Person person:Repos) {
            System.out.format("%d:     %s %s\n", Repos.indexOf(person) + 1, person.getNachname(), person.getName());
        }
    }

    //Shows all the Values of the person at a certain index
    private void ShowPerson(int index){

        Person person = Repos.get(index);

        System.out.format("Name: %S\n", person.getName());
        System.out.format("Nachname: %s\n", person.getNachname());
        System.out.format("Mail: %s\n", person.getMail());
    }

    //Creates and gives back a new person
    private Person GetPerson(){

        System.out.println("Insert the name:");
        String name = scanner.nextLine();

        System.out.println("Insert the prename:");
        String Vorname = scanner.nextLine();

        System.out.println("Insert the mail adress:");
        String Mail = scanner.nextLine();

        return new Person(Vorname, name, Mail);
    }

    //Gets a valid PersonReposIndex
    private int GetPersonReposIndex(){
        System.out.println("Insert the Index of the person:");

        int index = 0;
        boolean throwsException = false;

        do {
            try {
                index = Integer.parseInt(scanner.nextLine());
                if (IsValid(index)){
                    return index - 1;
                }
            }catch (Exception e){
                System.out.println("That's not an index. Try it with a number");
                throwsException = true;
            }
        }while (throwsException);

        return GetPersonReposIndex();
    }

    //Checks if an index exists in Repos
    private boolean IsValid(int index){

        if (Repos.stream().count() >= index){
            return true;
        }else{
            System.out.println("Index out of bounds");

            System.out.println("Valid indexies:");
            ShowOverview();

            return false;
        }
    }

    //Checks if Repos is empty and shows a message if it's empty
    public boolean IsListEmpty(String message){
        if (Repos.stream().count() > 0){
            return false;
        }

        System.out.println(message);
        return true;
    }

}
