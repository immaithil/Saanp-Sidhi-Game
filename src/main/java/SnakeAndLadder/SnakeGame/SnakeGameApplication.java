package SnakeAndLadder.SnakeGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class SnakeGameApplication {
	final static int WinPoint = 100;

	static Map <Integer,Integer> saanp = new HashMap<>();
	static Map<Integer,Integer> sidhi= new HashMap<>();
	{
		saanp.put(99,64);
		saanp.put(96,84);
		saanp.put(91,34);
		saanp.put(84,73);
		saanp.put(62,42);
		saanp.put(46,36);
		saanp.put(34,10);
		saanp.put(22,15);

		sidhi.put(10,25);
		sidhi.put(18,37);
		sidhi.put(32,66);
		sidhi.put(56,88);
		sidhi.put(68,93);
		sidhi.put(77,88);
		sidhi.put(22,74);
	}
	public int throwDice(){
		int n=0;
		Random t= new Random();
		n= t.nextInt(7);
		return (n==0?1:n);
	}
	public int calculatePlayerPoint(int player, int diceCount){
		player= player+diceCount;
		if(player>WinPoint){
			player= player-diceCount;
			return player;
		}
		if(saanp.get(player)!=null){
			System.out.println("Saanp ne das liya");
			player= saanp.get(player);
		}
		if(sidhi.get(player)!=null){
			System.out.println("Sidhi chadh gye aap");
			player= sidhi.get(player);
		}
		return player;
	}

	public boolean isWon(int player){
		return WinPoint==player;
	}
	public void startGame(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Name of first player");
		String player1= scan.nextLine();
		System.out.println("Enter Name of second player");
		String player2=scan.nextLine();

		int playerOne= 0, playerTwo=0;
		int currentPlayer=-1;

		String str;
		int diceCount =0;
		do{
			System.out.println(currentPlayer==-1?"\n\n"+player1+" Turn":"\n\n Turn of "+player2);
			System.out.println("press t to throw dice");
			str= scan.next();
			diceCount=throwDice();

			if(currentPlayer == -1){
				playerOne= calculatePlayerPoint(playerOne,diceCount);
				System.out.println(player1+"::" +playerOne);
				System.out.println(player2+"::"+playerTwo);
				System.out.println("-**-**---**---**---**------**----");
				if(isWon(playerOne)){
					System.out.println(player1+"won the game !!! congo");
					return;
				}
			}
			else{
				playerTwo=calculatePlayerPoint(playerTwo,diceCount);
				System.out.println(player1+"::" +playerOne);
				System.out.println(player2+"::"+playerTwo);
				System.out.println("-**-**---**---**---**------**----");
				if(isWon(playerTwo)){
					System.out.println("Congo!!!"+player2+"won the game");
					return;
				}
			}
			currentPlayer=- currentPlayer;
		}while ("t".equals(str));
	}

	public static void main(String[] args) {
		SpringApplication.run(SnakeGameApplication.class, args);
	}

}
