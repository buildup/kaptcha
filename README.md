kaptcha
=======

kaptcha is a simple captcha library.

This project is a fork of the kaptcha project hosted at https://code.google.com/p/kaptcha/ by Jon Scott Stevens.
Along with removing the dependency from servelet (a Play! Module will be made available soon), a Scala API is
also made available that simplifies the utilisation of the captcha.

In scala the generation of a captcha image is as simple as:

```scala
val captcha = Kaptcha.text()
val captchaImg = Kaptcha.image(captcha)
```



SBT Dependency
--------------

To use Kaptcha in a sbt based project use:

```sbt
resolvers += "nuvo.io maven repo" at "http://nuvo-io.github.com/mvn-repo/releases"
libraryDependencies += "io.nuvo.kaptcha" % "kaptcha_2.11" % "2.3.3"
```

Maven Dependency
----------------

To use Kaptcha in a mvn based project use:

```xml
<dependency>
    <groupId>io.nuvo</groupId>
    <artifactId>kaptcha_2.11</artifactId>
    <version>2.3.3</version>
</dependency>
```

