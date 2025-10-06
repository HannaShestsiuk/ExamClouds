package lesson12_interfaces.III_Clothing;

public class Atelier {
    public static void dressMen(Clothing[] clothes) {
        for (Clothing item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void dressWomen(Clothing[] clothes) {
        for (Clothing item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWoman();
            }
        }
    }
}
