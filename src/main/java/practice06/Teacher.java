package practice06;

public class Teacher extends Person {

  private Integer klass;

  public Teacher(String name, Integer age, Integer klass) {
    super(name, age);
    this.klass = klass;
  }

  public Teacher(String name, Integer age) {
    super(name, age);
  }

  public Integer getKlass() {
    return klass;
  }

  public void setKlass(Integer klass) {
    this.klass = klass;
  }

  @Override
  public String introduce() {
    String words = super.introduce() + " I am a Teacher.";
    words +=
        this.klass != 0 ? String.format(" I teach Class %d.", this.klass) : " I teach No Class.";
    return words;
  }
}