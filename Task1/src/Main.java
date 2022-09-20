public class Main {
    public static void main(String[] args) {
        // -- Integers --
        byte a = 0b0110_0100; // a = 100
        short b = (short) (0x10 * a); // a * 16 = 1600
        int c = 010 * b; // b * 8 = 12800
        long d = 10 * c; // c * 10 = 128000L

        System.out.println("Integers: ");
        System.out.println(
                "a = " + a + ", "+
                "b = " + b + ", "+
                "c = " + c + ", "+
                "d = " + d + "."
        );

        System.out.println("a * (b + d / c) = " + a_mul_b_plus_c_div_d(a, b, d, c) + ".");
                // no type conversion needed
                // as all formats are less than 64 bit (long)

        // -- Floating point --
        float e = 1.0f;
        double f = 1.0;

        System.out.println("Floating point numbers:");
        System.out.println(
                "e = " + e + ", "+
                "f = " + f + "."
        );

        // -- Boolean --
        boolean g = false;

        // -- Character --
        char h = 'h';

        if (!g) {
            System.out.println("Character:");
            System.out.println("h = '" + h + "'.");
        }

        System.out.println("Testing is_sum_within_10_to_20()...");
        System.out.println("Is 10 + 2 within 10..20?: " + is_sum_within_10_to_20(10,  2) + ".");
        System.out.println("Is 10 - 2 within 10..20?: " + is_sum_within_10_to_20(10, -2) + ".");

        System.out.println("Testing print_is_positive()...");
        print_is_positive(2);
        print_is_positive(-2);

        System.out.println("Testing is_negative()...");
        System.out.println("Is +2 negative?: " + is_negative(2) + ".");
        System.out.println("Is -2 negative?: " + is_negative(-2) + ".");

        System.out.println("Testing print_hi_name()...");
        print_hi_name("Cream Sandwich");
        print_hi_name("Dim Your Each");

        System.out.println("Testing is_leap_year()...");
        short year = 1900;
        System.out.println("Year " + year + " is " + ((is_leap_year(year)) ? "" : "not ") + "leap.");
        year = 1904;
        System.out.println("Year " + year + " is " + ((is_leap_year(year)) ? "" : "not ") + "leap.");
        year = 2000;
        System.out.println("Year " + year + " is " + ((is_leap_year(year)) ? "" : "not ") + "leap.");
    }
    static long a_mul_b_plus_c_div_d (long a, long b,
                                      long c, long d) {
        return a * (b + c / d);
    }

    static boolean is_sum_within_10_to_20 (int a1, int a2) {
        return (a1 + a2) >= 10 && (a1 + a2) <= 20;
    }

    static void print_is_positive (int a) {
        System.out.println("Number " + a + " is " + ((a >= 0) ? "posi" : "nega") + "tive.");
    }
    static boolean is_negative (int a) {
        return a < 0;
    }

    static void print_hi_name (String name) {
        System.out.println("\"Hi, " + name + "!\"");
    }

    static boolean is_leap_year (short year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 25 != 0);
    }
}