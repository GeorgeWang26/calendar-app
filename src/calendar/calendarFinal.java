package calendar;

public class calendarFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//original january first is thursday
		int originalYear=0;		
		int originalJanFirst=4;
	
		
		//change the target year to get the new calendar
		int targetYear=2016;
		
		
		//year in difference
        int diffYears=targetYear-originalYear;
       
        int diffMinusOne=diffYears-1;
       
        int fourYears=diffMinusOne/4;
       
        int prepHundredYears=diffMinusOne/100;
        int hundredYears=prepHundredYears-17;
        System.out.println(hundredYears);
        
        int prepFourHundredYears=diffMinusOne/400;
        int fourHundredYears=prepFourHundredYears-4;
        System.out.println(fourHundredYears);
 
        int diffDays=diffYears+fourYears+1;
        System.out.println(diffDays);
      
        if (targetYear>1752) {
        	diffDays=diffDays-hundredYears+fourHundredYears-11;
        	
        }
        System.out.println(diffDays);
      
        int targetJanFirst=(originalJanFirst+diffDays)%7;        
        System.out.println(targetJanFirst);
        
        System.out.println();
        
        //31 days
        int[] thirtyone=new int[31];
        for(int i=0;i<31;i++) {
        	thirtyone[i]=i+1;
        }
        
        //30 days
        int[] thirty=new int[30];
        for(int i=0;i<30;i++) {
        	thirty[i]=i+1;
        }
        
        //29 days
        int[] twentyone=new int[29];
        for(int i=0;i<29;i++) {
        	twentyone[i]=i+1;
        }
        
        //28 days
        int[] twentyeight=new int[28];
        for(int i=0;i<28;i++) {
        	twentyeight[i]=i+1;
        }
        
        
        //week
        int[][] january=new int[6][7];
        int[][] feburary=new int[6][7];
        int[][] march=new int[6][7];
        int[][] april=new int[6][7];
        int[][] may=new int[6][7];
        int[][] june=new int[6][7];
        int[][] july=new int[6][7];
        int[][] august=new int[6][7];
        int[][] september=new int[6][7];
        int[][] october=new int[6][7];
        int[][] november=new int[6][7];
        int[][] december=new int[6][7];
        
        int zero=0;
       
       
        //january
        for(int janFirst=targetJanFirst;janFirst<7;janFirst++) {
    		january[0][targetJanFirst]=thirtyone[zero];
    		zero++;
    	}
        for(int i=1;i<6;i++) {
        	for(int l=0;l<7;l++) {
        		january[i][l]=thirtyone[zero];
        		zero++;
        	}
        }
        
        
        
        
        
        for(int i=0;i<6;i++) {
        	for(int l=0;l<7;l++) {
        		System.out.print(january[i][l]);
        	}
        }
        
        
        
        
	}

}
