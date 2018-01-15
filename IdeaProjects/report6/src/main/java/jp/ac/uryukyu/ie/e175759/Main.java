package jp.ac.uryukyu.ie.e175759;

//
public class Main {
    public static void main(String[] args) {
        Player your = new Player();
        Player dealer = new Player();


        your.Card();
        dealer.Card();
        System.out.println("あなたの手札は" + your.card);
        System.out.println("ディーラーの手札は" + dealer.card);
    }
}
