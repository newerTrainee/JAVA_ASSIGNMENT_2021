interface Furniture {
    public void stressTest();
    public void fireTest();
}

abstract class Chair implements Furniture {
    public abstract void chairType();

}
abstract class Table implements Furniture {
    public abstract void tableType();
}

class MetalChair extends Chair {
    public void stressTest() {
        System.out.println("Passed Stress Test");
        System.out.println("\n-------------------------------\n");
    }

    public void fireTest() {
        System.out.println("Passed Fire Test");
    }
    public void chairType() {
        System.out.println("This is a Metal Chair");
    }
}

class MetalTable extends Table {
    public void stressTest() {

        System.out.println("Passed Stress Test");
        System.out.println("\n-------------------------------\n");
    }

    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    public void tableType() {
        System.out.println("This is a metal Table");

    }
}


class WoodenTable extends Table {
    public void stressTest() {
        System.out.println("Passed Stress Test");
        System.out.println("\n-------------------------------\n");
    }
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }
    public void tableType() {
        System.out.println("This is a wooden Table");
    }
}


class WoodenChair extends Chair {
    public void stressTest() {
        System.out.println("Failed Stress Test");
        System.out.println("\n------------------------------\n");
    }
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }
    public void chairType() {
        System.out.println("This is a wooden table");
    }

}
public class Q9 {
    public static void main(String[] args){
        MetalChair obj1 = new MetalChair();
        MetalTable obj2 = new MetalTable();
        WoodenTable obj3 = new WoodenTable();
        WoodenChair obj4 = new WoodenChair();
        obj1.chairType();
        obj1.fireTest();
        obj1.stressTest();
        obj2.tableType();
        obj2.fireTest();
        obj2.stressTest();
        obj3.tableType();
        obj3.fireTest();
        obj3.stressTest();
        obj4.chairType();
        obj4.fireTest();
        obj4.stressTest();
    }
}
