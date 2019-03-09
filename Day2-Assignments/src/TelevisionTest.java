public class TelevisionTest
{
	public static void main(String [] args)
	{
		Television television = new Television("On",1,20);
		television.statusOfTelevision();
		television.increaseVolume();
		television.increaseChannel();
		television.decreaseVolume();
		television.decreaseChannel();
		television.stateOfTelevision("Off");
	}
}