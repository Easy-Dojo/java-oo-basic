package practice09;

public class Teacher extends Person {

  private Klass klass;

  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }

  public Teacher(Integer id, String name, Integer age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public Teacher(Integer id, String name, Integer age) {
    super(id, name, age);
  }

  public String introduceWith(Student student) {
    String words = String
        .format("My name is %s. I am %d years old. I am a Teacher.", this.getName(), this.getAge());
    words += student.getKlass().equals(this.klass) ? String
        .format(" I teach %s.", student.getName())
        : String.format(" I don't teach %s.", student.getName());
    return words;
  }

  @Override
  public String introduce() {
    String words = super.introduce() + " I am a Teacher.";
    words += this.klass != null ? String.format(" I teach Class %d.", this.klass.getNumber())
        : " I teach No Class.";
    return words;
  }
}