package dz;

// public class dz2 {
//     public static boolean isPalindrome(String text) {
//         String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//         String reversed = new StringBuffer(replaced).reverse().toString();
//         return reversed.equals(replaced);
//     }

//     public static void main(String[] args) {
//         System.out.println(isPalindrome("шалаш"));
//     }
// }


import java.io.*;

public class dz2 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            for (int i = 1; i <= 100; i++) {
                writer.write("TEST1\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}