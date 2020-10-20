package hr.unipu.java;

/**
 * * Ovo je pitanje koje prihvaca samo kratki odgovor.
 * Kratki odgovor je jedna rijec.*
 * * @author Luka Vukovic
 * * @version 1.256
 */

public class ShortAnswerQuestion {
    /**tekst pitanja
     * */
    private String text;
    /**ovaj odgovor je tocan!
     * */
    private String correctAnswer;

    public ShortAnswerQuestion(String text, String correctAnswer) {

        this.text = text;

        this.correctAnswer = correctAnswer;

    }
    public String getText() {
        return text;

    }
    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);

    }
}