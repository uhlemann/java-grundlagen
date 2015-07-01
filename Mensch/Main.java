import Mensch

public class MyClass
{
  public static void main(String args[])
  {
    // Instanz karl wird angelegt
    Mensch karl = new Mensch(170, 70);
    
    //Groesse wird ausgelesen,
    // Wert der Variable groesse ist nun 170
    int groesse = karl.getGroesse();
    
    //int position wird ausgelesen,
    // Wert der Variable position ist nun 0
    int position = karl.getPosition();
    
    //karl bewegt sich um 40 Meter,
    // d.h. position ist danach 40
    // und energieReserve 60
    karl.bewegung(40);
    
    //position hat nun den Wert 40
    position = karl.getPosition();
    
    //karl hat nicht mehr genug energieReserve,
    // um sich noch 70 Meter zu bewegen
    // daher werden an dieser Stelle weder energieReserve,
    // noch position geandert
    karl.bewegung(70);
    
    //position hat immernoch den Wert 40
    position karl.getPosition();
    
    //karl wird wieder "aufgetankt",
    // d.h energieReserve von 60 auf 110 erhoeht
    karl.grosseErfrischung();
    
    //da nun genuegend energieReserve vorhanden ist,
    // kann karl sich weitere 70 Meter bewegen.
    // energieReserve sinkt von 110 auf 40
    karl.bewegung(70);
    
    // position hat nun den Wert 110
    position = karl.getPosition();
    
  }
}
