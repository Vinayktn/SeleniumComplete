package day5_inherit;

public class CustomChromeDriver implements CustomWebDriver, PDFGenerate
{
	public static void main(String[] args) 
	{
		//child reference and child class object
		CustomChromeDriver c1 = new CustomChromeDriver();
		c1.get();
		c1.findelement();
		c1.findelements();
		c1.takeFullPageScreenshot();
		c1.close();

		//we can give the reference of an interface and creat the child class object
		//Base class reference and child class object
		CustomWebDriver c2 = new CustomChromeDriver();
		c2.get();
		c2.findelement();
		c2.findelements();
		c2.close();

		//This is not allowed in java
		//CANNOT CREATE OBJECT OF AN INTERFACE
		//CustomWebDriver c3 = new CustomWebDriver();
		//CustomChromeDriver c4 = new CustomWebDriver();
	}

	public void takeFullPageScreenshot()
	{
		System.out.println("Chrome can capture full page screenshots");
	}

	@Override
	public void get() 
	{
		System.out.println("Application started in chrome");	
	}

	@Override
	public void close() 
	{
		System.out.println("Application stopped by chrome");	

	}

	@Override
	public void findelement() 
	{
		System.out.println("Chrome is finding elements using locator");	

	}

	@Override
	public void findelements() 
	{
		System.out.println("Chrome can find multiple elements");	

	}

	@Override
	public void pdfgenerate() {
		System.out.println("Chrome can generate PDF's");		
	}
}