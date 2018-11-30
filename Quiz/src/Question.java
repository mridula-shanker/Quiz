
public abstract class Question 
{
	private int number =1;
	private String text;
	
	public Question (String inText)
	{
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
