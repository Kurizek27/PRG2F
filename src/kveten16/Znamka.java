package kveten16;

public class Znamka {
    int hodnota;

    String nazevPredmetu;

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        if(hodnota >= 1 && hodnota <=5){
            this.hodnota = hodnota;
        }
    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

    public void setNazevPredmetu(String nazevPredmetu) {
        this.nazevPredmetu = nazevPredmetu;
    }

    public Znamka(String nazevPredmetu) {
        this.nazevPredmetu = nazevPredmetu;
    }
}
