package u3pp;

import javax.lang.model.util.ElementScanner6;

/**
 * YOUR COMMENTs HERE
 * 
 * @author  Tryntyn Mardikian
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 */ 
	public static boolean isLeapYear(int year) {
		if (year < 1582)
		{
		 	return false; 
		}
		else if (year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					return true;
				}
				else{
					return false; 
				}
			}
			return true;
		
		} 
		else 
		return false;
 
	}
}