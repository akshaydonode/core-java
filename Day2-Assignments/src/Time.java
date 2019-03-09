public class Time
{
	private int hours;
	private int minutes;

	public void setTimeHours(int hours)
	{
		this.hours=hours;
	}

	public void setTimeMinutes(int minutes)
	{
		this.minutes=minutes;
	}

	public void showTime()
	{
		System.out.println(hours+" Hours and "+minutes+" Minutes");
	}
	
	public Time sum(Time time2)
	{
		Time time4 = new Time();
		time4.hours = hours + time2.hours;
		time4.minutes = minutes + time2.minutes;

		if(time4.minutes >= 60)
		{
			time4.hours = time4.hours + 1;
			time4.minutes = time4.minutes - 60;
		}
		return time4;
	}

}