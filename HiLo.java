import java.util.Scanner; 

public class HiLo{ 

    public static int numberGuesses;     

    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in); 

        int choice[] = { 10, 100, 1000 }; 
        numberGuesses = 1; 

        System.out.println("Valkommen till HiLo!");
        System.out.println("Vilken svarighetsgrad?"); 
        System.out.println("Tryck 1 for Latt (1-10)"); 
        System.out.println("Tryck 2 for Mellan (1-100)"); 
        System.out.println("Tryck 3 for Svart (1-1000)"); 

        int game = sc.nextInt(); 

        if (game == 1) { 
            playGame(choice[0]); 
        } else if (game == 2){ 
            playGame(choice[1]); 
        } else if (game == 3){ 
            playGame(choice[2]); 
        } 
    } 

    static int playGame(int maxNumber){
      
        Scanner sc = new Scanner(System.in);  
        
        int answer = (int) (Math.random() * maxNumber) + 1; 
        
        System.out.println("Gissa pa ett tal mellan 1 - " + maxNumber); 
       
        int guess = -1;
        
        while (guess != answer){
            guess = sc.nextInt(); 
            giveResponse(guess, answer, maxNumber); 
            
            numberGuesses++;       
        }  
        return guess;  
   } 

    
    static void giveResponse(int guess, int answer, int maxNumber){ 

        if (guess < answer){ 
            System.out.println("Gissningen ar for lag!"); 
            System.out.println("Gissa pa ett tal mellan 1 - " + maxNumber);
        } else if (guess > answer){ 
            System.out.println("Gissningen ar for hog!"); 
            System.out.println("Gissa pa ett tal mellan 1 - " + maxNumber);
        } else if (guess == answer){ 
            System.out.println("Helt ratt!"); 
            System.out.println("Du lyckades pa " + numberGuesses + " forsok"); 
        } 
    } 
}  