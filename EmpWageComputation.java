class EmpWageComputation
{
      static final int IS_FULL_TIME=1;
      static final int IS_PART_TIME=2;
      static final int EMP_RATE_PER_HOUR=20;
      static final int NUM_OF_WORKING_DAYS=20;
      static final int MAX_HOURS_IN_A_MONTH=100;

		public static int computeEmpWage()
		{
			int empHrs=0;
      	int totalEmpHours=0;
      	int totalWorkingDays=0;
      	while(totalEmpHours<=MAX_HOURS_IN_A_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
      	{
         	totalWorkingDays++;
         	int empCheck=(int) Math.floor(Math.random()*10)%3;
         	switch (empCheck)
         	{
            	case IS_FULL_TIME:
               	empHrs=8;
               	break;
            	case IS_PART_TIME:
               	empHrs=4;
               	break;
            	default:
               	empHrs=0;
         	}
         	totalEmpHours+=empHrs;
         	System.out.println("Day : " +totalWorkingDays + "     "+ "Emp hours : " +empHrs);
      	}
      	int totalEmpWage=totalEmpHours*EMP_RATE_PER_HOUR;
      	System.out.println("Total Emp Wage : " +totalEmpWage);
			return totalEmpWage;
		}
   	public static void main(String args[])
   	{
			computeEmpWage();
	   }
}
