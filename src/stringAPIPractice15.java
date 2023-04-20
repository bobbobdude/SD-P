public class stringAPIPractice15 {

    static String replaceAllAWithX(String thingToCheck){
        thingToCheck = thingToCheck.toUpperCase();

        thingToCheck = thingToCheck.replace('A', 'X' );

        return thingToCheck;
    }
}
