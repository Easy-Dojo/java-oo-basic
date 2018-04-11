package practice08;

public class Klass {
    private Integer klassCode;
    private Student leader;

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public Integer getNumber() {
        return klassCode;
    }

    public String getDisplayName(){
        return "Class " + klassCode;
    }

    public void setKlassCode(int klassCode) {
        this.klassCode = klassCode;
    }

    public Klass(Integer klassCode) {
        this.klassCode = klassCode;
    }
}