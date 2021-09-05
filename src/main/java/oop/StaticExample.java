package oop;

public class StaticExample {
    /*
    public static variables are the greatest risk as they're essentially global variables

    if given the access any call to the class can change a particular variable for every object that uses it.
     */
    public static String doomsdayButtonStatus;

    // The static block is used as a constructor for any static variable that is in use.
    static {
        doomsdayButtonStatus = "all is well";
    }

    public String objectState;

    public StaticExample(String objectState) {
        this.objectState = objectState;
    }

//    public void doomsdayUpdate(String updateDDStatus){
//        doomsdayButtonStatus = updateDDStatus;
//    }

    public String readDoomsday(){
        return doomsdayButtonStatus;
    }

    public static void main(String[] args) {
        StaticExample static1 = new StaticExample("static1");
        StaticExample static2 = new StaticExample("static2");


        System.out.println(StaticExample.doomsdayButtonStatus);

        System.out.println(static1.objectState);
        System.out.println(static2.objectState);

//        static2.doomsdayUpdate("uh no");
        System.out.println(static1.doomsdayButtonStatus);


    }
}
