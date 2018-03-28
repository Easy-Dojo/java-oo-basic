package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klassCode;
    private Student leader;
    private List<BroadcastJoinListener> joinObservers = new ArrayList<BroadcastJoinListener>();
    private List<BroadcastLeaderListener> leaderObservers = new ArrayList<BroadcastLeaderListener>();

    public void assignLeader(Student student){
        if (student.getKlass().equals(this)) {
            this.leader = student;
            for (BroadcastLeaderListener leaderListener : leaderObservers) {
                leaderListener.broadcastLeaderListener(student,this);
            }
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

    public Klass(int klassCode) {
        this.klassCode = klassCode;
        this.joinObservers = new ArrayList<>();
        this.leaderObservers = new ArrayList<>();
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        for (BroadcastJoinListener joinObserver : joinObservers) {
            joinObserver.broadcastJoinListener(student,this);
        }
    }

    public void registerJoinListener(BroadcastJoinListener joinListener) {
        System.out.println(joinListener);
        this.joinObservers.add(joinListener);
    }

    public void registerLeaderListener(BroadcastLeaderListener leaderListener) {
        this.leaderObservers.add(leaderListener);
    }
}