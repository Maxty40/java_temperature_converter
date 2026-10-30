package suhu;

public class ReamurCelcius implements KonverterSatuan {
    // Variable Field
    String asal, tujuan;

    // Constructor
    public ReamurCelcius() {
        this.asal = "Reamur";
        this.tujuan = "Celcius";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    // Reamur to Celcius Formula
    public float konversi(float in) {
        return 5f / 4 * in;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new ReamurCelcius();
        float temp = 100;
        System.out.println("Titik didih air " + temp + " " + k1.satuanInput() + " setara dengan " + k1.konversi(temp)
                + " " + k1.satuanOutput());
    }
}
