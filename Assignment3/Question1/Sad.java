package Question1;

public class Sad extends Moody{
    public Sad(){}

    @Override
    public String getMood(){
        return "sad";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    public String toString(){
        return "Subject cries a lot";
    }

    public void queryMood(){
        System.out.println("I feel sad today");
    }
}
