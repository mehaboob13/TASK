import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println("Integer equivalent: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValues.get(s.charAt(i));
            if (i < s.length() - 1 && currentVal < romanValues.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}