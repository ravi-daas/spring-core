package property_Injection;

public class property_Injection {

    private int myId;
    private int myAge;
    private String myName;

    // public int getMyId() {
    // return myId;
    // }
    // public int getMyAge() {
    // return myAge;
    // }
    // public String getMyName() {
    // return myName;
    // }

    public void setMyId(int myId) {
        this.myId = myId;
        // System.out.println("set -id");
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
        // System.out.println("set -age");
    }

    public void setMyName(String myName) {
        this.myName = myName;
        // System.out.println("set -name");
    }

    // public setter_Injection(int myId, int myAge, String myName) {
    // this.myId = myId;
    // this.myAge = myAge;
    // this.myName = myName;
    // }

    // public setter_Injection(){

    // }

    @Override
    public String toString() {
        return "Values by toString(): [myId=" + myId + ", myAge=" + myAge + ", myName=" + myName + "]";
    }

}