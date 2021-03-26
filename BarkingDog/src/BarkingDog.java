public class BarkingDog {

    public static  boolean shouldWakeUp(boolean barking, int hourOfDay){

        if ((barking) && (hourOfDay >= 0) && (hourOfDay < 8) || (hourOfDay == 23) ){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}

