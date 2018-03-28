package practice07;

public class Klass {
    private int klassCode;

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
