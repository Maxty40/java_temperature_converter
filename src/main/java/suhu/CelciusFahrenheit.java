package suhu;

public class CelciusFahrenheit implements KonverterSatuan {
    // Variable Field
    String asal, tujuan;

    // Constructor
    public CelciusFahrenheit() {
        this.asal = "Celcius";
        this.tujuan = "Fahrenheit";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    // Celcius to Fahrenheit Formula
    public float konversi(float in) {
        return 9f / 5 * in + 32;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new CelciusFahrenheit();
        float temp = 100;
        System.out.println("Titik didih air " + temp + " " + k1.satuanInput() + " setara dengan " + k1.konversi(temp)
                + " " + k1.satuanOutput());
    }
}
