import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        a = in.nextInt();
        System.out.println("Podaj liczbę b: ");
        b = in.nextInt();
        System.out.println(NWD(a, b));
    }

    /*
    nazwa funkcji:          NWD
    opis funkcji:           funkcja wykonuje algorytm Euklidesa, czyli algorytm szukający największy wspólny dzielnik dwóch liczb
    parametry:              a - Liczba całkowita, którą jest pierwszą z dwóch liczb, dla których funkcja największy wspólny dzielnik
    *                       b - Liczba całkowita, którą jest drugą z dwóch liczb, dla których funkcja największy wspólny dzielnik
    *zwracany typ i opis:   int - zwracana wartość jest największym wspólnym dzielnikiem dla liczb poddanych jako argumenty
    *autor:                 25 Paweł Rozbejko
    * */
    public static int NWD(int a, int b) {
        while (a != b)
            if (a > b) a -= b;
            else b -= a;
        return a;
    }
}