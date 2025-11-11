package lesson24_serialization;

public class I_Horse extends I_Animal{
    public I_Horse(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "This is a horse " + name;
    }
}
