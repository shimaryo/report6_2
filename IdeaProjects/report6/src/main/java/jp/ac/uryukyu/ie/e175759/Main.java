package jp.ac.uryukyu.ie.e175759;
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {

        Drow your = new Drow();
        Drow dealer = new Drow();

        your.Card();
        dealer.Card();
        System.out.println("あなたの手札は" + your.card);
        System.out.println("ディーラーの手札は" + dealer.card + "?");
        your.playerScore = your.playerScore + your.card;
        dealer.playerScore = dealer.playerScore + dealer.card;

        //ここではカードを引いたり終了したりしている
        //これからはプレイヤーがさらに引いた時のfor文
        for (int i = 0; your.playerScore < 22; i++) {

            System.out.println("現在の合計は" + your.playerScore + "です。");
            System.out.println("もう一枚引くなら「hit」、引かないなら「stn」と入力してください");
            String input;
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            if (input.equals("hit") == true) {
                int card1 = (int) (Math.random() * 11) + 1;
                your.playerScore = your.playerScore + card1;

            }
            if (your.playerScore >= 22) {

                System.out.println("プレイヤーはバストしました");

                break;
            }
            //ここからはプレイヤーが引かないでディーラーが引く時

            if (input.equals("stn") == true) break;
        }
            for (int k = 0; dealer.playerScore < 17; k++) {
                int card2 = (int) (Math.random() * 11) + 1;
                dealer.playerScore = dealer.playerScore + card2;

                if (dealer.playerScore >= 22) {
                    System.out.println("ディーラーはバストしました");
                    break;
                }


            }

            //ここから下で勝敗をつけているできれば違うクラスを作って実装したかった。
            if(your.playerScore>=22){
                System.out.println("プレイヤーがバーストしたのでディーラーの勝ち");

            }
            if(dealer.playerScore>=22){
                System.out.println("ディーラーがバーストしたのでプレーヤーの勝ち");
            }
            if(21 - Math.abs(your.playerScore)>21 - Math.abs(dealer.playerScore)) {
                System.out.println("プレイヤーが" + your.playerScore + "," + "ディーラーが" + dealer.playerScore + "なのでディーラーの勝ち");
            }
            if(21- Math.abs(your.playerScore)==21-Math.abs(dealer.playerScore)){
            System.out.println("プレイヤーが" + your.playerScore + "," + "ディーラーが" + dealer.playerScore + "なのでドロー");
            }
        if(21-Math.abs(your.playerScore)<21-Math.abs(dealer.playerScore)) {
            System.out.println("プレイヤーが" + your.playerScore + "," + "ディーラーが" + dealer.playerScore + "なのでプレイヤーの勝ち");
        }
    }



    }






