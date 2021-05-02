package Zuoye5602;
//6-2 使用继承，实现“剪刀石头布的游戏”
import java.util.*;
class Player{
    String name;
    Player(String name){
        this.name = name;
    }
    int show() {  //出拳方法
        int show = ( int ) (Math.random() * 10 ) %3  +1;
        return show ;
    }
}
/* 请在这里填写答案 */
class PersonPlayer extends Player{
    PersonPlayer(String name) {
        super(name);
    }
    int choice(){
        Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        return c;
    }
}

class ComputerPlayer extends Player{

    ComputerPlayer(String name) {
        super(name);
    }
}

class Game {
    public ComputerPlayer cp;
    public PersonPlayer pp;

    public Game(ComputerPlayer cp, PersonPlayer pp) {
        this.cp = cp;
        this.pp = pp;
    }

    void start() {
        int c = cp.show(), p = pp.choice();
        if (c == p)
            System.out.print("A Draw.");
        else if (c == 1 && p == 3)
            System.out.print("Winner is computerPlayer.");
        else if (p == 1 && c == 3)
            System.out.print("Winner is personPlayer.");
        else if (p < c)
            System.out.print("Winner is computerPlayer.");
        else System.out.print("Winner is personPlayer.");
    }
}
    public class Main {

        public static void main(String[] args) {
            ComputerPlayer c = new ComputerPlayer ("computer");
            PersonPlayer  p = new PersonPlayer("player ") ;
            Game g = new Game( c ,p );
            g.start();
        }
    }