package employe;



public class MonWage extends WageCal{
	static short monthlyWage;
	static short monthlyWagePartTime;
	public MonWage(){
		monthlyWage = (short) (dailyWage*20);
		monthlyWagePartTime = (short) (dailyWage*20);
		System.out.println("Monthly wage of employee is "+monthlyWage);
		System.out.println("Monthly wage of part time employee is "+monthlyWagePartTime);
		
	}

}
