package lesson9.IIIV_ClassAccessLevel.package2;

import lesson9.IIIV_ClassAccessLevel.package1.SuperClass;

public class OtherPackageClass {
    public void test() {
        SuperClass s = new SuperClass();
        // privateVar -> private access in SuperClass
        // defaultVar -> visible within the same package only
        // protectedVar -> not inherited and outside package
        System.out.println(s.publicVar);
    }
}
