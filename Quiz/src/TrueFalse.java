
public class TrueFalse extends Question
{
	private String answer;
	public TrueFalse(String inText) 
	{
		super(inText);
	}

	public String getSolution() 
	{
		return answer;
	}

	public String toString() 
	{
		return ("Question Number:" + getNumber() + " " + getText() + answer);
	}
}
