import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

  private int id;
  private String title;
  private Course course;
  private Doctor doctor;
  private List<Question> questions = new ArrayList<>();

  public void addQuestion(Question question) {
    questions.add(question);
  }

  public boolean removeQuestion(int id) {
    for (int i = 0; i < questions.size(); i++) {
      if (questions.get(i).getId() == id) {
        questions.remove(i);
        return true;
      }
    }
    return false;
  }

  public boolean updateQuestion(int id, Question question) {
    for (int i = 0; i < questions.size(); i++) {
      if (questions.get(i).getId() == id) {
        questions.set(i, question);
        return true;
      }
    }
    return false;
  }

  public Question getQuestionById(int id) {
    for (Question question : questions) {
      if (question.getId() == id) {
        return question;
      }
    }
    return null;
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

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Doctor getDoctor() {
    return doctor;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}
