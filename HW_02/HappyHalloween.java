public class HappyHalloween {
    public static void main(String[] args){
        BlackCat b1 = new BlackCat();
        BlackCat b2 = new BlackCat("b1", true);
        Witch w1 = new Witch("w1", "magicstuff", b2);
        Witch w2 = new Witch(w1);
        Ghost g1 = new Ghost("g1", "silverlake", 5, 8);
        Ghost g2 = new Ghost(7);
        w1.seekCandy((int) Math.random()*50);
        w2.seekCandy((int) Math.random()*50);
        g1.seekCandy((int) Math.random()*50);
        g2.seekCandy((int) Math.random()*50);

    }
}
