import java.util.Scanner;

public class coordinate {

	
	public static void main(String[] args) {
	
		treasurehunt();
	}
		
		public static void treasurehunt() {
		
			System.out.println("start your search! \t choose 1[north], 2[west], 3[east], 4[south]");
		
			
	    boolean play = true;
		boolean gameover = false;
		while(play) {
		System.out.println();
		
		
		Scanner gamer = new Scanner(System.in);
		int move = gamer.nextInt();
		System.out.println( );
		
		
		switch (move) {
		
		case 1:
				
			System.out.println("player A you have just begun your quest and heading NORTH so please forge on!");
	
		break;
		
		case 2:
	
	    	System.out.println("player A you are going the wrong way which is WEST please try heading EAST! ");
	    	
	    break;
	    
		case 3:
			
			System.out.println("player A you are EAST of the map but still in the wrong direction!");
			
	    break;

		case 4:
			
			System.out.println("player A congratulations!!! you are in the dirty SOUTH you found your treasure!");
			
		break;
		
			
		default:
			
			System.out.println("player A please refer to your compass for correct navigation!");
		
		}
			
			
		}
		}
	   
}
	
		
		
		
        
		

	
