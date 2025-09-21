package lesson9.IIIV_ClassAccessLevel.package1;

public class SamePackageClass {
    public void test() {
        SuperClass s = new SuperClass();
        //s.privateVar -> private access in SuperClass
        System.out.println(s.defaultVar);
        // s.protectedVar -> protected, not inherited
        System.out.println(s.publicVar);
    }
}
