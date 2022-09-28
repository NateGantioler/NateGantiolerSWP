import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;

public class WuerfelSpiel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int Wurfel = 0;
        Wurfel = scanner.nextInt();
        for(int i = 0; i < 100; i++)
        {
            Wurfel = random.nextInt(1, 6);
            System.out.print(Wurfel);
        }
    }
}
