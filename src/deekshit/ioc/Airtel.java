package deekshit.ioc;

public class Airtel implements Sim {

    public Airtel(){
        System.out.println("airtel constuctor called");
    }

    @Override
    public void calling() {
        System.out.println("calling using airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using airtel sim");
    }
}
