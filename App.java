import java.util.Scanner;

public class App extends Methods{
    public static void main(String[] args) {
        DateNow();
        Scanner sc = new Scanner(System.in);
        char aChar = 0;
        int b = 2;
        String c = "NooDijij", ends = "!";
        String s ;
        StringMethods stringMethods = new StringMethods();
        System.out.print("Enter the sentence: ");
        s = sc.nextLine();
        print("the source string --> " + s);
        int lenght = stringMethods.lenght(s);
        delay(200);
        print("lenght of the string --> " + lenght);
        delay(100);
        try {
            aChar = stringMethods.CharAt(s, b);
            System.out.printf("the char of number %d in string --> %s <-- is '%s' \n", b, s, aChar);
        } catch (StringIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
        } catch (RuntimeException e){
            //throw new RuntimeException();
        }
        boolean isContains = stringMethods.isContains(s, c);
        if(isContains)
            System.out.printf("There are the string '%s' in your source string '%s'\n ", c, s);
        else
            System.out.printf("There are NOT the string '%s' in your source string '%s''\n", c, s);

        boolean a = stringMethods.endsWith(s, ends);

        if(a){
            System.out.printf("Your string --> %s <-- is ends with %s ", s, ends);
        } else {
            System.out.printf("Your string --> %s <-- doesnt ends with '%s' \n", s, ends);
        }

        String low_case = stringMethods.lowerCase(s);
        print("to lower case: " + low_case);

        String up_case = stringMethods.upperCase(s);
        print("to upper Case: " + up_case);
        System.out.println("\nEnd :>");
    }
}
