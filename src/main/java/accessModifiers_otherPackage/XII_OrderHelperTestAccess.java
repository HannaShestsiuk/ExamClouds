package accessModifiers_otherPackage;

import accessModifiers.XII_OrderHelper;

public class XII_OrderHelperTestAccess {
    public static void main(String[] args) {
        XII_OrderHelper helper = new XII_OrderHelper();
        //helper.printOrderId(); //Compilation error!
        // printOrderId() is 'package-private' and located in other package
    }
}
