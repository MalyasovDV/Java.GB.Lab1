import java.lang.reflect.Array;

public class program {
    public static void main(String[] args) {
        System.out.printf("sum of %d and %d is between 10 and 20: %b\n", 5, 15, isSumBetween10And20(5, 15)); // true
        System.out.printf("sum of %d and %d is between 10 and 20: %b\n\n", 7, 15, isSumBetween10And20(7, 15)); // false

        System.out.printf("is %d positive: %b\n",5, isPositive(5)); // true
        System.out.printf("is %d positive: %b\n\n", -3, isPositive(-3)); // false

        System.out.println("repeat 'abcd' 5 times");
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();

        System.out.printf("is %d leap year: %b\n", 2020, isLeapYear(2020)); // true
        System.out.printf("is %d leap year: %b\n\n", 2006, isLeapYear(2006)); // false

        {
            int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 0, 1};
            System.out.println("array before convertion");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%d, ", arr[i]);
            }
            System.out.println();
            convertNumbers(arr);
            System.out.println("array after convertion");
            for (int i = 0; i < arr.length; ++i) {
                System.out.printf("%d, ",arr[i]);
            }
            System.out.println();
        }

        System.out.println();

        {
            int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println("array before multiplication");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%d, ", arr[i]);
            }
            System.out.println();
            lessThan6MultiplyBy2(arr);
            System.out.println("array after multiplication");
            for (int i = 0; i < arr.length; ++i) {
                System.out.printf("%d, ",arr[i]);
            }
            System.out.println();
        }

        System.out.println();

        int[][] array = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        System.out.println("array before turning diagonal elements into 1");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%d, ",array[i][j]);
            }
            System.out.println();
        }
        diagonales(array);
        System.out.println("array after turning diagonal elements into 1");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%d, ",array[i][j]);
            }
            System.out.println();
        }
    }
    


private static boolean isSumBetween10And20(int a, int b) {
    if ((a + b >= 10) && (a + b <= 20)) {
        return true;
    }
    return false;

}

private static boolean isPositive(int x) {
    if (x > 0) {
        return true;
    }
    return false;
}

private static void printString(String source, int repeat) {
    for (int i = 0; i < repeat; ++i) {
        System.out.printf(source);
    }
    System.out.println();
}

private static int[] createArray(int len, int initialValue) {
    int[] result = new int[len];

    for (int i = 0; i < repeat; ++i) {
        result[i] = initialValue;
    }

    return result;
}

private static boolean isLeapYear(int year) {
    if (year % 4 == 0)
        return true;
    return false;
}

private static void convertNumbers(int[] array) {
    for (int i = 0; i < array.length; ++i) {
        if (array[i] == 1) {
            array[i] = 0;
        }
        else {
            array[i] = 1;
        }
    }
}

/*private static void convertNumbers(int[] array) {
    for (int i = 0; i < array.length; ++i) {
        array[i] ^= 1;
    }
}*/

private static void lessThan6MultiplyBy2(int[] array)
{
    for (int i = 0; i < array.length; ++i) {
        if (array[i] < 6) {
            array[i] *= 2;
        }
    }
}

private static void diagonales(int[][] array) {
    int length = array.length;
    for (int i = 0; i < length; ++i) {
        array[i][i] = 1;
        array[i][length - i - 1] = 1;
    }
}
}