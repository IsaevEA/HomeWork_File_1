import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter("users.txt");
        System.out.println("Введите ваше имя");
        String userName = scanner.next();
        System.out.println("Введите ваш возраст");
        int userAge = scanner.nextInt();
        fw.write(userName);
        fw.write(": " +userAge);
        fw.close();


        FileReader fr = new FileReader("users.txt");
        Scanner scanner1 = new Scanner(fr);
        while (scanner1.hasNextLine()){
            System.out.println(scanner1.nextLine());
        }
        fr.close();
    }
}