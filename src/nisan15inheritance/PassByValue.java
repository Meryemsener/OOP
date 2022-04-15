package nisan15inheritance;

public class PassByValue {
    public static void main(String[] args) {

        int gomlek = 100;
        indOgre(gomlek);//bunu gormek istiyorsak soutun icine bunu yaziyoruz
                System.out.println(indOgre(gomlek));//bunu 80 olarak yazdirir
                System.out.println(gomlek);//PassbyValue'dan dolayi burasi orijinal olan 100 olur

        System.out.println(indAsker(gomlek));
        System.out.println(yasliIndirimi(gomlek));
    }

    public static int indOgre(int gomlek) {
        return gomlek - 20;

    }

    public static int indAsker(int gomlek) {
        return gomlek - 5;

    }

    public static int yasliIndirimi(int gomlek) {
        return gomlek - 10;
    }
}