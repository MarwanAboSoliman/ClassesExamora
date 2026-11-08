
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ExamAttempt {

    private int id;
    private Student student;
    private Exam exam;
    private List<StudentAnswer> studentAnswers = new ArrayList<>();
    private LocalDateTime startTime;
    private LocalDateTime submissionTime;
    private double totalMark;
    private boolean isSubmitted;

    public void addAnswer(StudentAnswer answer) {
        studentAnswers.add(answer);
    }

    public void submit() {
        totalMark = calculateTotalMark();
        submissionTime = LocalDateTime.now();
        isSubmitted = true;
    }

    public double calculateTotalMark() {
        totalMark = 0;

        for (StudentAnswer answer : studentAnswers) {
            totalMark += answer.calculateMarks();
        }

        return totalMark;
    }

    public double getResult() {
        return totalMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public List<StudentAnswer> getStudentAnswers() {
        return studentAnswers;
    }

    public void setStudentAnswers(List<StudentAnswer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(LocalDateTime submissionTime) {
        this.submissionTime = submissionTime;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
