public class Television
{
	private String stateOfTelevision;
	private int volume;
	private int channel;
	
	public Television(String state,int channel,int volume)
	{
		this.stateOfTelevision = state;
		this.channel = channel;
		this.volume = volume;
	}

	public void statusOfTelevision()
	{
		System.out.println("State :"+stateOfTelevision);
		System.out.println("Channel :"+channel);
		System.out.println("Volume :"+volume);
	}
	
	public void increaseVolume()
	{
		System.out.println("Volume Increases...");
		volume++;
		System.out.println("Volume :"+volume);
	}
	
	public void decreaseVolume()
	{
		System.out.println("Volume Decreases...");
		volume--;
		System.out.println("Volume :"+volume);
		
	}
	
	public void increaseChannel()
	{
		System.out.println("Channel Increases...");
		channel++;
		System.out.println("Channel :"+channel);
	}
	
	public void decreaseChannel()
	{
		System.out.println("Channel Decreases...");
		channel--;
		System.out.println("Channel :"+channel);
	}
	
	public void stateOfTelevision(String state)
	{
		System.out.println("State :"+state);	
	}
}