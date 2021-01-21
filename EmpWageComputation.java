class EmpWageComputation{
      static final int IS_FULL_TIME=1;
      static final int IS_PART_TIME=2;
      static final int EMP_RATE_PER_HOUR=20;
		static final int NUM_OF_WORKING_DAYS=20;
	public static void main(String args[])
	{
		int empHrs=0;
		int empWage=0;
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		switch (empCheck){
		case IS_FULL_TIME:
				empHrs=8;
				System.out.println("Employee is FullTime");
				empWage=empHrs*EMP_RATE_PER_HOUR*NUM_OF_WORKING_DAYS;
				System.out.println("Emp Wage : " + empWage);
				break;
		case IS_PART_TIME:
            empHrs=4;
            System.out.println("Employee is PartTime");
            empWage=empHrs*EMP_RATE_PER_HOUR*NUM_OF_WORKING_DAYS;
            System.out.println("Emp Wage : " + empWage);
         	break;
		default:
				System.out.println("Employee is absent");
				System.out.println("Employee wage is 0");
		}
	}
}
