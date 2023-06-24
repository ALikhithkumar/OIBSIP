import java.util.*;
public class NumberGuessing
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int rand=random.nextInt(101);
		int attempts=0;
		while(true){
		    System.out.println("Enter the number");
		    int usernum=sc.nextInt();
		    if(attempts>=10){
		        System.out.println("You are disqualified");
		        break;
		    }
		    if(usernum==rand){
		        System.out.println("The number you guessed is true");
		        System.out.println("The number of attempts you took : "+" "+attempts);
		        break;
		    }
		    else if(usernum<rand){
		        System.out.println("The number you guessed is low increase the number");
		        attempts++;
		    }
		    else{
		        System.out.println("The number you guessed is high decrease the number");
		        attempts++;
		    }
		}
	}
}