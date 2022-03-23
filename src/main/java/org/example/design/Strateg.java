package org.example.design;

/**
 * @author game-netease
 * @date 2022/3/23
 */
interface Strategy{
    void show();
}
class  A implements  Strategy{

    @Override
    public void show() {
        System.out.println("A is called");
    }
}
class  B implements  Strategy{

    @Override
    public void show() {
        System.out.println("B is called");
    }
}
class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //展示促销活动
    public void contextShow() {
        strategy.show();
    }
}
public class Strateg {

    public static void main(String[] args) {
        Context strategy=new Context(new A());
        strategy.contextShow();

        strategy.setStrategy(new B());
        strategy.contextShow();



    }
}
