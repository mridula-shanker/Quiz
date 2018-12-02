
public class MultipleChoice extends Question
{
	private char correctAnswer;
	private String[] answerChoices;

	public MultipleChoice(String inText, char correct, String[] choices) 
	{
		super(inText);
		correctAnswer = correct;
		answerChoices = choices;
	}

	
	public String getSolution() 
	{
		return "" + correctAnswer;
	}
	
	public String toString() 
	{
		return ("Question Number:" + getNumber() + " " + getText() + correctAnswer);
	}
	
}
