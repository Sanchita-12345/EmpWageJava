class EmpWageComputation
{
      static final int IS_FULL_TIME=1;
      static final int IS_PART_TIME=2;

		public static int computeEmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HOURS_IN_A_MONTH)
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
      	}
      	int totalEmpWage=totalEmpHours*EMP_RATE_PER_HOUR;
			System.out.println("Day : " +totalWorkingDays + "     "+ "Emp hours : " +empHrs);
      	System.out.println("Total Emp Wage for company "+company+" is " +totalEmpWage);
			return totalEmpWage;
		}
   	public static void main(String args[])
   	{
			EmpWageComputation obj1=new EmpWageComputation();
			EmpWageComputation obj2=new EmpWageComputation();
			obj1.computeEmpWage("TCS",20,20,100);
			obj2.computeEmpWage("WIPRO",15,10,80);
	   }
}
