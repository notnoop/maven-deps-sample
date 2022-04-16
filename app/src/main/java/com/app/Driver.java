package com.app;

import com.foo.Foo;
import com.bar.Bar;

public class Driver {

    public static void main(String... args) {
        Bar b = new Bar();
        System.out.println(b.geValue());

        Foo foo = new Foo();
        System.out.println(foo.getName("john", "adam", "smith"));
    }
}
