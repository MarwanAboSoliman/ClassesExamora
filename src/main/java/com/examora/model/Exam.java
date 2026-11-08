
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exam {

    private int id;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int duration;
    private double totalMark;
    private int numberOfQuestion;
    private QuestionBank questionBank;
    private List<Question> questions;

    public List<Question> getRandomQuestions() {

        List<Question> randomQuestions = new ArrayList<>(questions);

        Collections.shuffle(randomQuestions);

        if (numberOfQuestion < randomQuestions.size()) {
            randomQuestions = new ArrayList<>(
                randomQuestions.subList(0, numberOfQuestion)
            );
        }

        return randomQuestions;
    }

    public void displayExam() {
        for (Question question : questions) {
            question.display();
        }
    }

    public boolean isOpen() {
        LocalDateTime now = LocalDateTime.now();

        return !now.isBefore(startDate) && !now.isAfter(endDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    public QuestionBank getQuestionBank() {
        return questionBank;
    }

    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
