package Adapter;

public class Guards extends AbstractPlayer {

    public Guards(String name) {
        super(name);
    }


    @Override
    public void attack() {
        System.out.println("后卫 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫 " + name + " 防守");
    }
}
