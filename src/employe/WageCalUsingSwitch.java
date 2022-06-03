package employe;



public class WageCalUsingSwitch extends AbsentOrPresent{
	public WageCalUsingSwitch()
	{
		switch ((int)attendance)
		{
		case 1:
			WageCal.dailyWage =  (short) (WageCal.wage * WageCal.hours);
			System.out.println("The employees daily wage is "+WageCal.dailyWage);
			
			WageCal.dailyWage =  (short) (WageCal.wage * WageCal.dailyWage);
			System.out.println("The part time employee's daily wage is "+WageCal.dailyWage);
		case 0:
			System.out.println("The employee is absent so his today's wage is 0");
		}
		
	}

}
