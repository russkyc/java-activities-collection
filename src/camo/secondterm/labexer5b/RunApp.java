package camo.secondterm.labexer5b;

import camo.russtools.*;

import java.util.ArrayList;

public class RunApp {

    public static void main(String[] args) {

        Input usrInput = new Input();
        ArrayList<Item> newQuiz = new ArrayList<>();

        //QuizItem 1
        Item quizItem1 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem1.addOption("A flow of atoms.");
        quizItem1.addOption("A flow of neutrons.");
        newQuiz.add(quizItem1);

        //QuizItem 1
        Item quizItem2 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem2.addOption("A flow of atoms.");
        quizItem2.addOption("A flow of neutrons.");
        newQuiz.add(quizItem2);

        //QuizItem 1
        Item quizItem3 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem3.addOption("A flow of atoms.");
        quizItem3.addOption("A flow of neutrons.");
        newQuiz.add(quizItem3);

        //QuizItem 1
        Item quizItem4 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem4.addOption("A flow of atoms.");
        quizItem4.addOption("A flow of neutrons.");
        newQuiz.add(quizItem4);

        //QuizItem 1
        Item quizItem5 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem5.addOption("A flow of atoms.");
        quizItem5.addOption("A flow of neutrons.");
        newQuiz.add(quizItem5);

        //QuizItem 1
        Item quizItem6 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem6.addOption("A flow of atoms.");
        quizItem6.addOption("A flow of neutrons.");
        newQuiz.add(quizItem6);

        //QuizItem 1
        Item quizItem7 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem7.addOption("A flow of atoms.");
        quizItem7.addOption("A flow of neutrons.");
        newQuiz.add(quizItem7);

        //QuizItem 1
        Item quizItem8 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem8.addOption("A flow of atoms.");
        quizItem8.addOption("A flow of neutrons.");
        newQuiz.add(quizItem8);

        //QuizItem 1
        Item quizItem9 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem9.addOption("A flow of atoms.");
        quizItem9.addOption("A flow of neutrons.");
        newQuiz.add(quizItem9);

        //QuizItem 1
        Item quizItem10 = new Item("What is actually electricity?","A flow of Electrons.");
        quizItem10.addOption("A flow of atoms.");
        quizItem10.addOption("A flow of neutrons.");
        newQuiz.add(quizItem10);

        for(Item quizItem : newQuiz){
            quizItem.getItem(500);
            quizItem.checkAnswer(usrInput.getLine("Answer"));
        }

    }
}
