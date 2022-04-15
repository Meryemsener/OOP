package nisan15Encapsulation;

public class E02 {
    public static void main(String[] args) {
        E01 obj = new E01();
        System.out.println(obj.getSifre());//sifreyi goremedigimiz halde getSifre ile gorunur hale return ettik
        System.out.println(obj.getIsim());
        System.out.println(obj.getCinsiyet());
        //setterdan sonra
        obj.setSifre(98764);
        System.out.println(obj.getSifre());//yeni sifre 98764
        obj.setIsim("Maria Magdalena");
        System.out.println(obj.getIsim());

        E03 ob=new E03();
        System.out.println(ob.getIsim());
        System.out.println(ob.getYas());
        System.out.println(ob.getBorc());
        //setter yapilan bir veri varsa o yine update edilebilir, sayet getter i olmasa da
        //okuyamiyor olmamiz degistirilemeyecegi anlamnina gelmez

    }
}
