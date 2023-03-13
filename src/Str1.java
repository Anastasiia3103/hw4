public class Str1 {
    public String firstTwo ( String str ) {
        if ( str.length () < 2 ) {
            return str;
        }
        else {
            return str.substring (0, 2);
        }
    }

    public String twoChar ( String str, int index ) {
        if ( index < 0 || index > str.length () - 2 ) {
            return str.substring (0, 2);
        }
        return str.substring (index, index + 2);
    }

    public String theEnd ( String str, boolean front ) {
        if ( front ) {
            return str.substring (0, 1);
        }
        else {
            return str.substring (str.length () - 1);
        }
    }

    public String middleThree ( String str ) {
        int mid = str.length () / 2;
        return str.substring (mid - 1, mid + 2);
    }

    public String lastTwo ( String str ) {
        if ( str.length () < 2 ) {
            return str;
        }
        else {
            char[] chars = str.toCharArray ();
            char temp = chars[ str.length () - 1 ];
            chars[ str.length () - 1 ] = chars[ str.length () - 2 ];
            chars[ str.length () - 2 ] = temp;
            return new String (chars);
        }
    }

    public String without2 ( String str ) {
        int length = str.length ();

        if ( length < 2 ) {
            return str;
        }

        String firstTwo = str.substring (0, 2);
        String lastTwo = str.substring (length - 2);

        if ( firstTwo.equals (lastTwo) ) {
            return str.substring (2);
        }
        else {
            return str;
        }
    }

    public boolean hasBad ( String str ) {
        if ( str.length () >= 3 && (str.substring (0, 3).equals ("bad") || (str.length () >= 4 && str.substring (1, 4).equals ("bad"))) ) {
            return true;
        }
        else {
            return false;
        }
    }

    public String left2 ( String str ) {
        if ( str.length () < 2 ) {
            return str;
        }
        return str.substring (2) + str.substring (0, 2);
    }

    public String nonStart ( String a, String b ) {
        // Get the substring of each string starting from the second character
        String aSub = a.substring (1);
        String bSub = b.substring (1);

        // Concatenate the substrings and return the result
        return aSub + bSub;
    }

    public String nTwice ( String str, int n ) {
        // Check if the string length is at least n
        if ( str.length () >= n ) {
            // Extract the first n characters and the last n characters
            String firstNChars = str.substring (0, n);
            String lastNChars = str.substring (str.length () - n);
            // Concatenate the first and last n characters and return the result
            return firstNChars + lastNChars;
        }
        else {
            // If the string length is less than n, return the original string
            return str;
        }
    }
}
