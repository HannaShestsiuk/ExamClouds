package lesson24_serialization;

import java.io.Serializable;

public class I_Animal implements Serializable {
    String name;

    public I_Animal(String name){
        this.name = name;
    }
}
