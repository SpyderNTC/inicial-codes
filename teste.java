/**
 * Do not change the first two 
 * lines of this program. They
 * are used to declare the Main
 * class and the main method. 
 */

public class Main {

	public static void main(String[] args) {
		int goalsHomeBarc = 2;
		int goalsAwayBarc = 1;
		int goalsHomeMad = 2;
		int goalsAwayMad = 1;
		int totalGoalsMad = goalsHomeMad + goalsAwayMad;
		int totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;
		int penaltBarc = 4;
		int penaltMad = 5;
		
		if(totalGoalsMad == totalGoalsBarc){
		    // When the overall result is even,
		    //goals scored away count double
		    // so we update the goals away for 
		    //each team and compare again.
		    goalsAwayBarc = goalsAwayBarc *2;
		    
		    // The 'variable *= X' operator means 
		    //the same as 'variable = variable * X'
		    goalsAwayMad *=2;
		    
		    // We calculate again the overall result
		     totalGoalsMad = goalsHomeMad + goalsAwayMad;
		    totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;
		    
		    // We show the result
		    System.out.println("Overall Result is ");
		    System.out.print("F.C. Barcelona "+totalGoalsBarc);
		    System.out.println(" - Real Madrid "+totalGoalsMad);
		    
		    if(totalGoalsMad > totalGoalsBarc){
		        System.out.println("Madrid passes the round!");
		    }else if(totalGoalsMad == totalGoalsBarc){
		        System.out.println("30 Minutes Extra Time");
		        System.out.println("Extra time Result is");
		        totalGoalsBarc = totalGoalsBarc + 1;
		        totalGoalsMad = totalGoalsMad + 1;
		        System.out.print("F.C. Barcelona "+totalGoalsBarc);
		        System.out.println(" - Real Madrid "+totalGoalsMad);
		        if(totalGoalsBarc == totalGoalsMad){
		            System.out.println("Penaltis");
		            System.out.print("F.C. Barcelona "+penaltBarc);
		            System.out.println(" - Real Madrid "+penaltMad);
		            if(penaltMad > penaltBarc){
		                System.out.println("Real Madrid passes the round");
		            }
		            else{
		                System.out.println("F.C. Barcelona passes the round");
		            }
		        }
		            
		    }else{
		        System.out.println("Barcelona wins");
		    }
		}else{
		    
		    // If the overall is not even 
		    // there is a clear winner.
		    System.out.println("Overall Result is ");
		    System.out.print("F.C. Barcelona "+totalGoalsBarc);
		    System.out.println(" - Real Madrid "+totalGoalsMad);
		    
		    if(totalGoalsMad > totalGoalsBarc){
		        System.out.println("Madrid passes the round!");
		    }else{
		        System.out.println("Barcelona passes the round!");
		    }
		}
	}
}