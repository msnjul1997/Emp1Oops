package employe;




public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee wage computation program on master branch!!");
		AbsentOrPresent attend = new AbsentOrPresent();
		WageCal wc = new WageCal();
//		WageCalculationUsingSwitch wcs = new WageCalculationUsingSwitch();
		MonWage mw = new MonWage();
		Condition cs = new Condition();
		cs.conditionCheck();
	}

}
