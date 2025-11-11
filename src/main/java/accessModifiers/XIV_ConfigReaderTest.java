package accessModifiers;

public class XIV_ConfigReaderTest {
    public static void main(String[] args) {
        System.out.println(XIV_ConfigReader.read("username"));

        // Compilation error: XIV_ConfigReader() has private access in accessModifiers.XIV_ConfigReader
        //      private XIV_ConfigReader() is NOT accessed outside the declared class
        //XIV_ConfigReader reader = new XIV_ConfigReader();
    }
}
