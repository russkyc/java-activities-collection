package camo.secondterm.labexer5b;

import java.util.*;
import camo.russtools.Print;
import java.lang.reflect.Array;
import java.util.stream.Stream;

public class Item {

    private String _question;
    private String _description;
    private String _category;
    private int _points;

    private ArrayList<String> _answers;
    private List<String> _options;

    private HashMap<Character,String> _choices;
    private char[] _selection = "ABCDEFG".toCharArray();

    Print print = new Print();

    public Item(){

        _answers = new ArrayList<>();
        _options = new ArrayList<>();
        _choices = new HashMap<>();
        _points = 1;

    }

    public Item(String newQuestion, String newAnswer){

        _answers = new ArrayList<>();
        _options = new ArrayList<>();
        _choices = new HashMap<>();
        _points = 1;

        setQuestion(newQuestion);
        addAnswer(newAnswer);
    }

    public void setPoints(int newPoints){
        _points = newPoints;
    }

    public void setQuestion(String tempQuestion){
        if(tempQuestion.length() > 10) _question = tempQuestion;
    }

    public void setDescription(String tempDescription){
        if(tempDescription.length() > 10) _description = tempDescription;
    }

    public void setCategory(String tempCategory){
        if(tempCategory.length() > 10) _description = tempCategory;
    }

    public void addAnswer(String tempAnswer){
        if(tempAnswer.length() >= 3) _answers.add(tempAnswer); _options.add(tempAnswer);
    }

    public void addOption(String tempOption){
        if(!_options.contains(tempOption)) _options.add(tempOption);
    }

    public int getPoints(){
        return _points;
    }

    public String getQuestion(){
        return _question;
    }

    public String getDescription(){
        return _description;
    }

    public String getCategory(){
        return _category;
    }

    public void generateOptions(){
        Thread optionsthread1 = new Thread(() -> {
            ArrayList<Integer> randomlist = new ArrayList<>();
            Collections.shuffle(_options);
            int index = 0;
            for (String option : _options){
                _choices.putIfAbsent(_selection[index],option);
                index++;
            }
        });
        optionsthread1.start();
        try {
            optionsthread1.join();
        } catch (InterruptedException e) {
        }
    }

    public void getOptions(){
        generateOptions();
        _choices.forEach((choice,answer) ->{
            System.out.printf("  %s. %s\n",choice,answer);
        });
    }

    public void getOptions(int delay){
        generateOptions();
        Thread optionsthread1 = new Thread(() -> {
            try {
                _choices.forEach((choice,answer) ->{
                    try {
                        Thread.sleep(delay);
                        System.out.printf("  %s. %s\n",choice,answer);
                    } catch (InterruptedException e) {
                    }
                });
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        });
        optionsthread1.start();
        try {
            optionsthread1.join();
        } catch (InterruptedException e) {
        }

    }

    public void getItem(int index){
        print.delayPrintLine("\n%d. %s".formatted(index, getQuestion()),0);
        getOptions();
    }

    public void getItem(int index, int delay){
        print.delayPrintLine("\n%d. %s".formatted(index, getQuestion()),500);
        getOptions(delay);
    }

    public String getAnswer(){
        return this._answers.get(0);
    }

    public boolean checkAnswer(String key){
        boolean tempReturn = false;
        try {
            if(_answers.contains(_choices.get(key.toUpperCase().charAt(0))))tempReturn = true;
            if(!_answers.contains(_choices.get(key.toUpperCase().charAt(0))))tempReturn = false;
            if(key.isEmpty() || key.isBlank()) throw new IllegalArgumentException();
            if(!_choices.containsKey(key.toUpperCase().charAt(0))) throw new InputMismatchException();
            Thread.sleep(50);
        } catch (InterruptedException e) {
            tempReturn = false;
        } catch (InputMismatchException e){
            System.out.printf("%s is not included in the options. ",key);
            tempReturn = false;
        } catch (IllegalArgumentException e){
            System.out.print("Input canot be blank. ");
            tempReturn = false;
        }
        return tempReturn;
    }

}
