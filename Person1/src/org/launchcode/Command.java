package org.launchcode;

import com.sun.deploy.Environment;

import java.util.Scanner;
import java.util.Set;

public class Command {

    private Library Lib = new Library();
    private Commands commands;
    private Scanner scanner = new Scanner(System.in);

    public void ExecuteCommand(){
        SetCommand();

        switch (commands){
            case Add:
                Lib.Add();
                break;
            case Delete:
                Lib.Delete();
                break;
            case Show:
                Lib.Show();
                break;
            case Stop:
                break;
        }

        ExecuteCommand();
    }

    private void SetCommand(){
        System.out.println("Please insert Command:");
        String input = scanner.nextLine();

        switch (input){
            case "Add":
                commands = Commands.Add;
                break;
            case "Delete":
                commands = Commands.Delete;
                break;
            case "Show":
                commands = Commands.Show;
                break;
            case "Stop":
                commands = Commands.Stop;
            default:
                System.out.println("not a command try again");
                SetCommand();
                break;
        }
    }

}
enum Commands{
    Add,
    Delete,
    Show,
    Stop
}
