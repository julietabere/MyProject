import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class initClass {

	
	
	public MainOfProject MyClass;
	public WebElement QuestionInput;
	public WebElement NextButtonBuildGame;
	public WebElement GameNextButtonIn;
	public WebElement Start;
	public WebElement WriteAnswer;
	public WebElement WriteAnswer1;
	public WebElement WriteAnswer2;
	public WebElement WriteAnswer3;
	public WebElement MarkAnswer1;
	public WebElement Play;
	public WebElement ChooseAnswerGame;
	public WebElement BackButtonBuild;
	public WebElement MarkAnswer2;
	public WebElement MarkAnswer3;
	public WebElement MarkAnswer4; 
	public WebElement ChooseAnswerGame12;
	public WebElement ChooseAnswerGame13;
	public WebElement ChooseAnswerGame14;
	public WebElement ChooseAnswerGame22;
	public WebElement ChooseAnswerGame23;
	public WebElement ChooseAnswerGame24;
	public WebElement ChooseAnswerGame32;
	public WebElement ChooseAnswerGame33;
	public WebElement ChooseAnswerGame34;
	public WebElement QuitButtonMiddleGame;
	public WebElement QuitButtonEndGame;
	public WebElement BackButtonGame;
	public WebElement TryAgainButton;
	public WebDriver driver;
	public WebElement FacebookButton;
	

	@BeforeEach
	void Match () throws InterruptedException {
	MyClass= new MainOfProject("https://svcollegetest.000webhostapp.com/");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	
	MyClass.setNextButtonBuildGame("nextquest");
	MyClass.setQuestion("question");
	MyClass.setAnswerFieldA("//*[@id=\"answers\"]/div[1]/div[2]/input");
	MyClass.setAnswerFieldB("//*[@id=\"answers\"]/div[2]/div[2]/input");
	MyClass.setAnswerFieldC("//*[@id=\"answers\"]/div[3]/div[2]/input");
	MyClass.setAnswerFieldD("//*[@id=\"answers\"]/div[4]/div[2]/input");
	MyClass.setMarkAnswer1("//*[@id=\"answers\"]/div[1]/div[1]/input");
	MyClass.setPlayButton("//*[@id=\"secondepage\"]/center/button[1]");
	MyClass.setChooseAnswerGame11("//*[@id=\"2\"]/input[1]");
	MyClass.setChooseAnswerGame21("//*[@id=\"1\"]/input[1]");
	MyClass.setChooseAnswerGame31("//*[@id=\"0\"]/input[1]");
	MyClass.setNextButtonInGame("btnnext");
	MyClass.setQuitGame("//*[@id=\"markpage\"]/center/button[2]");
	MyClass.setMarkAnswer2("//*[@id=\"answers\"]/div[2]/div[1]/input");
	MyClass.setMarkAnswer3("//*[@id=\"answers\"]/div[3]/div[1]/input");
	MyClass.setMarkAnswer4("//*[@id=\"answers\"]/div[4]/div[1]/input");
	MyClass.setNextButtonGame("btnback");
	MyClass.setNextButtonGame("btnnext");
	MyClass.setChooseAnswerGame12("//*[@id=\"2\"]/input[2]");
	MyClass.setChooseAnswerGame13("//*[@id=\"2\"]/input[3]");
	MyClass.setChooseAnswerGame14("//*[@id=\"2\"]/input[4]");
	MyClass.setChooseAnswerGame22("//*[@id=\"1\"]/input[2]");
	MyClass.setChooseAnswerGame23("//*[@id=\"1\"]/input[3]");
	MyClass.setChooseAnswerGame24("//*[@id=\"1\"]/input[4]");
	MyClass.setChooseAnswerGame32("//*[@id=\"0\"]/input[2]");
	MyClass.setChooseAnswerGame33("//*[@id=\"0\"]/input[3]");
	MyClass.setChooseAnswerGame34("//*[@id=\"0\"]/input[4]");
	MyClass.setBackBuuttonBuild("backquest");
	MyClass.setQuitButtonMiddleGame("//*[@id=\"secondepage\"]/center/button[2]");
	MyClass.setBackBuuttonGame("btnback");
	MyClass.setTryAgainButton("//*[@id=\"markpage\"]/center/button[1]");
	MyClass.setQuitButtonEndGame("//*[@id=\"markpage\"]/center/button[2]");
	MyClass.setFacebookButton("//*[@id=\"fackBook2\"]/img");
	
	}
	
	@AfterEach
	void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}
}
