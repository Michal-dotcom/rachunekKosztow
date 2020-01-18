package RachunekKosztów.odchyleniaOdCenEwidencyjnychMateriałów;

public abstract class Obliczenia extends ZmienneDoObliczeń {

    public double obliczanie() {
        double wskaźnikNarzutuOdchyleń = odchylenia / (wartośćMateriałówWCenachEwidencyjnych);
        System.out.println("Wskaźnik narzutu odchyleń wynosi: " + wskaźnikNarzutuOdchyleń);
        double wartośćOdchyleńPrzypadającaNaMateriałyWydaneDoProdukcji = wskaźnikNarzutuOdchyleń * materiałyWydaneDoProdukcji;
        System.out.println("Wartość odchyleń przypadająca na materiały wydane do produkcji wynosi: " + wartośćOdchyleńPrzypadającaNaMateriałyWydaneDoProdukcji);
        double wNKZr = kosztyZakupu / (wBilansowaMateriałów - kosztyZakupu - odchylenia);
        System.out.println("Wskaźnik narzutu zakupów wynosi: " + wNKZr);

        double odchyleniaZakupowePrzypadająceNaZużyteMateriały = wNKZr * materiałyWydaneDoProdukcji;
        System.out.println("Odchylenia zakupowe przypadające na zużyte materiały wyniosły: " + odchyleniaZakupowePrzypadająceNaZużyteMateriały);
        System.out.println();

        // OSTATECZNA WARTOŚĆ KATEGORII WYNIKOWYCH
        wartośćZapasuMateriałówWGRzeczywistychCenZakupu = (wBilansowaMateriałów - odchylenia - kosztyZakupu - materiałyWydaneDoProdukcji) * (1 + wskaźnikNarzutuOdchyleń);
        wartośćZużytychMateriałówWGRzeczywistychCenZakupu = wartośćOdchyleńPrzypadającaNaMateriałyWydaneDoProdukcji + materiałyWydaneDoProdukcji;
        wartośćZużytychMateriałówWGStałychCenEwidencyjnych = wBilansowaMateriałów - materiałyWydaneDoProdukcji;
        wartośćZapasuMateriałówWGStałychCenEwidencyjnych = (wBilansowaMateriałów - odchylenia - kosztyZakupu) - materiałyWydaneDoProdukcji;
        wartośćZapasuMateriałówWGRzeczywistychCenNabycia = wartośćZapasuMateriałówWGRzeczywistychCenZakupu + (kosztyZakupu - odchyleniaZakupowePrzypadająceNaZużyteMateriały);
        wartośćZużytychMateriałówWGRzeczywistychCenNabycia = wartośćZużytychMateriałówWGRzeczywistychCenZakupu + (odchyleniaZakupowePrzypadająceNaZużyteMateriały);

        return wartośćZapasuMateriałówWGRzeczywistychCenZakupu;
      /*  return wartośćZużytychMateriałówWGRzeczywistychCenZakupu;
        return wartośćZużytychMateriałówWGStałychCenEwidencyjnych;
        return wartośćZapasuMateriałówWGStałychCenEwidencyjnych;
        return wartośćZapasuMateriałówWGRzeczywistychCenNabycia;
        return wartośćZużytychMateriałówWGRzeczywistychCenNabycia; */
    }
    public static void main(String[] args) {

    }
}