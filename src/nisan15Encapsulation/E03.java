package nisan15Encapsulation;

public class E03 {
    private byte yas =23;
    private float borc=6500.0f;
    private String isim="Kemal Dogru";
    private boolean zengin=true;

    public boolean isZengin() {//boolean icin getter olusturulurken method adi is ile baslar
        return zengin;
    }

    public void setZengin(boolean zengin) {
        this.zengin = zengin;
    }

    public byte getYas() {
        return yas;
    }

    public void setYas(byte yas) {
        this.yas = yas;
    }

    public float getBorc() {
        return borc;
    }

    public void setBorc(float borc) {
        this.borc = borc;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public static void main(String[] args) {

    }
}
