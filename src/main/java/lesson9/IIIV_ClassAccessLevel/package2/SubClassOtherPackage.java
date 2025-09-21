package lesson9.IIIV_ClassAccessLevel.package2;

import lesson9.IIIV_ClassAccessLevel.package1.SuperClass;

public class SubClassOtherPackage extends SuperClass{
    public void test() {
        // privateVar -> private access in SuperClass
        // defaultVar -> visible within the same package only
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
