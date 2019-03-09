public class TimeTest
{
	public static void main(String [] args)
	{
		Time time1 = new Time();
		time1.setTimeHours(11);
		time1.setTimeMinutes(55);
		time1.showTime();
	
		Time time2 = new Time();
		time2.setTimeHours(8);
		time2.setTimeMinutes(20);
		time2.showTime();

		Time time3;
		time3 = time1.sum(time2);
		time3.showTime();
	}
}