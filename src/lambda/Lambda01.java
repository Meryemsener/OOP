package lambda;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 11, 5, 7, 2, 9, 12, 6, 4, 1, 3));
        bosluksuzYazdir(sayi);
        System.out.println("\n--------******---------");
        ciftElemanlariBosluklu(sayi);
        System.out.println("\n--------******---------");
        ciftElemanlariBosluklu1(sayi);
        System.out.println("\n--------******---------");
        tekSayiYazdir(sayi);
        System.out.println("\n--------******---------");
        cift34tenKucuk(sayi);
        System.out.println("\n--------******---------");
        enBuyukEleman(sayi);
        System.out.println("\n--------******---------");
        tumElToplami(sayi);
        System.out.println("\n--------******---------");
        ciftLECarpimi(sayi);
        System.out.println("\n--------******---------");
        bestenBuyukEnKucuk(sayi);
        System.out.println("\n--------******---------");
        tekElKareBuyKucuge(sayi);


    }

    //structured programming  kullanarak list elemanlarinin aralarina bosluk koyarak yazdirin
    public static void bosluksuzYazdir(List<Integer> sayi) {
        for (Integer w : sayi) {
            System.out.print(w + " ");

        }
    }

    //"functional programming" kullanarak list elemanlarinin
    public static void funcBosluksuzYazdir(List<Integer> sayi) {
        sayi.stream().forEach(t -> System.out.println(t + " "));
        //sayi.stream().forEach(System.out::print);

    }

    public static void yazdir(int a) {
        System.out.print(a + " ");

    }

    public static void funcBosluksuzYazdir1(List<Integer> sayi) {
        sayi.stream().forEach(Lambda01::yazdir);

    }

    //structured programming ile list elemanlarinin cift olanlarini
    //ayni satirda aralarina bosluk birakarak prin et
    public static void ciftElemanlariBosluklu(List<Integer> sayi) {
        for (Integer w : sayi
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }

    public static void ciftElemanlariBosluklu1(List<Integer> sayi) {

        sayi.
                stream().
                filter(t -> t % 2 == 0).
                forEach(Lambda01::yazdir);


    }


    public static boolean ciftBul(int a) {
        return a % 2 == 0;

    }

    public static boolean tekBul(int a) {

        return a % 2 != 0;
    }

    //tek sayilari yazdir
    public static void tekSayiYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 != 0).forEach(Lambda01::yazdir);
        sayi.stream().filter(Lambda01::tekBul).forEach(Lambda01::yazdir);

    }

    //cift ve 34 'ten kucuk sayilari yazdirin
    public static void cift34tenKucuk(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                filter(t -> t < 34).
                forEach(Lambda01::yazdir);

        sayi.stream().filter(t -> t < 34 && t % 2 == 0).forEach(Lambda01::yazdir);

    }

    //34'Ten buyuk veya cift
    public static void tekveya34tenBuyuk(List<Integer> sayi) {
        sayi.stream().filter(t -> t > 34 || t % 2 != 0).forEach(Lambda01::yazdir);

    }

    /*
       cift elamanlarinin karelerini ayni satirda yazirin
       => bu task map ile cozulur.Collectionlardaki ile karistirma :)
        */
    public static void ciftlerinKareleri(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::yazdir);

    }

    /*
    tek elemanlarin kuplerine 1 arttir
     */
    public static void tekElKupleri(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::tekBul).map(t -> (t * t * t) + 1).forEach(Lambda01::yazdir);

    }

    /*
    cift elemanlarin karekoklerini ayni satirda aralarinda bosluk birakarak yazdir
     */
    public static void ciftELKarekok(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).map(Math::sqrt).forEach(t -> System.out.println((t + " ")));

    }

    /*
    listin en buyuk elemanini yazdir
     */
    public static void enBuyukEleman(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Math::max));
        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max);
        System.out.println(maxSayi);

    }

    /*
    listin en kucuk elemanini yazdir
     */
    public static void enKucukEleman(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Math::min));

    }

    /*
    Listin cift elemanlarinin karelerinin en buyugunu print ediniz
     */
    public static void ciftlerinKarelerininEnBuyugu(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).
                reduce(Integer::max));

    }

    /*
    Listteki tum elemanlarin toplamini yazdirin. Lambda expression ile yap
     */
    public static void tumElToplami(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                reduce(0, (a, b) -> a + b));

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftLECarpimi(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(Lambda01::ciftBul).reduce(Math::multiplyExact));
        System.out.println(sayi.stream().filter(Lambda01::ciftBul).reduce(1, (a, b) -> (a * b)));

    }
    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.

    public static void minBul(List<Integer> sayi) {
        //1. yontem Method Reference --> Integer class
        System.out.println(sayi.stream().reduce(Integer::min));
        Optional<Integer> minSayi = sayi.stream().reduce(Integer::min);
        System.out.println(minSayi);
        //2. yontem Method Reference --> Math class
        System.out.println(sayi.stream().reduce(Math::min));

        //3. yontem Lambda Expression
        System.out.println(sayi.
                stream().
                reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));
        //4. yontem Method Reference
        System.out.println(sayi.stream().reduce(Lambda01::enKucukBulma));


    }

    public static int enKucukBulma(int a, int b) {

        return a < b ? a : b;
    }
    // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.

    public static void bestenBuyukEnKucuk(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> t > 5).filter(Lambda01::tekBul).reduce(Lambda01::enKucukBulma));

    }

    // Task : List'teki 5'ten buyuk en kucuk cift sayiyi print ediniz.
    public static void bestenBuyukEnKucukCift(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 == 0).reduce(Lambda01::enKucukBulma));

    }

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftElemanlarininKareleri(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).map(t -> t * t).sorted().forEach(Lambda01::yazdir);

    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekElKareBuyKucuge(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::tekBul).
                map(t -> t * t).
                sorted(Comparator.reverseOrder()).
                    forEach(Lambda01::yazdir);

    }

}




