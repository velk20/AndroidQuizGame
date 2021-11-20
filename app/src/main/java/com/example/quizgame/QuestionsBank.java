package com.example.quizgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is a correct syntax to output Hello World in Java?","System.out.println(Hello World);","print (Hello World);","Console.WriteLine(Hello World);","echo(Hello World);","System.out.println(Hello World);","");
        final QuestionsList question2 = new QuestionsList("Java is short for JavaScript?","False","True","Maybe","50/50","False","");
        final QuestionsList question3 = new QuestionsList("How do you insert COMMENTS in Java code? ","/*This is a comment","#This is a comment","//This is a comment","<!--This is a comment-->","//This is a comment","");
        final QuestionsList question4 = new QuestionsList("Which data type is used to create a variable that should store text?","string","String","myString","Txt","String","");
        final QuestionsList question5 = new QuestionsList("How do you create a variable with the numeric value 5?","x = 5;","float x = 5;","num x = 5;","int x = 5;","int x = 5;","");
        final QuestionsList question6 = new QuestionsList("How do you create a variable with the floating number 2.8?","x = 2.8f;","float x = 2.8f;","byte x = 2.8f;","int x = 2.8f;","float x = 2.8f;","");
        final QuestionsList question7 = new QuestionsList("Which method can be used to find the length of a string?","getLength()","getSize()","length()","len()","length()","");
        final QuestionsList question8 = new QuestionsList("Which operator is used to add together two values?","The + sign","The * sign","The ^ sign","The & sign","The + sign","");
        final QuestionsList question9 = new QuestionsList("Which method can be used to return a string in upper case letters?","tuc()","upperCase()","touppercase()","toUpperCase()","toUpperCase()","");
        final QuestionsList question10 = new QuestionsList("Which operator can be used to compare two values?","=","==","><","<>","==","");
        final QuestionsList question11 = new QuestionsList("To declare an array in Java, define the variable type with:","{}","()","[]","~~","[]","");
        final QuestionsList question12 = new QuestionsList("How do you create a method in Java?","methodName.","methodName[]","(methodName)","methodName()","methodName()","");
        final QuestionsList question13 = new QuestionsList("How do you call a method in Java?","methodName[];","(methodName);","methodName;","methodName();","methodName();","");
        final QuestionsList question14 = new QuestionsList("Which keyword is used to create a class in Java?","MyClass","class","className","class()","class","");
        final QuestionsList question15 = new QuestionsList("Which method can be used to find the highest value of x and y?","Math.Largest(x,y)","Math.maximum(x,y)","Math.max(x,y)","Math.maxNum(x,y)","Math.max(x,y)","");
        final QuestionsList question16 = new QuestionsList("Which operator is used to multiply numbers?","*","x","%","#","*","");
        final QuestionsList question17 = new QuestionsList("Which keyword is used to import a package from the Java API library?","import","package","lib","getlib","import","");
        final QuestionsList question18 = new QuestionsList("How do you start writing an if statement in Java?","if x > y:","if (x > y)","if x > y then:","if { x > y }","if (x > y)","");
        final QuestionsList question19 = new QuestionsList("How do you start writing a while loop in Java?","x > y while{","while x > y{","while x > y:","while (x > y){","while (x > y){","");
        final QuestionsList question20 = new QuestionsList("Which keyword is used to return a value inside a method?","void","break","get","return","return","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("","","","","","","");
        final QuestionsList question2 = new QuestionsList("","","","","","","");
        final QuestionsList question3 = new QuestionsList("","","","","","","");
        final QuestionsList question4 = new QuestionsList("","","","","","","");
        final QuestionsList question5 = new QuestionsList("","","","","","","");
        final QuestionsList question6 = new QuestionsList("","","","","","","");
        final QuestionsList question7 = new QuestionsList("","","","","","","");
        final QuestionsList question8 = new QuestionsList("","","","","","","");
        final QuestionsList question9 = new QuestionsList("","","","","","","");
        final QuestionsList question10 = new QuestionsList("","","","","","","");
        final QuestionsList question11 = new QuestionsList("","","","","","","");
        final QuestionsList question12 = new QuestionsList("","","","","","","");
        final QuestionsList question13 = new QuestionsList("","","","","","","");
        final QuestionsList question14 = new QuestionsList("","","","","","","");
        final QuestionsList question15 = new QuestionsList("","","","","","","");
        final QuestionsList question16 = new QuestionsList("","","","","","","");
        final QuestionsList question17 = new QuestionsList("","","","","","","");
        final QuestionsList question18 = new QuestionsList("","","","","","","");
        final QuestionsList question19 = new QuestionsList("","","","","","","");
        final QuestionsList question20 = new QuestionsList("","","","","","","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("","","","","","","");
        final QuestionsList question2 = new QuestionsList("","","","","","","");
        final QuestionsList question3 = new QuestionsList("","","","","","","");
        final QuestionsList question4 = new QuestionsList("","","","","","","");
        final QuestionsList question5 = new QuestionsList("","","","","","","");
        final QuestionsList question6 = new QuestionsList("","","","","","","");
        final QuestionsList question7 = new QuestionsList("","","","","","","");
        final QuestionsList question8 = new QuestionsList("","","","","","","");
        final QuestionsList question9 = new QuestionsList("","","","","","","");
        final QuestionsList question10 = new QuestionsList("","","","","","","");
        final QuestionsList question11 = new QuestionsList("","","","","","","");
        final QuestionsList question12 = new QuestionsList("","","","","","","");
        final QuestionsList question13 = new QuestionsList("","","","","","","");
        final QuestionsList question14 = new QuestionsList("","","","","","","");
        final QuestionsList question15 = new QuestionsList("","","","","","","");
        final QuestionsList question16 = new QuestionsList("","","","","","","");
        final QuestionsList question17 = new QuestionsList("","","","","","","");
        final QuestionsList question18 = new QuestionsList("","","","","","","");
        final QuestionsList question19 = new QuestionsList("","","","","","","");
        final QuestionsList question20 = new QuestionsList("","","","","","","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> jsQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("","","","","","","");
        final QuestionsList question2 = new QuestionsList("","","","","","","");
        final QuestionsList question3 = new QuestionsList("","","","","","","");
        final QuestionsList question4 = new QuestionsList("","","","","","","");
        final QuestionsList question5 = new QuestionsList("","","","","","","");
        final QuestionsList question6 = new QuestionsList("","","","","","","");
        final QuestionsList question7 = new QuestionsList("","","","","","","");
        final QuestionsList question8 = new QuestionsList("","","","","","","");
        final QuestionsList question9 = new QuestionsList("","","","","","","");
        final QuestionsList question10 = new QuestionsList("","","","","","","");
        final QuestionsList question11 = new QuestionsList("","","","","","","");
        final QuestionsList question12 = new QuestionsList("","","","","","","");
        final QuestionsList question13 = new QuestionsList("","","","","","","");
        final QuestionsList question14 = new QuestionsList("","","","","","","");
        final QuestionsList question15 = new QuestionsList("","","","","","","");
        final QuestionsList question16 = new QuestionsList("","","","","","","");
        final QuestionsList question17 = new QuestionsList("","","","","","","");
        final QuestionsList question18 = new QuestionsList("","","","","","","");
        final QuestionsList question19 = new QuestionsList("","","","","","","");
        final QuestionsList question20 = new QuestionsList("","","","","","","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "python":
                return pythonQuestions();
            default:
                return jsQuestions();

        }
    }
}
