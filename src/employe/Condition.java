package employe;

public class Condition extends WageCal{
	static short days = 1;
	public static void conditionCheck()
	{
		while(hours<100 && days<20)
		{
			dailyWage += (short) (wage * hours);
			dailyWage +=  (short) (wage * dailyWage);
			System.out.println("Wage till day "+days+" is "+dailyWage);
			System.out.println("Wage of part time employee till day  "+days+" is "+dailyWage);
			days++;
			hours+=8;
			
		}
		System.out.println("---------------");
		System.out.println("Total wage till 100 hours and 20 days is "+dailyWage);
		System.out.println("Total wage of part time emp till 100 hours and 20 days is "+dailyWage);
	}


}
