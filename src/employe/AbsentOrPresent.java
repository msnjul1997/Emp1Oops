package employe;



public class AbsentOrPresent {
	
		static float attendance;
		public void absentOrPresent()
		{
			attendance = (float) (Math.floor(Math.random()*10)%2);
	        if(attendance == 1)
	        {
	            System.out.println("Employee is present today");
	        }
	        else {
	            System.out.println("Employee is not present today");
	        }
		}

}
