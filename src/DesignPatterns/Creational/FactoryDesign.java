package DesignPatterns.Creational;

public class FactoryDesign {
    public static void main(String[] args) {
        String type = "com";
        Plan plan;
        if(type.equalsIgnoreCase("com")){
            plan = new Commercial();
        }
        else plan = new HomePlan();
        plan.setRate();
        plan.caclulateBill(10);
    }
}

abstract class Plan{
    protected double rate;
    abstract void setRate();
    public void caclulateBill(int units) {
        System.out.println(rate*units);
    }
    public void message(){
        System.out.println("HELLO I AM PARENT");
    }
}

class HomePlan extends Plan{
    @Override
    void setRate() {
        this.rate = 3;

    }
}

class Commercial extends Plan{
    @Override
    void setRate() {
        this.rate = 4.5;
        this.message();
        super.message();
    }
    @Override
    public void message(){
        System.out.println("HELLO I AM CHILD");
    }
}
