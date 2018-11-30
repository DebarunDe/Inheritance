
public class MultipleChoice extends Question{
	
	private String[] AnswerChoices;
	private char correctAnswer;
	
	public MultipleChoice(String[]arr, char ans) 
	{
		
	}
	
	
	public String toString()
	{
		String question = super.getText();
		return question;
	}
	
	public String getSolution(String[]arr, char ans)
	{
		for(String answer : arr)
		{
			if(answer.equals(ans))
			{
				answer = (String) correctAnswer; 
			}
		}
	}

}
