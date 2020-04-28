import java.util.Scanner;

public class hallo {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        System.out.println("podaj wiek ");
        int age = dane.nextInt();
        System.out.println("twój wiek: " + age);
        int x = 18- age;

    if (18 <= age)
    {
        System.out.println("twój wiek: " + age);
    }
    else
    {
        System.out.println("nie jesteś pełnoletni, brakuje tobie : "+  x + " lat");
    }

    }
}

