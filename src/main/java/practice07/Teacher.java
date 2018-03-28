package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduceWith(Student student){
        int studentKlassNumber =  student.getKlass().getNumber();
        int teacherKlassNumber =  this.getKlass().getNumber();
        String words = String.format("My name is %s. I am %d years old. I am a Teacher.", this.getName(), this.getAge());
        words += studentKlassNumber==teacherKlassNumber? String.format(" I teach %s.",student.getName()) : String.format(" I don't teach %s.",student.getName());
        return words;
    }

    @Override
    public String introduce() {
        String words = super.introduce() + " I am a Teacher.";
        if (this.klass != null) {
            words += String.format(" I teach Class %d.", this.klass.getNumber());
        }else {
            words += " I teach No Class.";
        }
        return words;
    }
}