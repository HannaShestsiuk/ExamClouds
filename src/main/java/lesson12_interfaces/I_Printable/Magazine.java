package lesson12_interfaces.I_Printable;

public class Magazine implements Printable{
    String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getMagazineName() {
        return magazineName;
    }

    @Override
    public void print() {
        System.out.println(magazineName);
    }

    //static method to return magazines' name
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                ((Magazine) item).print();
            }
        }
    }
}
