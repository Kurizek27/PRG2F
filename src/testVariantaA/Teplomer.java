package testVariantaA;

public class Teplomer {
    private String umisteni;
    private double teplota;
    private boolean vCelzii;

    public void printInfo() {
        if (vCelzii == true) {
            System.out.println(umisteni + " - " + teplota + " °C");
        } else {
            System.out.println(umisteni + " - " + teplota + " °F");
        }
    }

    public double getTeplota() {
        return teplota;
    }

    public void setTeplota(double teplota) {
        this.teplota = teplota;
    }

    public String getUmisteni() {
        return umisteni;
    }

    public boolean isvCelzii() {
        return vCelzii;
    }
    
    public Teplomer(String umisteni, double teplota, boolean vCelzii) {
        this.umisteni = umisteni;
        this.teplota = teplota;
        this.vCelzii = vCelzii;
    }
    public Teplomer(String umisteni, double teplota) {
        vCelzii = true;
        this.umisteni = umisteni;
        this.teplota = teplota;
    }
}
