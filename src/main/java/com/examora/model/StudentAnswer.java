
import java.util.List;
import java.util.ArrayList;

public class StudentAnswer {

    private int id;
    private Question question;
    private List<Option> selectedOptions = new ArrayList<>();
    private Boolean trueFalseAnswer;
    private double awardedMark;

    public boolean checkAnswer() {

        if (question instanceof MCQ) {
            return question.checkAnswer(selectedOptions);
        }

        if (question instanceof TrueFalseQuestion) {
            return question.checkAnswer(trueFalseAnswer);
        }

        return false;
    }

    public double calculateMarks() {

        if (checkAnswer()) {
            awardedMark = question.getMark();
        } else {
            awardedMark = 0;
        }

        return awardedMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Option> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(List<Option> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public Boolean getTrueFalseAnswer() {
        return trueFalseAnswer;
    }

    public void setTrueFalseAnswer(Boolean trueFalseAnswer) {
        this.trueFalseAnswer = trueFalseAnswer;
    }

    public double getAwardedMark() {
        return awardedMark;
    }

    public void setAwardedMark(double awardedMark) {
        this.awardedMark = awardedMark;
    }
}
