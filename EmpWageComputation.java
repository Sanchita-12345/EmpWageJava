class EmpWageComputation
{
      static final int IS_FULL_TIME = 1;
      static final int IS_PART_TIME = 2;
		final String company;
		final int EMP_RATE_PER_HOUR;
		final int NUM_OF_WORKING_DAYS;
		final int MAX_HOURS_IN_A_MONTH;
		public EmpWageComputation(String company,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HOURS_IN_A_MONTH)
		{
			this.company = company;
			this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
			this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
			this.MAX_HOURS_IN_A_MONTH = MAX_HOURS_IN_A_MONTH;
		}

		public int computeEmpWage()
		{
			//variables
			int empHrs = 0;
      	int totalEmpHours = 0;
      	int totalWorkingDays = 0;

			//computation
			while (totalEmpHours <= MAX_HOURS_IN_A_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
      	{
         	totalWorkingDays++;
         	int empCheck = (int) Math.floor(Math.random()*10)%3;
         	switch (empCheck)
         	{
            	case IS_FULL_TIME:
               	empHrs = 8;
               	break;
            	case IS_PART_TIME:
               	empHrs = 4;
               	break;
            	default:
               	empHrs = 0;
         	}
         	totalEmpHours += empHrs;
      		System.out.println("Day : " +totalWorkingDays + "     "+ "Emp hours : " +empHrs);
			}
      	int totalEmpWage = totalEmpHours*EMP_RATE_PER_HOUR;
			return totalEmpWage;
		}
   	public static void main(String args[])
   	{
			EmpWageComputation obj1=new EmpWageComputation("TCS",20,20,100);
			EmpWageComputation obj2=new EmpWageComputation("WIPRO",15,10,80);
			System.out.println("Total employee wage for company " +obj1.company + " is : " +obj1.computeEmpWage());
			System.out.println("Total employee wage for company " +obj2.company + " is : " +obj2.computeEmpWage());
	   }
}
