// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kalkulator hitung = new Kalkulator(5, 4);

        hitung.tampil();

        int a, b, c;
        a = 5;
        b = 6;
        c = 7;

        int d = 5, e = 8, f = 9;

        double pi = 3.14;
        double pecahan = 5.0;

        byte angka = 20;

        char x = 'g';

        System.out.println("angka " + d);
    }
}

class Kalkulator{
   Kalkulator(int a, int b){
       System.out.println("Belajar Konstruktor " + a + b);
   }

   void tampil(){
       byte a = 127;

       char b = 'B';

       short s = 32767;

       float f = 112345;

       double d = 1.5;

       System.out.println("\" hello world \"");
   }

   int kali(){

   };
}