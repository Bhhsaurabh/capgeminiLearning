package inheritance;

class Parent {
    protected int value = 100;
}

class Child extends Parent {
    void show() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}