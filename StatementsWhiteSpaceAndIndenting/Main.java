package StatementsWhiteSpaceAndIndenting;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // assignment expression
        myVariable++; // Statement
        myVariable--; // Statement
        System.out.println("This is a test"); // Statement Method call
        System.out.println("This is a multiline expression " + "another, another, another another" + " still more."); // Statement
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another");
        // java ignores whitespace
        // java ignores indentation
        System.out.println(anotherVariable + myVariable);
    }
}