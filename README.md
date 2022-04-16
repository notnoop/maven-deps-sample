Test repo to domenstrate Maven dependencies resolution.

run `./build.sh` and watch it fail in runtime with NoSuchMethodError

```
java.lang.NoSuchMethodError: 'java.lang.String com.foo.Foo.getName(java.lang.String, java.lang.String)'
    at com.bar.Bar.geValue (Bar.java:12)
    at com.app.Driver.main (Driver.java:10)
    at org.codehaus.mojo.exec.ExecJavaMojo$1.run (ExecJavaMojo.java:254)
    at java.lang.Thread.run (Thread.java:833)
```

Then swap order of dependencies and `app/pom.xml` and rebuild
