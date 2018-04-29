package practice08;

public class Klass {

  private Integer number;

  private Student leader;

  public Klass(Integer number) {
    this.number = number;
  }

  public void setLeader(Student leader) {
    this.leader = leader;
  }

  public Student getLeader() {
    return leader;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getDisplayName() {
    return "Class " + number;
  }

  public void assignLeader(Student student) {
    this.setLeader(student);
  }
}