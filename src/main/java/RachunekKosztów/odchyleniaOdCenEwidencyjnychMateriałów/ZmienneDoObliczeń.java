package RachunekKosztów.odchyleniaOdCenEwidencyjnychMateriałów;

public class ZmienneDoObliczeń{
    //ZMIENNE DO OBLICZEŃ
    public double wBilansowaMateriałów = 10000; //składa się na nią odchylenia(1800) + koszty zakupu(1200) + 7000(w mat. w stałych cenach ewidencyjnych) To co zostalo (5000) to trzecia kat. wynikowa
    public double odchylenia = 1800;   //odchylenia DT - czyli dodajemy je, jeśli były by CT to odejmujemy od kategorii wynikowych
    public double kosztyZakupu = 1200;
    public double materiałyWydaneDoProdukcji = 5000;
    public double wartośćMateriałówWCenachEwidencyjnych = wBilansowaMateriałów - odchylenia - kosztyZakupu;

    //KATEGORIE WYNIKOWE
    double wartośćZapasuMateriałówWGRzeczywistychCenZakupu;
    double wartośćZużytychMateriałówWGRzeczywistychCenZakupu;
    double wartośćZużytychMateriałówWGStałychCenEwidencyjnych;
    double wartośćZapasuMateriałówWGStałychCenEwidencyjnych;
    double wartośćZapasuMateriałówWGRzeczywistychCenNabycia;
    double wartośćZużytychMateriałówWGRzeczywistychCenNabycia;

}
