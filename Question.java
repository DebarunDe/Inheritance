
public abstract class Question {
	
	private int number;
	private String text;
	
	public Question(int num, String word)
	{
		number = num;
		text = word;
	}
	
	public int getNumber()
	{
		int count = number;
		return count;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();

}
