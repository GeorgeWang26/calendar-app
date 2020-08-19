//this program is about how to make a calendar only with its year
package calendar;

public class calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//use 2006 as original year
		int originalYear=2000;
		int originalHundredsAndThousands=20;
		
		//change the target year to get the new calendar
		int targetYear=1999;
		int targetYearOnesAndTens=targetYear%100;
		int targetHundredsAndThousands=targetYear/100;
		
		
		//year in difference
        int difference=targetYear-originalYear;
       
        
        //how many years it takes for a leap year to come
        int loop=4;
        //how more many days than a week 4 years can have
        int moreDays=5;
        
        
        //preparation for the day of January 1st
        int prepYearSet=difference/loop;
        System.out.println(prepYearSet);
        int prepRemainder=difference%loop;
        System.out.println(prepRemainder);
        int prepHundredsThousands=targetHundredsAndThousands-originalHundredsAndThousands;
        System.out.println(prepHundredsThousands);
        int smallerSpecial=prepHundredsThousands/4;
        System.out.println(smallerSpecial);
        int largerSpecial=(prepHundredsThousands-1)/4;
    	
        //calculate which day is January 1st 
        int differenceJanuaryFirst;
        if(targetYear<originalYear) {
        	differenceJanuaryFirst=prepYearSet*5+prepRemainder-(prepHundredsThousands+1)+smallerSpecial;
        	System.out.println(prepYearSet*5);
        	System.out.println(prepYearSet*5+prepRemainder);
        	System.out.println(prepYearSet*5+prepRemainder-(prepHundredsThousands+1));
        	System.out.println(prepYearSet*5+prepRemainder-(prepHundredsThousands+1)+smallerSpecial);
        	
        }else if(targetYear>originalYear) {
        	differenceJanuaryFirst=prepYearSet*5+prepRemainder-prepHundredsThousands+largerSpecial;
        }else {
        	differenceJanuaryFirst=0;
        }
        System.out.println(differenceJanuaryFirst);
        int remainder=differenceJanuaryFirst%7;	
        System.out.println(remainder);
        

        int[] thirtyone=new int[31];
        for(int i=0;i<31;i++) {
        	thirtyone[i]=i+1;
        }
        
        int[][]week=new int[6][7];
        
        for(int i=0;i<6;i++) {
        	int zero=0;
        	for(int remain=remainder;remain<7;remain++) {
        		week[i][remain]=thirtyone[zero];
        		zero++;
        	}
        	i++;
        	for(int l=0;l<7;l++) {
        		week[i][l]=thirtyone[zero];
        		zero++;
            }
        }
       
       
        
       

	}
}



