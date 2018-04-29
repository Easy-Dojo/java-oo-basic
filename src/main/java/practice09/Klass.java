package practice09;

public class Klass {
    private Integer number;
    private Student leader;

    public void assignLeader(Student student){
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
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}