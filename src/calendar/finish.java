package calendar;

public class finish {

	public int monthLen[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
    public final String[] monthTitle = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    public final String[] weekDayTitle = {"Sun ", "Mon ", "Tue ", "Wed ", "Thu ", "Fri ", "Sat "};
    
    public int year = 2002;
    public int firstDay;
    public int days = 1;
    
    
    public boolean isLeap() //working
    {
    	if(year % 4 == 0) {
    		if(year % 100 == 0) {
    			if(year % 400 == 0) {
    		       return true;			
    		}
    			return false;
    	  }
    		  return true;
       }
    	   return false;
    }
    
    
    public int getFirstDay() //working
    {
		//original january first is thursday
		int originalYear=0;		
		int originalJanFirst=4;
	
		
		//change the target year to get the new calendar
		int targetYear=year;
		
		
		//year in difference
        int diffYears=targetYear-originalYear;
       
        int diffMinusOne=diffYears-1;
       
        int fourYears=diffMinusOne/4;
       
        int prepHundredYears=diffMinusOne/100;
        int hundredYears=prepHundredYears-17;
        
        int prepFourHundredYears=diffMinusOne/400;
        int fourHundredYears=prepFourHundredYears-4;
 
        int diffDays=diffYears+fourYears+1;
      
        if (targetYear>1752) {
        	diffDays=diffDays-hundredYears+fourHundredYears-11;
        	
        }
      
        int day = (originalJanFirst+diffDays)%7;        
        return day;
    }

   
   public void prepare() //working to prepare
   {
	firstDay = getFirstDay();  
	
	if (isLeap()) {
		monthLen[1] = 29;
	   }
	
	if (year == 1752) {
		monthLen[8] = 19;
	}
	
   }
   
   
   public void print() //working
    {
    	
    	System.out.print("           "+year);
    	
    	for (int iMonth = 0; iMonth < 12; iMonth++) {
			System.out.println();
    		System.out.println("          "+monthTitle[iMonth]);
    		
    		for (int iWeek = 0; iWeek < 7; iWeek++) {
    			System.out.print(weekDayTitle[iWeek]);
    	
    		}//iWeek
    		System.out.println();                           
    		
    		for (int i = 0; i < firstDay; i++) {
    			System.out.print("    ");
    		}//space for spare days
    		
    		for(int iDay = 0; iDay < monthLen[iMonth]; iDay++) {
    			
                System.out.format("%2d  ", days);
    			firstDay++;
    			
    			if (year == 1752 && iMonth == 8 && days == 2) {
    			days +=	11;
    			}// 1752 skipped 11 days in september
    			
    			days ++;
    			
    			if (firstDay == 7) {
    				firstDay = 0;
    				System.out.println();
    			}//next week
 		}//iDay
    	//one month is finished 
    		days = 1;
    	}//iMonth
    }//whole thing
    

    public static void main(String[] args) {
    	finish cal = new finish();
    	cal.prepare();
        cal.print();
    }
}