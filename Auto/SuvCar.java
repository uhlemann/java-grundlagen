public class SuvCar extends Car
{
	public void bewegung(int strecke)
	{
		private int tank = 40;
		
		if (tank >= strecke)
		{
			while (strecke >=0)
			{
				position = position +1;
				tank = tank -1;
				strecke -1;
		
			}
		}
	}
}
