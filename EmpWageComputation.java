class EmpWageComputation{
	public static void main(String args[])
	{
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck == IS_FULL_TIME)
<<<<<<< HEAD
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			{
				empHrs=8;
				System.out.println("Employee is present");
				empWage=empHrs*EMP_RATE_PER_HOUR;
				System.out.println("Emp Wage : " + empWage);
			}
=======
			{
				empHrs=8;
				System.out.println("Employee is FullTime");
				empWage=empHrs*EMP_RATE_PER_HOUR;
				System.out.println("Emp Wage : " + empWage);
			}
			else if(empCheck == IS_PART_TIME)
         {
            empHrs=4;
            System.out.println("Employee is PartTime");
            empWage=empHrs*EMP_RATE_PER_HOUR;
            System.out.println("Emp Wage : " + empWage);
         }

>>>>>>> EmpWageBuilderUC3
			else
			{
				System.out.println("Employee is absent");
				System.out.println("Employee wage is 0");
			}
	}
}
