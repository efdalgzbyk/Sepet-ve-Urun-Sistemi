import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<SepetUrun> sepet = new ArrayList<>();

        SepetUrun s1 = new SepetUrun(1,"test1",200,5);
        sepet.add(s1);

        for(SepetUrun s : sepet){
            s.bilgiYazdir();
        }
    }
}