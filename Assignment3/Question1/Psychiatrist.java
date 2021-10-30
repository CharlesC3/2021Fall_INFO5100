package Question1;

public class Psychiatrist {
    public void examine(Moody moody){
        System.out.println("How are you feeling today");
        moody.getMood();
    }

    public void observe(Moody moody){
        moody.ExpressFeelings();
        System.out.println("Observation:" + moody.toString());
    }

    public String toString(){
        return null;
    }
    public String getMood(){
        return null;
    }

    public void ExpressFeeling(){}
}
