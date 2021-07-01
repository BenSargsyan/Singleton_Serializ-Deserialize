public class Main {
    public static void main(String[] args) {
        Computer instance=Computer.getINSTANCE();
        instance.from("Lenovo","b590",15);
        SingletonService.singletonSerialize(instance);
        System.out.println(instance.hashCode());
        Computer c=SingletonService.derserialize("file.txt");
        System.out.println(c.hashCode());
    }
}
