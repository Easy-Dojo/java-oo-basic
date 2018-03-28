package practice10;

public class Klass {
    private int klassCode;
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

    public int getNumber() {
        return klassCode;
    }

    public String getDisplayName(){
        return "Class " + klassCode;
    }

    public void setKlassCode(int klassCode) {
        this.klassCode = klassCode;
    }

    public Klass(int klassCode) {
        this.klassCode = klassCode;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}