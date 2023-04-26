package SealedClasses;

public class exampleOfSealedClass {
    sealed class A permits B,C{

    }

    final class B extends A{

    }

    final class C extends A{

    }
}
