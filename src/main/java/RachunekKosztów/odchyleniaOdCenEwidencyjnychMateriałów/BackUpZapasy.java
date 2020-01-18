package RachunekKosztów.odchyleniaOdCenEwidencyjnychMateriałów;
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class BackUpZapasy extends JFrame {

    public static void main(String[] args){
        //wycena na poziomie cen nabycia
        //ZMIENNE DO OBLICZEŃ
        double wBilansowaMateriałów = 10000; //składa się na nią odchylenia(1800) + koszty zakupu(1200) + 7000(w mat. w stałych cenach ewidencyjnych) To co zostalo (5000) to trzecia kat. wynikowa
        double odchylenia = 1800;   //odchylenia DT - czyli dodajemy je, jeśli były by CT to odejmujemy od kategorii wynikowych
        double kosztyZakupu = 1200;
        double materiałyWydaneDoProdukcji = 5000;
        double wartośćMateriałówWCenachEwidencyjnych = wBilansowaMateriałów - odchylenia - kosztyZakupu;

        //KATEGORIE WYNIKOWE
        double wartośćZapasuMateriałówWGRzeczywistychCenZakupu;
        double wartośćZużytychMateriałówWGRzeczywistychCenZakupu;
        double wartośćZużytychMateriałówWGStałychCenEwidencyjnych;
        double wartośćZapasuMateriałówWGStałychCenEwidencyjnych;
        double wartośćZapasuMateriałówWGRzeczywistychCenNabycia;
        double wartośćZużytychMateriałówWGRzeczywistychCenNabycia;

        double wskaźnikNarzutuOdchyleń = odchylenia/(wartośćMateriałówWCenachEwidencyjnych);
        System.out.println("Wskaźnik narzutu odchyleń wynosi: " + wskaźnikNarzutuOdchyleń);
        double wartośćOdchyleńPrzypadającaNaMateriałyWydaneDoProdukcji = wskaźnikNarzutuOdchyleń * materiałyWydaneDoProdukcji;
        System.out.println("Wartość odchyleń przypadająca na materiały wydane do produkcji wynosi: " + wartośćOdchyleńPrzypadającaNaMateriałyWydaneDoProdukcji);
        double wNKZr = kosztyZakupu/(wBilansowaMateriałów - kosztyZakupu - odchylenia);
        System.out.println("Wskaźnik narzutu zakupów wynosi: " + wNKZr);

        double odchyleniaZakupowePrzypadająceNaZużyteMateriały = wNKZr * materiałyWydaneDoProdukcji;
        System.out.println("Odchylenia zakupowe przypadające na zużyte materiały wyniosły: " + odchyleniaZakupowePrzypadająceNaZużyteMateriały);
        System.out.println();
        // OSTATECZNA WARTOŚĆ KATEGORII WYNIKOWYCH
        wartośćZapasuMateriałówWGRzeczywistychCenZakupu = (wBilansowaMateriałów - odchylenia -kosztyZakupu - materiałyWydaneDoProdukcji) * (1 + wskaźnikNarzutuOdchyleń);
        wartośćZużytychMateriałówWGRzeczywistychCenZakupu = wartośćOdchyleńPrzypadającaNaMateriałyWydaneDoProdukcji + materiałyWydaneDoProdukcji;
        wartośćZużytychMateriałówWGStałychCenEwidencyjnych = wBilansowaMateriałów - materiałyWydaneDoProdukcji;
        wartośćZapasuMateriałówWGStałychCenEwidencyjnych = (wBilansowaMateriałów - odchylenia - kosztyZakupu) - materiałyWydaneDoProdukcji;
        wartośćZapasuMateriałówWGRzeczywistychCenNabycia = wartośćZapasuMateriałówWGRzeczywistychCenZakupu + (kosztyZakupu - odchyleniaZakupowePrzypadająceNaZużyteMateriały);
        wartośćZużytychMateriałówWGRzeczywistychCenNabycia = wartośćZużytychMateriałówWGRzeczywistychCenZakupu + (odchyleniaZakupowePrzypadająceNaZużyteMateriały);

        System.out.println(wartośćZużytychMateriałówWGRzeczywistychCenZakupu);
        System.out.println(wartośćZapasuMateriałówWGRzeczywistychCenZakupu);
        System.out.println(wartośćZużytychMateriałówWGStałychCenEwidencyjnych);
        System.out.println(wartośćZapasuMateriałówWGStałychCenEwidencyjnych);
        System.out.println(wartośćZapasuMateriałówWGRzeczywistychCenNabycia);
        System.out.println(wartośćZużytychMateriałówWGRzeczywistychCenNabycia);
    }
}