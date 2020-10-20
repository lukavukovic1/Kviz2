package hr.unipu.java;

public class Main {
    public static void main(String[] args) {
        ShortAnswerQuestion question = new ShortAnswerQuestion
                ("Koje su boje banane?", "Žute");
        //System.out.println( "i = "+ i );
        System.out.println(question.getText());
        System.out.println("Crvene: " + question.isCorrectAnswer("Crvene"));
        System.out.println("Žute: " + question.isCorrectAnswer("Žute"));
    }
}