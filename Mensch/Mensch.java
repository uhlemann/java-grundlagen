public class Mensch
{
  private int groesse:
  private int gewicht;
  
  private int position;
  
  private int energieReserven;
  
  public Mensch(int _groesse, int _gewicht)
  {
    groesse = _groesse;
    gewicht = _gewicht;
    
    position = 0;
    
    energieReserven = 100;
  
  }
  
  public int getGroesse()
  {
    return groesse;
    
  }
  
  public int getGewicht()
  {
    return gewicht;
    
  }
  
  public int getPosition()
  {
    return position;
    
  }
  
  public void bewegung(int strecke)
  {
    if (energieReserve >= strecke)
    {
      position = position + strecke;
      energieReserve =
        energiereserve - strecke;
      
    }
    
  }
  
  public void kleineErfrischung()
  {
    energieReserve = energieReserve + 10;
    
  }
  
  public void erfrischung()
  {
    energieReserve = energieReserve + 25;
  
  }
  
  public void grosseErfrischung()
  {
    energieReserve = energieReserve +50;
    
  }
  
  public void spezialErfrischung(int erfrischung)
  {
    energieReserve = energieReserve + erfrischung;
    
  }
  
}
