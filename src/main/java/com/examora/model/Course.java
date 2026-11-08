import java.util.ArrayList;
import java.util.List;

public class Course {

  private String name;
  private List<Doctor> doctors;

  public Course() {
    doctors = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Doctor> getDoctors() {
    return doctors;
  }

  public void setDoctors(List<Doctor> doctors) {
    this.doctors = doctors;
  }
}
