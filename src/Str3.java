import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str3 {
    public static int sumOfDigits (String str) {
        int sum = 0;
        for (int i = 0; i < str.length (); i++) {
            char c = str.charAt (i);
            if ( Character.isDigit (c) ) {
                int digit = Integer.parseInt (String.valueOf (c));
                sum += digit;
            }
        }
        return sum;
    }

    public static int sumNumbers (String str) {
        // Define a regular expression to match numbers
        String regex = "\\d+";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile (regex);

        // Use the pattern to create a matcher for the input string
        Matcher matcher = pattern.matcher (str);

        int sum = 0;
        // Iterate through the matches and add their integer value to the sum
        while (matcher.find ()) {
            String match = matcher.group ();
            int num = Integer.parseInt (match);
            sum += num;
        }
        return sum;
    }

    public static void main (String[] args) {
        String input = "abc123def456ghi789";
        int sum = sumNumbers (input);
        System.out.println (sum); // Output: 1368

    }

    public int countYZ (String str) {
        int count = 0;
        str = str.toLowerCase () + " "; // convert the string to lowercase and add a space at the end
        for (int i = 0; i < str.length () - 1; i++) {
            if ( (str.charAt (i) == 'y' || str.charAt (i) == 'z') && !Character.isLetter (str.charAt (i + 1)) ) {
                count++;
            }
        }
        return count;
    }


} 
