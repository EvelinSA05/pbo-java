// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kalkulator hitung = new Kalkulator(5, 4);

        hitung.tampil();
    }
}

class Kalkulator{
   Kalkulator(int a, int b){
       System.out.println("Belajar Konstruktor " + a + b);
   }

   void tampil(){
       System.out.println("Belajar Java");
   }
}