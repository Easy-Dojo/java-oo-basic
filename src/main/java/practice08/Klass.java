package practice08;

public class Klass {
    private int klassCode;
    private Student leader;

    public void assignLeader(Student student){
        this.leader = student;
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
}