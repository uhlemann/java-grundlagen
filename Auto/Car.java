public class Car
{
	private string farbe;
	private int position;
	private int tank;
	
	public Auto(string _farbe)
	{
		int tank = 10;
		int position = 0;
		string farbe = _farbe;
		
	}
	
	public int getTank()
	{
		return tank;
	
	}
	
	public int getPosition()
	{
		return position;
		
	}
	
	public string getFarbe()
	{
		return farbe;
		
	}
	
	public void bewegung(int strecke)
	{
		if (tank >= strecke)
		{
			position = position + strecke;
			tanke = tank - strecke;
			
		}
		
	}
	
	public void tanken(int spritt)
	{
		tank = tank + spritt;
		
	}
	
}
