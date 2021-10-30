package Question1;

public class Happy extends Moody {

    public Happy(){}

    @Override
    public String getMood(){
        return "happy";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah…HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
