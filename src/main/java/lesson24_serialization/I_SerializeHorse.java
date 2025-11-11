package lesson24_serialization;

import java.io.*;

public class I_SerializeHorse {
    private static final String FILE_NAME = "Horce.ser";

    public static void main(String[] args) {
        serialize();
        I_Horse horse = deserialize();
    }

    private static I_Horse deserialize(){
        I_Horse horse = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (I_Horse) ois.readObject();
            System.out.println("Horse deserialized from " + FILE_NAME);
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return horse;
    }

    private static void serialize(){
        I_Horse horse = new I_Horse("Daisy");
        try(FileOutputStream fs = new FileOutputStream(FILE_NAME);
                ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
            System.out.println("Horse serialized to " + FILE_NAME);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
