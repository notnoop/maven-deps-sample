package com.bar;

import com.foo.Foo;

public class Bar {

    public Bar() {
    }

    public String geValue() {
        Foo foo = new Foo();
        return foo.getName("john", "smith");
    }
}
