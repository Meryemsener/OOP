package nisan15Encapsulation;

public class E01 {
    /*1-encapsulation data saklamak demektir. "data hiding"

       2-Bizden izinsiz kimse degistiremesin, kimse
        goremesin diye bu islem yapilir
        3-Encapsulation yapmak icin variable'lari  private yapariz
        4-Bu kapsullemeyi okumak ve degistirmek icin acabiliriz.
        */
    private int sifre=1234;//basina private yazarak kapsulledik
    private String isim="Meryem";
    private char cinsiyet= 'K';
    public static void main(String[] args) {

    }
    //encapsulation yaptiginiz variable'in baska class'lardan okunabilmesi
    //isterseniz getter methodu olusturmaniz gerekir. Getter methodin acces modifier'i
    // kesinlikle public olur,
    //retur type konur.variable ne ise return type de o olur.Bu kisim okumak icin olusturulur
    //degistirmek icin de setter olusturulur
    public int getSifre(){//artik sifremi herkes gorebilir
        return sifre;
    }
    //setter olusturulurken return type'i void olur.Voidlerde return olmaz
    //parantez icine de degistirmek istedigimiz variable i data turu ile birlikte yazilir
    public void setSifre(int sifre){
        this.sifre=sifre;//parantezsinz bu classtaki

    }
    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim=isim;

    }
    public char getCinsiyet(){
        return cinsiyet;
    }

}
