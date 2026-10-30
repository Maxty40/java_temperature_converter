package suhu;

public class CelciusReamur implements KonverterSatuan {
    // Variable Field
    String asal, tujuan;

    // Constructor
    public CelciusReamur() {
        this.asal = "Celcius";
        this.tujuan = "Reamur";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    // Celcius to Reamur Formula
    public float konversi(float in) {
        return 4f / 5 * in;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new CelciusReamur();
        float temp = 100;
        System.out.println("Titik didih air " + temp + " " + k1.satuanInput() + " setara dengan " + k1.konversi(temp)
                + " " + k1.satuanOutput());
    }
}
