package Introduction.Encapsulation.DifferentPackageNonSubclass.Package2;

import Introduction.Encapsulation.DifferentPackageNonSubclass.Package1.A;

public class B {
    void display() {
        A a = new A();

        /*
        System.out.println("defaultA: " + a.defaultA);
        System.out.println("privateB: " + a.privateB);
        System.out.println("protectedC: " + a.protectedC);

        'default', 'private', and 'protected' access specifier restricts the
        visibility of the member
         */
        System.out.println("publicD: " + a.publicD);
    }
}