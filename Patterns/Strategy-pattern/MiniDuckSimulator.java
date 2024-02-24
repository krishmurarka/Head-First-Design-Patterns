public class MiniDuckSimulator extends Duck {

    public MiniDuckSimulator(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyWithWings();
    }
    public void performSwim(){
        System.out.println("Swimming");
    }

    public static void main(String[] args){
        MiniDuckSimulator miniDuck = new MiniDuckSimulator();
        miniDuck.performFly();
        miniDuck.performQuack();
        miniDuck.performSwim();
    }
}