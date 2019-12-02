package frc.robot;

import java.util.ArrayList;
import java.util.List;

/**
 * Our class for {@link Predicate} examples.
 */
public class Example {

    /**
     * Filters an array according to input condition.
     * 
     * @param arr - the array to filter.
     * @param filterFunction - the {@link Predicate predicate function} to test the objects of the array.
     * Should return true if the object should be
     * filtered out and false if it should be left in.
     * 
     * @return - The array with all of the values maintaining the input condition.
     */
    public static <T> T[] filter(T[] arr, Predicate<T> filterFunction) {
        
        // We will use an array list (an array that can remove and add values) to construct or new array.
        List<T> result = new ArrayList<>(); 
        
        // Foreach value in the original array, add it to the result array if should be filtered out according to the
        // input predicate function. 
        for (T var : arr) {
            if (!filterFunction.test(var)) {
                result.add(var);
            }
        }

        // Return the result, turned back to the arrat of the original type.
        //
        // Note that the list's method toArray() return  an object array, 
        // and as such needs to be casted back to T array.
        //
        // VS code warns us that the casting is unchecked, but in reality it will always work since the 
        // result list was defined as one of type T.
        return (T[])result.toArray();
    }

    /**
     * Our main method, to test out our stuff!
     */
    public static void main(String[] args) {
        
        // Since we defined an Integer array, the second paramter we pass to filter we'll be Predicate<Integer>. 
        Integer[] arr = new Integer[] {1, 2, 4, 10, 42, 7, 3};
        
        // All three of these method calls do the exact same thing - filter arr of all numbers
        // greater than 5. In each, we pass the predicate paraneter diffrently.

        // Here, we passed an instance of a class. Below, we created a new class which implements Predicate<Integer>. 
        // In it we implemented its method (test) to check for numbers greater than 5. As such, when we pass an instance
        // of it to filter, it will know to use its specific implementation of the method.
        arr = filter(arr, new Tester());

        // Here we use somwthing called a lambda expression - a wuick, inline definiton of a function. 
        // these are from the template (parameters) -> returnValue.
        // Since we already specified the type of the function (Predicate<Double> - a function which takes 
        // one double value and returns a boolean), we don;t need to specify the type of the paranmter ofr the return value.
        // We do need to name the parameters int the parenthesis (in here, one parameter which we named value).
        // After the parenthesis with the paramters, we type an arrow -> , called the lambda operator.
        // After the arrow, we type the return value, here the boolean expression value > 5.
        arr = filter(arr, (value) -> value > 5);

        // Here we passed the function tester (defined below) directly into filter. We take the object the function belongs too,
        // here the Example class itself, since it's static, ffollowed by a double colon :: , and the name of the function, 
        // without parenthesis. Notice again that we don;t need to define any types or paramteres, since the compielr knows
        // it's looking for a specific function which takes a double and returms a boolean - ot aleready lnows the parameters 
        // and types.
        //
        // Also note that the function must fit into the Predicate<Double> type - it must take a double and return a boolean.
        arr = filter(arr, Example::tester);
    }
    
    /**
     * A class implementing {@link Predicate}. Now we can pass an instance of this as a parameter,
     * and as such essintialy pass our implementation of {@link #test(Integer) }.  
     */
    public static class Tester implements Predicate<Integer>{
       
        @Override
       public boolean test(Integer value) {
           return value > 5;
       } 
    }

    /**
     * A function which fits {@link Predicate}'s template: takes an integer and returns a boolean.
     * @param value
     * @return
     */
    public static boolean tester(Integer value) {
        return value > 5;
    }
}