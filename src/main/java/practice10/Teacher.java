package practice10;

import java.util.Iterator;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id,String name, int age, List<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public String introduceWith(Student student){
        String words = String.format("My name is %s. I am %d years old. I am a Teacher.", this.getName(), this.getAge());
        words += this.isTeaching(student) ? String.format(" I teach %s.",student.getName()) : String.format(" I don't teach %s.",student.getName());
        return words;
    }

    public boolean isTeaching(Student student) {
        Klass studentClass = student.getKlass();
        return this.getClasses().contains(studentClass);
    }

    @Override
    public String introduce() {
        String words = super.introduce() + " I am a Teacher.";
        if (this.classes != null) {
            words += " I teach Class";
            Iterator it = this.classes.iterator();
            while (it.hasNext()) {
                Klass klass= (Klass) it.next();
                words += String.format(" %d,",klass.getNumber());
            }
            char[] items=words.toCharArray();
            items[items.length-1]='.';
            words = new String(items);
        }else {
            words += " I teach No Class.";
        }
        return words;
    }

}