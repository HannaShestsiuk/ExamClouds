package accessModifiers;

public class XII_OrderHelperTestAccess {
    public static void main(String[] args) {
        XII_OrderHelper helper = new XII_OrderHelper();
        // printOrderId() has default access 'package-private'
        helper.printOrderId(); // accessed because in the same package
    }
}
