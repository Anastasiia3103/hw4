public class Str2 {
    public static String repeatLastNChars (String str, int n) {
        if ( n < 0 || n > str.length() ) {
            throw new IllegalArgumentException("n must be between 0 and the length of the string, inclusive.");
        }
        String lastNChars = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(lastNChars);
        }
        return sb.toString();
    }

    public static boolean prefixAppearsElsewhere (String str, int N) {
        String prefix = str.substring(0, N);
        for (int i = N; i <= str.length() - N; i++) {
            if ( str.substring(i, i + N).equals(prefix) ) {
                return true;
            }
        }
        return false;
    }

    public static boolean isXYBalanced (String s) {
        int xCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'x' ) {
                xCount++;
            }
            else if ( s.charAt(i) == 'y' ) {
                xCount--;
            }
        }
        return xCount == 0;
    }

    public static String stringSplosion (String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str.substring(0, i + 1));
        }
        return result.toString();
    }

    String input = "Hello";
    int n = 3;
    String output = stringSplosion(input, n);

    public static String mergeStrings (String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int maxLen = Math.max(lenA, lenB);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            if ( i < lenA ) {
                sb.append(a.charAt(i));
            }
            if ( i < lenB ) {
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }

    String a = "Hello";
    String b = "world!";
    String result = mergeStrings(a, b);

    public void main (String[] args) {
        System.out.println(output);
        System.out.println(result);
    }

} 
