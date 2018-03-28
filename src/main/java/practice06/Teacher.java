package practice06;

public class Teacher extends Person {
    private int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String words = super.introduce() + " I am a Teacher.";
        if (this.klass != 0) {
            words += String.format(" I teach Class %d.", this.klass);
        }else {
            words += " I teach No Class.";
        }
        return words;
    }
}