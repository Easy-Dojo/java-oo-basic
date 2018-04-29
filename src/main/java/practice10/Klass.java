package practice10;

public class Klass {

  private Integer klassCode;
  private Student leader;

  public void assignLeader(Student student) {
    if (student.getKlass().equals(this)) {
      this.leader = student;
    } else {
      System.out.println("It is not one of us.");
    }
  }

  public Student getLeader() {
    return leader;
  }

  public Integer getNumber() {
    return klassCode;
  }

  public String getDisplayName() {
    return "Class " + klassCode;
  }

  public void setKlassCode(int klassCode) {
    this.klassCode = klassCode;
  }

  public Klass(Integer klassCode) {
    this.klassCode = klassCode;
  }

  public void appendMember(Student student) {
    student.setKlass(this);
  }
}