import java.util.Scanner;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;

public class GuessingGame
{
    private DecisionTreeInterface<String> guessTree;
    private String filename;
    
    public GuessingGame() {
        this.initializeTree();
        this.play();
    }
    
    private void initializeTree() {
        this.filename = "guessanimal.dat";
        final File file = new File(this.filename);
        ObjectInputStream oiStream = null;
        try {
            oiStream = new ObjectInputStream(new FileInputStream(file));
            this.guessTree = (DecisionTreeInterface<String>)oiStream.readObject();
            oiStream.close();
        }
        catch (FileNotFoundException e) {
            final String startQuestion = "Is it big?";
            final String yesAnswer = "an Elephant";
            final String noAnswer = "a Mouse";
            this.guessTree = (DecisionTreeInterface<String>)new DecisionTree(startQuestion, yesAnswer, noAnswer);
        }
        catch (IOException ex) {
            System.out.println("ERROR: Unable to read file");
        }
        catch (ClassNotFoundException ex2) {
            System.out.println("ERROR: Unable to locate class definition");
        }
    }
    
    private void saveFile() {
        ObjectOutputStream ooStream = null;
        final File file = new File(this.filename);
        try {
            ooStream = new ObjectOutputStream(new FileOutputStream(file));
            ooStream.writeObject(this.guessTree);
            ooStream.close();
        }
        catch (IOException ex) {
            System.out.println("ERROR: Unable to write to file");
        }
    }
    
    public void displayInstructions() {
        System.out.println("\nThis is a guessing game on animals.");
    }
    
    public void play() {
        this.displayInstructions();
        char again = 'Y';
        final Scanner scanner = new Scanner(System.in);
        do {
            this.guessTree.reset();
            System.out.println("\nLet's play! ");
            while (!this.guessTree.isAnswer()) {
                System.out.print((String)this.guessTree.getCurrentData() + " ");
                final String userAns = scanner.next();
                if (Character.toUpperCase(userAns.charAt(0)) == 'Y') {
                    this.guessTree.advanceToYes();
                }
                else {
                    this.guessTree.advanceToNo();
                }
            }
            System.out.print("My guess is " + (String)this.guessTree.getCurrentData() + ".  Am I right? ");
            final String userAns = scanner.next();
            scanner.nextLine();
            if (Character.toUpperCase(userAns.charAt(0)) == 'Y') {
                System.out.println("I WIN!!");
            }
            else {
                System.out.print("I give up; what are you thinking of? ");
                final String yesAnswer = scanner.nextLine();
                System.out.print("Give me a question whose answer is \nyes for " + yesAnswer + " and no for " + (String)this.guessTree.getCurrentData() + ": ");
                final String question = scanner.nextLine();
                final String noAnswer = (String)this.guessTree.getCurrentData();
                this.guessTree.setCurrentData(question);
                this.guessTree.setAnswers(noAnswer, yesAnswer);
            }
            System.out.print("Play again? ");
            again = scanner.next().charAt(0);
        } while (Character.toUpperCase(again) == 'Y');
        System.out.println("\nThank you for playing this guessing game.  You're a good player :).");
        this.saveFile();
    }
    
    public static void main(final String[] args) {
        new GuessingGame();
    }
}
