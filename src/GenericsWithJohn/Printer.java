package GenericsWithJohn;

//An example of what was done before Java generics
/*public class IntegerPrinter {

    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }

}

Say we needed a class to print out doubles we would have to
duplicate all of the above code but change everything to
accept the data type double - very inefficient
*/

//Below is an example with generics

public class Printer <T>{

}
