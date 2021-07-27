/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        System.out.println("The value was ... " + s);

        // reading from a file ...
        // Method 1
//        File file = new File("unicorns.txt");
//        try {
//            Scanner scanner = new Scanner(file);
//            while(scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("The provided file path/name caused a file not found exception");
//        }

        // Method 2
//        Path path = Paths.get("unicorns.txt");
//        try {
//            List<String> fileLines = Files.readAllLines(path);
//            for(String line : fileLines){
//                System.out.println(line);
//            }
//        } catch (IOException exception){
//            System.out.println("An error occurred while reading from file");
//        }
//        System.out.println("test if this gets printed ... ");

        // Method 3
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("unicorns.txt"));
//            Scanner scanner = new Scanner(reader);
//            while (scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (FileNotFoundException exception){
//            System.out.println("The provided file path/name caused a file not found exception");
//        }

        // Method 4
//        Path path = Paths.get("unicorns.txt");
//        try (BufferedReader reader = Files.newBufferedReader(path)) {
//            String line = reader.readLine();
//            while (line != null){
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        int[] numbers = {1,2,3,4,5,6,7,8};
        int[] reversed = reverseArray(numbers);
        System.out.println(Arrays.toString(reversed));
//        for(int i = 0; i < reversed.length; i++){
//            System.out.println(reversed[i]);
//        }

    }

    public static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reversedArray[arr.length-1-i] = arr[i];
        }
        return reversedArray;
    }

}