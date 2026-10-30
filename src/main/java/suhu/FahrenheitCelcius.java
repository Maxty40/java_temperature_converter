package suhu;

public class FahrenheitCelcius implements KonverterSatuan {
    // Variable Field
    String asal, tujuan;

    // Constructor
    public FahrenheitCelcius() {
        this.asal = "Fahrenheit";
        this.tujuan = "Celcius";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    // Fahrenheit to Celcius Formula
    public float konversi(float in) {
        return 5f * (in - 32) / 9;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new FahrenheitCelcius();
        float temp = 100;
        System.out.println("Titik didih air " + temp + " " + k1.satuanInput() + " setara dengan " + k1.konversi(temp)
                + " " + k1.satuanOutput());
    }
}
