package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havucDilim", "buryan", "buryan", "yaglama", "kokarec", "arabAşi", "güvec", "trileçe", "trileçe", "trileçe" ));
        System.out.println("\n--------******---------");
        alfabetikbuyukHarf(menu);
        System.out.println("\n--------******---------");
        carTersSiraliYazdir(menu);
        System.out.println("\n--------******---------");
        charKucuktenBuyuge(menu);
        System.out.println("\n--------******---------");
        sonHarfeGoreTersSirala(menu);
        System.out.println("\n--------******---------");
        charKeresiCiftElSirala(menu);
        System.out.println("\n--------******---------");
        yediVe7DenAz(menu);
        System.out.println("\n--------******---------");
        wIleBaslayan(menu);
        System.out.println("\n--------******---------");
        xIleBitenEnAZ1(menu);
        System.out.println("\n--------******---------");
        charSayisiEnBuyukELYaz(menu);
        System.out.println("\n--------******---------");
        iklElemanHaricKalaniYazdir(menu);
        System.out.println("\n--------******---------");

        System.out.println("\n--------******---------");

        System.out.println("\n--------******---------");
    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikbuyukHarf(List<String> menu) {
        menu.stream().map(t -> t.toUpperCase()).sorted().distinct().forEach(t -> System.out.print(t + " "));

        // menu.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t+" "));


    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void carTersSiraliYazdir(List<String> menu) {
        menu.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::yazdir);

    }
    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..


    public static void charKucuktenBuyuge(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(t -> System.out.print(t + " "));

    }
    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.

    public static void sonHarfeGoreTersSirala(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed())
                .forEach(t -> System.out.print(t + " "));

    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    public static void charKeresiCiftElSirala(List<String> menu) {

        menu.
                stream().
                map(t -> t.length() * t.length()).
                filter(Lambda01::ciftBul).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(Lambda01::yazdir);
    }
    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public  static void yediVe7DenAz(List<String> menu){
        System.out.println(menu.stream().allMatch(t -> t.length() <= 7) ? "7'den daha az " : "7 ve daha fazla");
        boolean chek=menu.stream().allMatch(t -> t.length() <= 7);
        if(chek){
            System.out.println("\"7'den daha az \"");
        }else System.out.println("7 ve daha fazla");

        System.out.println(chek);


    }
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void wIleBaslayan(List<String> menu){
        System.out.println(menu.stream().allMatch(t -> t.startsWith("w")) ? "w ile baslayan yok" : "w ile baslayan var");

    }
    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIleBitenEnAZ1(List<String> menu){
        System.out.println(menu.stream().anyMatch(t -> t.endsWith("x")) ? "var" : "yok");

    }
    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void charSayisiEnBuyukELYaz(List<String> menu){
        Stream<String> isim =menu.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                //findFirst());
                        limit(1);
        System.out.println(Arrays.toString(isim.toArray()));

    }
    // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
public static void iklElemanHaricKalaniYazdir(List<String> menu){

    menu.
            stream().
            sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1))).
            skip(1).
            forEach(t -> System.out.print(t + " "));

}



}

