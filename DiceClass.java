
public class DiceClass {
	
	private int m_value1,m_value2, m_value3, total;
	
	public DiceClass()  //constructor
	{
		roll();
	}
	public void roll() {
		m_value1= 1+(int)(Math.random()*6);
		m_value2= 1+(int)(Math.random()*6);
		m_value3= 1+(int)(Math.random()*6);
		total = m_value1 + m_value2 + m_value3;
	}
	
	public int Value1()  //method to return the value of 1 dice
	{
		return (m_value1);
	}
	public int Value2()  //method to return the value of 2 dice
	{
		return (m_value1+m_value2);
	}
	public int Value3()  //method to return the value of 3 dice
	{
		return (total);
	}
}
