package ReflectionPractical;

/* Write a Java program that reads the name of a class from the command line and
emits the interface of the class in Java syntax
(interface or class, modifiers, constructors, methods, fields; no method bodies).

Hint: You can load a class whose name you know with java.lang.Class.forName().

The java.lang.Class class offers a rich interface that enables you to inspect the interface of any class.
Apply this program to a set of classes and interfaces as test input. You may also use the program on itself.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.Arrays;

public class commandLineShowStuff {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rabbit myRabbit = new Rabbit("Gerald the First", 9, 9);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        boolean hasCompleted = false;

        commandLineShowStuff o = new commandLineShowStuff();

        Package pack = o.getClass().getPackage();

        String packageName = pack.getName();


        while(hasCompleted == false){
            System.out.print("Enter the class you want to see the interface of: ");

            String classToCheck = in.readLine();

            try {
                System.out.println(Arrays.toString(Class.forName(packageName + "." + classToCheck).getAnnotatedInterfaces()));
                hasCompleted = true;
            }catch (Exception ClassNotFoundException) {
                System.out.println("That class does not exist within this Package try again");
            }
        }


    }
}
