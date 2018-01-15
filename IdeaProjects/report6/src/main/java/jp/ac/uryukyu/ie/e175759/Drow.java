package jp.ac.uryukyu.ie.e175759;
/*ここは最初にカードを引くときに使うメソッゾである。正直入らないような気がする。
  メソッドも一個しか準備していないので全然ダメだった。
*/
public class Drow {
    public int card;
    public int playerScore ;


    public void Card(){
        this.card =(int)(Math.random()*11) + 1;



    }

}
