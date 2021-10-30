package Question1;

public class Main {
    public static void main(String[] args){
        Psychiatrist psychiatrist = new Psychiatrist();

        Moody happy = new Happy();
        Moody sad = new Sad();

        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
        psychiatrist.examine(sad);
        psychiatrist.observe(sad);
    }
}
