public class Main {
    // Question 1 - calculateGrade
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else if (score >= 50 && score <= 59) {
            return 'E';
        } else {
            return 'F';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "fizzbuzz";
        } else if (value % 3 == 0) {
            return "fizz";
        } else if (value % 5 == 0) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String front = str.substring(0, 2);
            return front + str + front;
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String prefix = str.substring(0, str.length() - 3);
            String suffix = str.substring(str.length() - 3).toUpperCase();
            return prefix + suffix;
        }
    }
}

