package proxypattern;

// 追求者类
// 让追求者类去实现“送礼物”的接口
public class Pursuit implements GiveGift {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println("Hi，" + mm.getName() + "，送你个娃娃，请收下。");
    }

    @Override
    public void giveFlowers() {
        System.out.println("Hi，" + mm.getName() + "，送你束鲜花，请收下。");
    }

    @Override
    public void giveChocolate() {
        System.out.println("Hi，" + mm.getName() + "，送你盒巧克力，请收下。");
    }

}
