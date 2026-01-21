package string;

public class StringBuff{

    // 1. Reverse string using StringBuffer
    public static String reverseUsingStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    // 2. Append multiple strings efficiently using StringBuilder
    public static String appendMultipleStrings() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append("Word").append(i).append(" ");
        }
        return sb.toString();
    }

    // 3. Compare performance of String vs StringBuilder
    public static void comparePerformance() {
        int n = 100000;

        // String performance
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String time: " + (end1 - start1) + " ms");

        // StringBuilder performance
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end2 - start2) + " ms");
    }

    // 4. Insert and delete characters
    public static void insertAndDelete() {
        StringBuilder sb = new StringBuilder("HelloWorld");

        sb.insert(5, " ");
        System.out.println("After insert: " + sb);

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
    }

    // 5. Demonstrate mutability of String vs StringBuilder
    public static void demonstrateMutability() {

        // String (Immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println("String after concat: " + s);

        // StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);
    }

    public static void main(String[] args) {

        System.out.println("Reverse using StringBuffer:");
        System.out.println(reverseUsingStringBuffer("Saurabh"));

        System.out.println("--------------------------------");

        System.out.println("Append multiple strings:");
        System.out.println(appendMultipleStrings());

        System.out.println("--------------------------------");

        System.out.println("Performance comparison:");
        comparePerformance();

        System.out.println("--------------------------------");

        System.out.println("Insert and Delete:");
        insertAndDelete();

        System.out.println("--------------------------------");

        System.out.println("Mutability Demo:");
        demonstrateMutability();
    }
}