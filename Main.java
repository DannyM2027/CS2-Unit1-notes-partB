/**
 *  @author Daniel M.
 *  @since Oct 3 2025
 *  @version 1.0
 *  Notes 1.8-1.15
 */
public class Main {
   /**
    * main mehtod is entry point of the program
    * @param input is an array of strings
    * @return void means no OUTPUTT
    */

   public static void main(String []args) {
      System.out.println("Math Class Methods");
      
      // Absolute value it the .abs() method
      // Methods with a return value mean u need to do smt with that output (non void)
      Math.abs(-41); // works but cant see result
      // u cld store results in a variable
      int absValue = Math.abs(-35);
      System.out.println(absValue);
      System.out.println(Math.abs(-388.55));
      // abs is an OVERLOADED method
      // There are multiple versions of same method with same name but diff paramaters
      double absValueDoub = Math.abs(-79.73);
      System.out.println(absValueDoub);

      // Math.pow() takes two arguments
      // and raises the first arg to the power of the second
      double threeSquared = Math.pow(3, 2);

      System.out.println(threeSquared);
      // Math.sqrt() takes one arg and returns sqroot
      double root99 = Math.sqrt(99);
      System.out.println(root99);
      // Math.random() returns a double between [0.0 - 1.0)
      double randNum = Math.random();
      System.out.println(randNum);
      // if u want to gen a ramnd number in ranhe udjusgt output
      // random between 1-100

      double randNum2 = Math.random() * 100;
      System.out.println(randNum2);

      // General format - Math.random() * max + min
      int randNum4 = (int) (Math.random() * 6) + 66;
      System.out.println(randNum4);


      // Strings are OBJECTS from the string class
      // containing a sequence of CHARACTERS
      // indexed starting from 0

      // Creat String objects in 2 ways
      // 1. Call the string () CONSTRUCTUOR
      String str1 = new String("Comp sci");
      // 2. made a shortcut to setup strings
      String str2 = "AP Java";

      // Call String METHODS on a specific OBJECT
      int str1Len = str1.length();
      int str2Len = str2.length();
      System.out.println("Length 1: " + str1Len);
      System.out.println("Length 2: " + str2Len);
      // .length() returns the NUMBER OF CHARACTERS
      // spaces are included

      // .substring() is an OVERLOADED method that returns part of a larger string
      String message = "APCS is awesome";

      String firstWord = message.substring(0, 3);
      System.out.println(firstWord);
      // .substring(int form , int to) dont included

      String lastWord = message.substring(8);
      System.out.println(lastWord);




   }
}
