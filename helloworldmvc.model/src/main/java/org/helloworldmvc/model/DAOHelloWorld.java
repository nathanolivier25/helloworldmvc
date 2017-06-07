package org.helloworldmvc.model;


public class DAOHelloWorld
{
	String FileName = "HelloWorld.txt";
	Model model = null;
	DAOHelloWorld instance = null;
	String helloWorldMessage = null;
	
	public DAOHelloWorld()
	{
		
	}
	
	
	public DAOHelloWorld getInstance()
	{
		return instance;
	}
	
	private void setInstance(DAOHelloWorld instance)
	{
		this.instance = instance;
	}
	
	public void readFile()
	{
		
	}
	
	public String getHelloWordMessage()
	{
		return helloWorldMessage;
	}
	
	public void setHelloWorldMessage(String message)
	{
		
	}
	
	
	
	
}
