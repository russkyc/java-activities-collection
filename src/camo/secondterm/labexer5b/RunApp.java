package camo.secondterm.labexer5b;

public class RunApp {

    public static void main(String[] args) throws InterruptedException {

        Quiz newQuiz = new Quiz("General Knowledge",5);

        Item quizItem1 = new Item("What is actually electricity?","A flow of Electrons");
        quizItem1.addOption("A flow of atoms");
        quizItem1.addOption("A flow of neutrons");
        newQuiz.addItem(quizItem1);

        Item quizItem2 = new Item("The caterpillar is the larval stage of which animal?","Butterfly");
        quizItem2.addOption("Wasp");
        quizItem2.addOption("Dragonfly");
        newQuiz.addItem(quizItem2);

        Item quizItem3 = new Item("Goulash is a type of beef soup in which country?","Hungary");
        quizItem3.addOption("Czech Republic");
        quizItem3.addOption("Slovakia");
        newQuiz.addItem(quizItem3);

        Item quizItem4 = new Item("The phrase: I think, therefore I am was coined by which philosopher?","Descartes");
        quizItem4.addOption("Socrates");
        quizItem4.addOption("Plato");
        newQuiz.addItem(quizItem4);

        Item quizItem5 = new Item("What does the term SOS commonly stand for?","Save Our Souls");
        quizItem5.addOption("Save Our Seal");
        quizItem5.addOption("Save Our Ship");
        newQuiz.addItem(quizItem5);

        Item quizItem6 = new Item("Which company is known for publishing the Mario video game?","Nintendo");
        quizItem6.addOption("Sega");
        quizItem6.addOption("Electronic Arts");
        newQuiz.addItem(quizItem6);

        Item quizItem7 = new Item("Which of the following is not an international organisation?","FBI");
        quizItem7.addOption("NATO");
        quizItem7.addOption("FIFA");
        newQuiz.addItem(quizItem7);

        Item quizItem8 = new Item("Which of the following animals can run the fastest?","Cheetah");
        quizItem8.addOption("Leopard");
        quizItem8.addOption("Lion");
        newQuiz.addItem(quizItem8);

        Item quizItem9 = new Item("Who was the second person to step foot on the moon??","Buzz Aldrin");
        quizItem9.addOption("Yuri Gagarin");
        quizItem9.addOption("Alan Bean");
        newQuiz.addItem(quizItem9);

        Item quizItem10 = new Item("Which of the following disorders is the fear of being alone?","Agoraphobia");
        quizItem10.addOption("Acrophobia");
        quizItem10.addOption("Arachnophobia");
        newQuiz.addItem(quizItem10);

        newQuiz.start();

    }
}
