package ch05.triple;

class Main {
    public static void main(String[] args) {
        Triple instance1 = Triple.getInstance();
        Triple instance2 = Triple.getInstance();
        Triple instance3 = Triple.getInstance();
        Triple instance4 = Triple.getInstance();
        Triple instance5 = Triple.getInstance();
        Triple instance6 = Triple.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
        System.out.println(instance5);
        System.out.println(instance6);
    }
}
