package camo.secondterm.labexer5b;

import camo.russtools.Input;
import camo.russtools.Print;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
    private ArrayList<Item> _itemCollection;
    private String _name;
    private int _correct;
    private int _points;
    private int _score;

    public Quiz(){
        _itemCollection = new ArrayList<>();
        _name = "New Quiz";
        _correct = 0;
        _points = 1;
        _score = 0;
    }

    public Quiz(String newName){
        _itemCollection = new ArrayList<>();
        _name = newName;
        _correct = 0;
        _points = 1;
        _score = 0;
    }

    public Quiz(String newName, int newPoints){
        _itemCollection = new ArrayList<>();
        _name = newName;
        _points = newPoints;
        _correct = 0;
        _score = 0;
    }

    public void setName(String newName){
        _name = newName;
    }

    public void addItem(Item newQuizItem){
        newQuizItem.setPoints(_points);
        this._itemCollection.add(newQuizItem);
    }

    public int getItemCount(){
        return _itemCollection.size();
    }

    public void start() throws InterruptedException {

        Input usrInput = new Input();
        Print print = new Print();
        int points = 0;
        int index = 1;

        print.delayPrint("Welcome to the %s Quiz!".formatted(_name),1000);
        print.delayPrint("\nThere are %d questions with %d points each.".formatted(getItemCount(),_points),1000);
        print.delayPrint("\nLet's get started!".formatted(getItemCount(),_points),1000);

        Collections.shuffle(_itemCollection);
        for(Item quizItem : _itemCollection){
            int tries = 2;
            boolean trying = true;
            while (tries >= 0 && trying){
                quizItem.getItem(index,500);
                tries--;
                if(quizItem.checkAnswer(usrInput.getString("Answer"))){
                    System.out.print("Congratulations, you are correct!");
                    points += quizItem.getPoints();
                    _correct ++;
                    trying = false;
                }
                else if(tries == 0){
                    System.out.printf("Sorry, You ran out of tries. The correct answer was: %s",quizItem.getAnswer());
                    Thread.sleep(500);
                    trying = false;
                }
                else{
                    System.out.printf("You have %d more tries.",tries);
                    Thread.sleep(500);
                }
            }
            index++;
        }
        usrInput.Close();
        print.delayPrintLine("\nYou got %d correct answers for a total of %d points!".formatted(_correct,points),1000);
        print.delayPrint("Thanks for taking the %s Quiz!".formatted(_name),1000);
    }
}
