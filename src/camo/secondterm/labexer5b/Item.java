package camo.secondterm.labexer5b;


import java.util.*;
import camo.russtools.Print;
import java.lang.reflect.Array;
import java.util.stream.Stream;

public class Item {

    private String _question;
    private String _description;
    private String _category;

    private ArrayList<String> _answers;
    private List<String> _options;

    private HashMap<Character,String> _choices;
    private char[] _selection = "ABCDEFG".toCharArray();

    public Item(){

        _answers = new ArrayList<>();
        _options = new ArrayList<>();
        _choices = new HashMap<>();

    }

    public Item(String newQuestion, String newAnswer){

        _answers = new ArrayList<>();
        _options = new ArrayList<>();
        _choices = new HashMap<>();

        setQuestion(newQuestion);
        addAnswer(newAnswer);
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
        if(tempOption.length() >= 3) if(!_options.contains(tempOption)) _options.add(tempOption);
    }

    public String getQuestion(){
        return "\r\n%s".formatted(_question);
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
            e.printStackTrace();
        }
    }

    public void getOptions(){
        Thread optionsthread1 = new Thread(() -> {
            _choices.forEach((choice,answer) ->{
                System.out.printf("%s. %s\n",choice,answer);
            });
        });
        optionsthread1.start();
        try {
            optionsthread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getOptions(int delay){
        Thread optionsthread2 = new Thread(() -> {
            _choices.forEach((choice,answer) ->{
                try {
                    Thread.sleep(delay);
                    System.out.printf("%s. %s\n",choice,answer);
                } catch (InterruptedException e) {
                }
            });
        });
        optionsthread2.start();
        try {
            optionsthread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getItem(){
        System.out.println(getQuestion());
        generateOptions();
        getOptions();
    }

    public void getItem(int delay){
        System.out.println(getQuestion());
        generateOptions();
        getOptions(delay);
    }

    public void checkAnswer(String key){
        if(_answers.contains(_choices.get(key.toUpperCase()))) System.out.println("Congratulations, you are Correct!");
        if(!_answers.contains(_choices.get(key.toUpperCase()))) System.out.println("Too close! Study more nect time!!");
    }

}
