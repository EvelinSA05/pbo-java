// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kalkulator  hitung = new Kalkulator();

        hitung.penjumlahan();

        System.out.println(hitung.perkalian(3, 5));

        hitung.x = 100;

        System.out.println(hitung.x);

        //instance/objek-> proses pembuatan disebut instanciate
        }
    }

class Kalkulator{
    int x;
    int y;

    void penjumlahan(){
        System.out.println("penjumlahan");
    }

    int perkalian(int a, int b){
        return a * b;
    }
}