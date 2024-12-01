
interface Chair {
    void sitOn();
    int add(int a, int b);  
}


interface Sofa {
    void lieOn();
    int add(int a, int b);  
}


class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair.");
    }

    @Override
    public int add(int a, int b) {
        System.out.println("VictorianChair add operation:");
        return a + b;
    }
}


class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair.");
    }

    @Override
    public int add(int a, int b) {
        System.out.println("ModernChair add operation:");
        return a + b;
        
    }
}


class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian Sofa.");
    }

    @Override
    public int add(int a, int b) {
        System.out.println("VictorianSofa add operation:");
        return a - b;
    }
}


class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa.");
    }

    @Override
    public int add(int a, int b) {
        System.out.println("ModernSofa add operation:");
        return a - b;
    }
}


interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}


class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}


class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}


class Client {
    private Chair chair;
    private Sofa sofa;

    public Client(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
    }

    public void sitAndLie() {
        chair.sitOn();
        sofa.lieOn();
    }

    public void performAddOperation(int a, int b) {
        System.out.println(" using Chair's add method: " + chair.add(a, b));
        System.out.println(" using Sofa's add method: " + sofa.add(a, b));
    }

    public static void main(String[] args) {
        
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Client victorianClient = new Client(victorianFactory);
        victorianClient.sitAndLie();
        victorianClient.performAddOperation(5, 7);

        System.out.println();

        
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Client modernClient = new Client(modernFactory);
        modernClient.sitAndLie();
        modernClient.performAddOperation(12, 9);
    }
}
