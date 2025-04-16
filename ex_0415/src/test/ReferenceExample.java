package test;

class Box {
    int value;
}

public class ReferenceExample {
	public static void change(Box b) {
        b.value = 100;
        b = new Box();
        b.value = 200;
    }

    public static void main(String[] args) {
        Box a = new Box();
        a.value = 10;

        change(a);

        System.out.println(a.value);
    }
}
