package Introduction.Encapsulation.DifferentPackageSubclass.Package2;

import Introduction.Encapsulation.DifferentPackageSubclass.Package1.A;

public class B extends A {
    void display() {
        /*
        System.out.println("defaultA: " + defaultA);
        System.out.println("privateB: " + privateB);

        'private' and 'default' access specifier restricts the
        visibility of the member
         */
        System.out.println("protectedC: " + protectedC);
        System.out.println("publicD: " + publicD);
    }
}
