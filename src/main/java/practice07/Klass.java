package practice07;

public class Klass {
    private Integer klassCode;

    public Integer getNumber() {
        return klassCode;
    }

    public String getDisplayName(){
        return "Class " + klassCode;
    }

    public void setKlassCode(Integer klassCode) {
        this.klassCode = klassCode;
    }

    public Klass(Integer klassCode) {
        this.klassCode = klassCode;
    }
}
