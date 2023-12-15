import java.util.Scanner;
public class Player {
    Scanner scan = new Scanner(System.in);
    //attributes
    int numPlayers;
    int x = 0; //horizontal position north west
    int y = 0; //vertical position up down
    int z = 0; //horizontal position east west
    int direction; //1=N, 2=S, 3=up, 4=down, 5=east, 6=west
    int hp;
    String name = "Default"; //name of player in game

    public Player(){

    }

    public Player(String name, int x, int y, int z){

    }

    public Player(String name, int x, int y, int z, int hp, int direction){

    }

    public int getNumPlayers(){
        return numPlayers;
    }

    public String getName(){
        return name;
    }

    public int x(){
        return x;
    }

    public int y(){
        return y;
    }

    public int z(){
        return z;
    }

    public int getHp(){
        return hp = InputHelper.getRangedInt(scan, "Enter a hp value between 0 and 100", 0, 0);
    }

    public int getDirection(){
        return direction = InputHelper.getInt(scan, "Enter a direction (1=N, 2=S, 3=up, 4=down, 5=east, 6=west)");
    }

    public String toString(){
        System.out.printf("%-13s%7s", "Name:", name);
        System.out.printf("\n%-13s%7d", "Health: ", hp);
        System.out.printf("\n%-13s%7d", "Coordinates: ", x, y, z);
        System.out.printf("\n%-13s%7d", "Direction: ", direction);

    }

    public void setHp(int hp){


    }

    public void setDirection(int direction){

    }

}
