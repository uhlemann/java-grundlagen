public class SportCar extends Car
{
	public void bewegung(int strecke)
	{
		private int tank = 20;
		
		if (tank >= strecke)
		{
			while (strecke >=0)
			{
				position = position +2;
				tank = tank -1;
				strecke -1;
		
			}
		}
	}
}
