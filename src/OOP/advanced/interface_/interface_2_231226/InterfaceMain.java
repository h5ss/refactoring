package OOP.advanced.interface_.interface_2_231226;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;
        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();

        interfaceB.methodB();

        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
