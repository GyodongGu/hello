package hello;

public class Exersice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=1;
		while(y<=6) {
			int x = (int) (Math.random()*10%6)+1;
			
			if(x+y != 5) {
				continue;
			}
			else
				System.out.println("("+x+","+ y +")" );
			y++;
		}
	}
}
