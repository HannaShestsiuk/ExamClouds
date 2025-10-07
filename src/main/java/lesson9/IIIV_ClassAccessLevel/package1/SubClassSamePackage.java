package lesson9.IIIV_ClassAccessLevel.package1;

public class SubClassSamePackage extends SuperClass {
    public void test() {
        // privateVar -> private access in SuperClass
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
