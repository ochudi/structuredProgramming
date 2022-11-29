import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // DECLARATION STATEMENTS
        int randomNumber;
        int x, y;
        String oper;
        String difficultWord[] = new String[10];

        // BLOCK STATEMENT
        randomNumber = 3;
        System.out.println("Number outside block: " + randomNumber);
        {
            int anotherNumber = 5;
            System.out.println("Number within block: " + anotherNumber);
        }
        // System.out.println("Number within block: " + anotherNumber); - unfound!
        System.out.println("Number outside block: " + randomNumber);

        // IF STATEMENT
        x = 10;
        y = 10;

        if (x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("y is bigger.");
        }

        oper = "*";
        if (oper == "+") {
            System.out.println("Addition");
        } else if (oper == "=") {
            System.out.println("Equal to");
        } else if (oper == "*") {
            System.out.println("Multiplication");
        } else if (oper == "/") {
            System.out.println("Division");
        }

        // SWITCH STATEMENT
        switch (oper) {
            case "+":
                System.out.println("Addition");
                break;
            case "*":
                System.out.println("Multiplication");
                break;
            case "-":
                System.out.println("subtraction");
                break;
            case "/":
                System.out.println("Division");
                break;
        }

        // FOR LOOP
        for (int i = 0; i < difficultWord.length; i++) {
            Scanner newScanner = new Scanner(System.in);
            difficultWord[i] = newScanner.nextLine();
            newScanner.close();
        }

    }
}