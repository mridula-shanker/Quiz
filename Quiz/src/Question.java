
public abstract class Question 
{
	private int number;
	private String text;
	
	public Question (String inText)
	{
		number =1;
		text = inText;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
	
}
