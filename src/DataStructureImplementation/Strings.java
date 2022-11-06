package DataStructureImplementation;

import java.util.Locale;

/*  Strings....
string are immutable in nature which means it cannot be modified once it is created
they are the sequence of character array

It can be created:
1. using literals
2. Using new operator


Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(),
 replace(), compareTo(), intern(), substring() etc.

Advantages:
1. simple
2. Robust
3. secured
4. object-oriented


Disadvantages:
1. memory consumption
2. Performance
3. Garbage collection
4. less interactive


 */
public class Strings {

    public static void main(String[] args) {
        String s= "Devi Prasad Mishra";

        String d = new String("ram");

        System.out.println(s);
        System.out.println(d);

        String value =s.toLowerCase(); // convert the string to lower case
        System.out.println(value);

        String cha = String.valueOf(s.charAt(5)); //to print the character at the index 5

        System.out.println(cha);

        //present each character of string one by one
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }

        System.out.println();

        //check whether  the strings are equal or not
        if(s.equalsIgnoreCase(d)){
            System.out.println("Both have Same content");
        }
        else {
            System.out.println("Both have different content");
        }


    }
}
