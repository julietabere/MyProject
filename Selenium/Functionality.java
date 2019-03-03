import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Functionality extends initClass  {

	//Functionality
//1	
	@Test
	void testBeckButtonBuildPage1 () { //BUG- Doesn't able to press "back" // Assert לא מזהה את השגיאה.


		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
			fail("Home page- Error");
			}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
		this.BackButtonBuild.click();
		Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("QA"));	
			System.out.println("EXELENTE!");
			}
			catch (Exception e) {
			System.out.println("back button doesn't work!");
			}
			}
//2	
		@Test
	void TestBackButtonBuildPage2() throws InterruptedException {
			
		
			
			try {			
				this.driver.get(MyClass.myPath);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("Test")==true) {
				}
				else {
					fail("Home page- Error");
				}
		
		
			MyClass.setStartButton("startB");
			this.Start = driver.findElement(By.id(MyClass.getStartButton()));
			this.Start.click();
			Thread.sleep(1000);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Please")==true) {
			}
			else {
				fail("ERROR: Didn't got to first question page");
			}
		
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(2000);
			if(driver.getPageSource().contains("question")==true) {
			}
			else {
				fail("ERROR: Didn't got to first build answers page");
			}

			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
			this.BackButtonBuild.click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("here"));	
			System.out.println("EXELENTE!");
			}
			catch (Exception e) {
				System.out.println("Back button doesn't work!");
			}
			}
//3	
	@Test
	void TestBackButtonBuildPage3() {



		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		}
		else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("question")==true) {
		}
		else {
			fail("ERROR: Didn't got to first build answers page");
		}

		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("question")==true) {
		}
		else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
			this.BackButtonBuild.click();
			assertTrue(driver.getPageSource().contains("here"));	
			System.out.println("EXELENTE!");
			}
			catch (Exception e) {
			System.out.println("Back button doesn't work");
			}
	}
//4
	@Test	
	void TestBackButtonBuidPage4() {
	
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
		
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("question")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}

		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
			this.BackButtonBuild.click();
			assertTrue(driver.getPageSource().contains("question"));	
			System.out.println("EXELENTE!");
			}
			catch (Exception e) {
			System.out.println("Back button doesn't work");
		}
	}
//5
		@Test	
	void TestBackButtonBuidPage5() { //BUG- "back" button function is - "next"
			
			
			try {			
				this.driver.get(MyClass.myPath);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("Test")==true) {
				}
				else {
					fail("Home page- Error");
				}
		

			MyClass.setStartButton("startB");
			this.Start = driver.findElement(By.id(MyClass.getStartButton()));
			this.Start.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to first question page");
			}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(2000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to first build answers page");
			}


			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to Second question page");
			}

				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
				Thread.sleep(1000);

				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("possible")==true) {
				} else {
					fail("ERROR: Didn't got to second build answers page");
				}	
	
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
				this.MarkAnswer1.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third question page");
				}
		
				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
				Thread.sleep(1000);

				this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
				this.BackButtonBuild.click();
				Thread.sleep(1000);
				assertTrue(driver.getPageSource().contains("2"));	
				System.out.println("EXELENTE!");
				}
				catch (Exception e) {
				System.out.println("Back button doesn't work");
			}
		}
//6
		@Test	
	void TestBackButtonBuidPage6() {

			
			try {			
				this.driver.get(MyClass.myPath);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("Test")==true) {
				}
				else {
					fail("Home page- Error");
				}
		
			MyClass.setStartButton("startB");
			this.Start = driver.findElement(By.id(MyClass.getStartButton()));
			this.Start.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to first question page");
			}
			
		
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(2000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to first build answers page");
			}

			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to Second question page");
			}

				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
				Thread.sleep(1000);

				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("possible")==true) {
				} else {
					fail("ERROR: Didn't got to second build answers page");
				}
			
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
				this.MarkAnswer1.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third question page");
				}
				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
				Thread.sleep(1000);

				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third build answers page");
				}	
			
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
				this.MarkAnswer1.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
				this.BackButtonBuild.click();
				assertTrue(driver.getPageSource().contains("back button -V"));	
				System.out.println("back button -V");
				}
				catch (Exception e) {
				System.out.println("Back button doesn't work");
				}
			
	}
//7	
		@Test
	void TestQuitButtonBeforePalying () { //BUG- the page don't close.
	
	try {			
		this.driver.get(MyClass.myPath);			Thread.sleep(2000);
		Thread.sleep(2000);
		if(driver.getPageSource().contains("Test")==true) {
		}
		else {
			fail("Home page- Error");
		}

	MyClass.setStartButton("startB");
	this.Start = driver.findElement(By.id(MyClass.getStartButton()));
	this.Start.click();
	Thread.sleep(1000);
	if(driver.getPageSource().contains("Please")==true) {
	} else {
		fail("ERROR: Didn't got to first question page");
	}

	this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
	this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
	Thread.sleep(1000);

	this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
	this.NextButtonBuildGame.click();
	Thread.sleep(2000);
	if(driver.getPageSource().contains("possible")==true) {
	} else {
		fail("ERROR: Didn't got to first build answers page");
	}


	this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
	this.WriteAnswer.sendKeys("A");
	this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
	this.WriteAnswer1.sendKeys("B");
	this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
	this.WriteAnswer2.sendKeys("C");
	this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
	this.WriteAnswer3.sendKeys("D");
	Thread.sleep(1000);
	
	this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
	this.MarkAnswer1.click();
	Thread.sleep(1000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	MyClass.setNextButtonBuildGame("nextquest");
	this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
	this.NextButtonBuildGame.click();
	
	if(driver.getPageSource().contains("Please")==true) {
	} else {
		fail("ERROR: Didn't got to Second question page");
	}

		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to second build answers page");
		}	
	
		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to third question page");
		}
		
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to third build answers page");
		}	
	
		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		if(driver.getPageSource().contains("finished")==true) {
		} else {
			fail("ERROR: Didn't got to main page before palying");
		}
		
		this.QuitButtonMiddleGame = driver.findElement(By.xpath(MyClass.getQuitButtonMiddleGame()));
		this.QuitButtonMiddleGame.click();
		assertTrue(driver.getPageSource().contains("מה צריך להופיע פה?"));	
		System.out.println("Quit button - V");
		}
		catch (Exception e) {
		System.out.println("Quit button - FAIL");
		}

		}
//8			
		@Test
	void TestBackButtonGame1 () {  //BUG - Doesn't able to press "back" button

							
				try {			
					this.driver.get(MyClass.myPath);
					Thread.sleep(2000);
					if(driver.getPageSource().contains("Test")==true) {
					}
					else {
						fail("Home page- Error");
					}
			
				MyClass.setStartButton("startB");
				this.Start = driver.findElement(By.id(MyClass.getStartButton()));
				this.Start.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to first question page");
				}
			
			
				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
				Thread.sleep(1000);

				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(2000);
				if(driver.getPageSource().contains("possible")==true) {
				} else {
					fail("ERROR: Didn't got to first build answers page");
				}


				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
				this.MarkAnswer1.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to Second question page");
				}

					this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
					this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
					Thread.sleep(1000);

					this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
					this.NextButtonBuildGame.click();
					Thread.sleep(1000);
					if(driver.getPageSource().contains("possible")==true) {
					} else {
						fail("ERROR: Didn't got to second build answers page");
					}	
				
					this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
					this.WriteAnswer.sendKeys("A");
					this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
					this.WriteAnswer1.sendKeys("B");
					this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
					this.WriteAnswer2.sendKeys("C");
					this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
					this.WriteAnswer3.sendKeys("D");
					Thread.sleep(1000);
					
					this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
					this.MarkAnswer1.click();
					Thread.sleep(1000);
					
					JavascriptExecutor js1 = (JavascriptExecutor) driver;
					js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					MyClass.setNextButtonBuildGame("nextquest");
					this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
					this.NextButtonBuildGame.click();
					
					if(driver.getPageSource().contains("Please")==true) {
					} else {
						fail("ERROR: Didn't got to third question page");
					}
					this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
					this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
					Thread.sleep(1000);

					this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
					this.NextButtonBuildGame.click();
					Thread.sleep(1000);
					if(driver.getPageSource().contains("Please")==true) {
					} else {
						fail("ERROR: Didn't got to third build answers page");
					}	
				
					this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
					this.WriteAnswer.sendKeys("A");
					this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
					this.WriteAnswer1.sendKeys("B");
					this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
					this.WriteAnswer2.sendKeys("C");
					this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
					this.WriteAnswer3.sendKeys("D");
					Thread.sleep(1000);
					
					this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
					this.MarkAnswer1.click();
					Thread.sleep(1000);
					
					JavascriptExecutor js2 = (JavascriptExecutor) driver;
					js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					MyClass.setNextButtonBuildGame("nextquest");
					this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
					this.NextButtonBuildGame.click();
					if(driver.getPageSource().contains("finished")==true) {
					} else {
						fail("ERROR: Didn't got to main page before palying");
					}
					this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
					this.Play.click();
					if(driver.getPageSource().contains("C")==true) {
					} else {
						fail("ERROR: Didn't got to first page of game");
					}
					this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
					this.ChooseAnswerGame.click();
					Thread.sleep(1000);

					JavascriptExecutor js3 = (JavascriptExecutor) driver;
					js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					this.BackButtonGame = driver.findElement(By.id(MyClass.getBackBuuttonGame()));
					this.BackButtonGame.click();
					assertTrue(driver.getPageSource().contains("play"));	
					System.out.println("back button - V");
					}
					catch (Exception e) {
					System.out.println("Back button - FAIL");
					}
		}
//9	
//9
		@Test

	void TestBackButtonGame2 () {
			
			try {			
				this.driver.get(MyClass.myPath);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("Test")==true) {
				}
				else {
					fail("Home page- Error");
				}
		
		
			MyClass.setStartButton("startB");
			this.Start = driver.findElement(By.id(MyClass.getStartButton()));
			this.Start.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to first question page");
			}
		
		
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(2000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to first build answers page");
			}

			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to Second question page");
			}

				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
				Thread.sleep(1000);

				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("possible")==true) {
				} else {
					fail("ERROR: Didn't got to second build answers page");
				}	
			
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
				this.MarkAnswer1.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js0 = (JavascriptExecutor) driver;
				js0.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third question page");
				}
				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
				Thread.sleep(1000);

				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third build answers page");
				}	
			
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
				this.MarkAnswer1.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				if(driver.getPageSource().contains("finished")==true) {
				} else {
					fail("ERROR: Didn't got to main page before palying");
				}
				this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
				this.Play.click();
				if(driver.getPageSource().contains("C")==true) {
				} else {
					fail("ERROR: Didn't got to first page of game");
				}
				this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
				this.ChooseAnswerGame.click();
				Thread.sleep(1000);

				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonGame("btnnext");
				this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
				this.GameNextButtonIn.click();
				if(driver.getPageSource().contains("B")==true) {
				} else {
					fail("ERROR: Didn't got to second page of game");
				}
		
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			this.BackButtonGame = driver.findElement(By.id(MyClass.getBackBuuttonGame()));
			this.BackButtonGame.click();
			assertTrue(driver.getPageSource().contains("C?"));	
			System.out.println("Back button - V");
			}
			catch (Exception e) {
			System.out.println("Back button - FAIL");
			}			
		}
//10
//10
		@Test
	void TestBackButtonGame3 () {
		
		try {			
			this.driver.get(MyClass.myPath);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("Test")==true) {
				}
				else {
					fail("Home page- Error");
				}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js0 = (JavascriptExecutor) driver;
			js0.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		this.BackButtonGame = driver.findElement(By.id(MyClass.getBackBuuttonGame()));
		this.BackButtonGame.click();
		assertTrue(driver.getPageSource().contains("B?"));	
		System.out.println("Back button- V");
			}
		catch (Exception e) {
		System.out.println("Back button - FAIL");
		}	
	}
//11	
//11
	@Test
	void TryAgainButonEndGame () {

		
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js0 = (JavascriptExecutor) driver;
			js0.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("Sucsses")==true) {
		} else {
			fail("ERROR: Didn't got to the final page");
		}
		
		Thread.sleep(1000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("scroll(0, 250);");
		this.TryAgainButton = driver.findElement(By.xpath(MyClass.getTryAgainButton()));
		this.TryAgainButton.click();
		Thread.sleep(1000);
		assertTrue(driver.getPageSource().contains("C?"));	
		System.out.println("Try agian button - V");
		}
		catch (Exception e) {
		System.out.println("Try again button - FAIL");
		}
	}
//12
//12
	@Test
	void TestQuitButtonEndGame () {
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("Sucsses")==true) {
		} else {
			fail("ERROR: Didn't got to the last page");
		}
	
		Thread.sleep(1000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("scroll(0, 250);");
		this.QuitButtonEndGame = driver.findElement(By.xpath(MyClass.getQuitButtonEndGame()));
		this.QuitButtonEndGame.click();
		assertTrue(driver.getPageSource().contains(""));	
		System.out.println("");
		}
		catch (Exception e) {
		System.out.println("ERROR- quit button doesn't work");
		}
		}
//13
//13
	@Test
	void TestSecondeAnswerBuildAndGame () {
			
			try {			
				this.driver.get(MyClass.myPath);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("Test")==true) {
				}
				else {
					fail("Home page- Error");
				}
		
		
		
			MyClass.setStartButton("startB");
			this.Start = driver.findElement(By.id(MyClass.getStartButton()));
			this.Start.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to first question page");
			}
		
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
			Thread.sleep(1000);
	
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(2000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to first build answers page");
			}
	
	
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer2 = driver.findElement(By.xpath(MyClass.getMarkAnswer2()));
			this.MarkAnswer2.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to Second question page");
			}
	
				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
				Thread.sleep(1000);
	
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("possible")==true) {
				} else {
					fail("ERROR: Didn't got to second build answers page");
				}	
			
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer2 = driver.findElement(By.xpath(MyClass.getMarkAnswer2()));
				this.MarkAnswer2.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third question page");
				}
				this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
				this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
				Thread.sleep(1000);
	
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				Thread.sleep(1000);
				if(driver.getPageSource().contains("Please")==true) {
				} else {
					fail("ERROR: Didn't got to third build answers page");
				}	
			
				this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
				this.WriteAnswer.sendKeys("A");
				this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
				this.WriteAnswer1.sendKeys("B");
				this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
				this.WriteAnswer2.sendKeys("C");
				this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
				this.WriteAnswer3.sendKeys("D");
				Thread.sleep(1000);
				
				this.MarkAnswer2 = driver.findElement(By.xpath(MyClass.getMarkAnswer2()));
				this.MarkAnswer2.click();
				Thread.sleep(1000);
				
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonBuildGame("nextquest");
				this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
				this.NextButtonBuildGame.click();
				if(driver.getPageSource().contains("finished")==true) {
				} else {
					fail("ERROR: Didn't got to main page before palying");
				}
				this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
				this.Play.click();
				if(driver.getPageSource().contains("C")==true) {
				} else {
					fail("ERROR: Didn't got to first page of game");
				}
				this.ChooseAnswerGame12 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame12()));
				this.ChooseAnswerGame12.click();
				Thread.sleep(1000);
	
				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				MyClass.setNextButtonGame("btnnext");
				this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
				this.GameNextButtonIn.click();
				if(driver.getPageSource().contains("B")==true) {
				} else {
					fail("ERROR: Didn't got to second page of game");
				}
		
			this.ChooseAnswerGame22 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame22()));
			this.ChooseAnswerGame22.click();
			Thread.sleep(1000);
	
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("A")==true) {
			} else {
				fail("ERROR: Didn't got to third page of game");
			}
	
			this.ChooseAnswerGame32 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame32()));
			this.ChooseAnswerGame32.click();
			Thread.sleep(1000);
	
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			assertTrue(driver.getPageSource().contains("Sucsses"));	
			System.out.println("EXELENTE!");
			}
			catch (Exception e) {
			System.out.println("GAME OVER");
	}
		}
//14
//14
	@Test
	void TestThirdAnswerBuildAndGame () {
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer3 = driver.findElement(By.xpath(MyClass.getMarkAnswer3()));
		this.MarkAnswer3.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer3 = driver.findElement(By.xpath(MyClass.getMarkAnswer3()));
			this.MarkAnswer3.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer3 = driver.findElement(By.xpath(MyClass.getMarkAnswer3()));
			this.MarkAnswer3.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame13 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame13()));
			this.ChooseAnswerGame13.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame23 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame23()));
		this.ChooseAnswerGame23.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame33 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame33()));
		this.ChooseAnswerGame33.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
	}
//15
//15
	@Test
	void TestFourthAnswerBuildAndGame () {
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer4 = driver.findElement(By.xpath(MyClass.getMarkAnswer4()));
		this.MarkAnswer4.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer4 = driver.findElement(By.xpath(MyClass.getMarkAnswer4()));
			this.MarkAnswer4.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer4 = driver.findElement(By.xpath(MyClass.getMarkAnswer4()));
			this.MarkAnswer4.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}
			
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame14 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame14()));
			this.ChooseAnswerGame14.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame24 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame24()));
		this.ChooseAnswerGame24.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame34 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame34()));
		this.ChooseAnswerGame34.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
	}
//16
//16
	@Test
	void MarkMixedAnswers () {
	 
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer3 = driver.findElement(By.xpath(MyClass.getMarkAnswer3()));
		this.MarkAnswer3.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer4 = driver.findElement(By.xpath(MyClass.getMarkAnswer4()));
			this.MarkAnswer4.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame14 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame14()));
			this.ChooseAnswerGame14.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame32 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame32()));
		this.ChooseAnswerGame32.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
	}
//17
//17
	@Test
	void ChangeAnswerAfterMarking () {
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		this.MarkAnswer3 = driver.findElement(By.xpath(MyClass.getMarkAnswer3()));
		this.MarkAnswer3.click();
		Thread.sleep(1000);
		
		assertTrue(driver.getPageSource().contains("?"));	// לפי מה אפשר לכתוב שהתשובה השתנתה מהשדה הראשון לשלישי?
		System.out.println("?");
		}
		catch (Exception e) {
		System.out.println("?");
		}		
	}
//18
//18
	@Test
	void FailTestByOneWrongAnswer() { //BUG- Success result instead of FAIL

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame32 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame32()));
		this.ChooseAnswerGame32.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Failed"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("Mistake in the game result");
		}
	}

//19
//19
	@Test
	void FailTestByTwoWrongAnswers () {
	
		
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame23 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame23()));
		this.ChooseAnswerGame23.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to second page of game");
		}

		this.ChooseAnswerGame33 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame33()));
		this.ChooseAnswerGame33.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Failed"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("Mistake in the game result");
		}
	}
//20
//20
	@Test
	void FailTestByThreeWrongAnswers () {
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame13 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame13()));
			this.ChooseAnswerGame13.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame23 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame23()));
		this.ChooseAnswerGame23.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame33 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame33()));
		this.ChooseAnswerGame33.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Failed"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("Mistake in the game result");
		}
	}
//21
//21
	@Test
	void ChangeAnswerAfterPressingTheBackButton() throws InterruptedException {  
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(1000);
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
			this.BackButtonBuild.click();
			Thread.sleep(1000);
			this.MarkAnswer2 = driver.findElement(By.xpath(MyClass.MarkAnswer2));
			this.MarkAnswer2.click();
			if(driver.getPageSource().contains("here")==true) {
			} else {
				fail("Back Button Test - ERROR");
			}
	
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("B")==true) {
		} else {
			fail("ERROR: Didn't got to second page of game");
		}

		this.ChooseAnswerGame32 = driver.findElement(By.xpath(MyClass.getChooseAnswerGame32()));
		this.ChooseAnswerGame32.click();

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
	
	}
//22
//22
	@Test
	
	void MissingQuestionMarkNumber1 () {  //BUG- Question mark hasen't been added by the app
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 250);");
		this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
		this.BackButtonBuild.click();
		Thread.sleep(1000);
		assertTrue(driver.getPageSource().contains("A?"));	
		System.out.println("Question mark has been added- V");
		}
		catch (Exception e) {
		System.out.println("Question mark has been added - ERROR");
		}

	}
//23
//23
	@Test
	void MissingQuestionMarkNumber2() {   //BUG- Question mark hasen't been added by the app
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("scroll(0, 250);");
			this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
			this.BackButtonBuild.click();
			Thread.sleep(1000);
			
			assertTrue(driver.getPageSource().contains("B?"));	
			System.out.println("Question mark has been added - V");
			}
			catch (Exception e) {
			System.out.println("Question mark has been added - ERROR");
			}
	}
//24
//24
	@Test
	void MissingQuestionMarkNumber3() {   //BUG- Question mark hasn't been added by the app
		

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("scroll(0, 250);");
			this.BackButtonBuild = driver.findElement(By.id(MyClass.getBackBuuttonBuild()));
			this.BackButtonBuild.click();
			Thread.sleep(1000);
			assertTrue(driver.getPageSource().contains("C?"));	
			System.out.println("Question mark has been added - V");
			}
			catch (Exception e) {
			System.out.println("Question mark has been added - ERROR");
			}

	}
//25
//25
	@Test
	void CheckRandomOrder() {      //BUG- The questions dosen't appear in a random order
		
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
		this.QuestionInput.findElement(By.name("question")).sendKeys("A?");
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("Sucsses")==true) {
		} else {
			fail("ERROR: Didn't got to the last page");
		}

		Thread.sleep(1000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("scroll(0, 250);");
		this.TryAgainButton= driver.findElement(By.xpath(MyClass.getTryAgainButton()));
		this.TryAgainButton.click();
		if(driver.getPageSource().contains("finished")==true) {
		} else {
			fail("Try button doesn't work");
		}

			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js7 = (JavascriptExecutor) driver;
			js7.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("C")==true) {
				throw new Exception("The question isn't random");
				}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		js10.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("B")==true) {
		throw new Exception("The question isn't random");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		throw new Exception("The question isn't random");
		}

		Thread.sleep(1000);
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("scroll(0, 250);");
		this.QuitButtonEndGame = driver.findElement(By.xpath(MyClass.getQuitButtonEndGame()));
		this.QuitButtonEndGame.click();
		assertTrue(driver.getPageSource().contains("A"));	
		System.out.println("Error");
		}
		catch (Exception e) {
		System.out.println("Excelent!");
		}	
	}
//26
//26
	@Test
	void SameAnswersInAllFields () {

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to Second question page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("A");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("A");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("A");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			assertTrue(driver.getPageSource().contains("question"));	
			System.out.println("Fill the question field (1) - V");
			}
			catch (Exception e) {
			System.out.println("Fill the question field(1) - ERROR");
			}	
	}

	//Boundary Values
	//Boundary Values

//1
//1
	@Test
	void UpTo50LesttersInTheQuestion () { //BUG- The question can contain up to 49 letters without space
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("Bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("Cccccccccccccccccccccccccccccccccccccccccccccccccc?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
	}
//2
//2	
	@Test
	void UpTo30LesttersInTheAnswer() {
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}

		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("cccccccccccccccccccccccccccccc");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("dddddddddddddddddddddddddddddd");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("cccccccccccccccccccccccccccccc");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("dddddddddddddddddddddddddddddd");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("finished")==true) {
			} else {
				fail("ERROR: Didn't got to main page before palying");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("cccccccccccccccccccccccccccccc");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("dddddddddddddddddddddddddddddd");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to Second question page");
			}
		
			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
			this.Play.click();
			if(driver.getPageSource().contains("C")==true) {
			} else {
				fail("ERROR: Didn't got to first page of game");
			}
			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
			this.ChooseAnswerGame.click();
			Thread.sleep(1000);

			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonGame("btnnext");
			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
			this.GameNextButtonIn.click();
			if(driver.getPageSource().contains("B")==true) {
			} else {
				fail("ERROR: Didn't got to second page of game");
			}
	
		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		if(driver.getPageSource().contains("A")==true) {
		} else {
			fail("ERROR: Didn't got to third page of game");
		}

		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
		this.ChooseAnswerGame.click();
		Thread.sleep(1000);

		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonGame("btnnext");
		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
		this.GameNextButtonIn.click();
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
	}

//Error Handling
	//Error Handling
	
//1	
//1
	@Test
	void WriteTheQuestionInHebrew() { 
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("שלום");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("First question input - V");
		}
		catch (Exception e) {
		System.out.println("First question input - ERROR");
		}
	}
//2
//2
	@Test
	void WriteTheQuestionInEnslishAndNumbers() {
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("hello12hello");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("First question input - V");
		}
		catch (Exception e) {
		System.out.println("First question input - ERROR");
		}
	}
//3
//3
	@Test
	void WriteTheQuestionInEnslishAndSymbols() {
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("hello!!hello");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("First question input - V");
		}
		catch (Exception e) {
		System.out.println("First question input - ERROR");
		}
	}
//4
//4
	@Test
	void WtireTheAnswersInHebrew() { //BUG- Able to proceed
	
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("א");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("ב");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("ג");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("ד");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("Fill the answers field (1) - V");
		}
		catch (Exception e) {
		System.out.println("Fill the answers field(1) - ERROR");
		}
	}
//5
//5
	@Test
	void WtireAnAnswerInEnslishAndNumbers() {
	
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("a1a");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("b1b");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("c1c");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("d1d");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("Fill the question field (1) - V");
		}
		catch (Exception e) {
		System.out.println("Fill the question field(1) - ERROR");
		}
	}
//6
//6
	@Test
	void WtireTheAnswersInEnslishAndSymbols() {
	
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("a@a");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("b@b");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("c@c");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("d@d");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("Fill the question field (1) - V");
		}
		catch (Exception e) {
		System.out.println("Fill the question field(1) - ERROR");
		}
	}
//7
//7
	@Test
	void PressNextBeforeChoosingAnAnswer() { 
	
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("Fill the question field (1) - V");
		}
		catch (Exception e) {
		System.out.println("Fill the question field(1) - ERROR");
		}
	}
//8
//8
	@Test
	void PressNextBeforeWritingFirestQuestion() { 

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("First question input - V");
		}
		catch (Exception e) {
		System.out.println("First question input - ERROR");
		}
	}
//9
//9
	@Test
	void PressNextBeforeWritingSecondQuestion() {

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			
			assertTrue(driver.getPageSource().contains("question"));	
			System.out.println("second question input - V");
			}
			catch (Exception e) {
			System.out.println("second question input - ERROR");
			}		
	}
//10
//10
	@Test
	void PressNextBeforeWritingThirdQuestion() {
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
		
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}

		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			
			assertTrue(driver.getPageSource().contains("question"));	
			System.out.println("3rd question input - V");
			}
			catch (Exception e) {
			System.out.println("3rd question input - ERROR");
			}	
	}
//11
//11
	@Test
	void PressNextBeforeWritingAnAnswerFirstPage () {
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		assertTrue(driver.getPageSource().contains("question"));	
		System.out.println("Fill the question field (1) - V");
		}
		catch (Exception e) {
		System.out.println("Fill the question field(1) - ERROR");
		}
	}
//12
//12
	@Test
	void PressNextBeforeWritingAnAnswerSecondPage () {

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			assertTrue(driver.getPageSource().contains("question"));	
			System.out.println("Fill the question field (1) - V");
			}
			catch (Exception e) {
			System.out.println("Fill the question field(1) - ERROR");
			}
	}
//13
//13
	@Test
	
	void PressNextBeforeWritingAnAnswerThirdPage () {
	
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			assertTrue(driver.getPageSource().contains("play!!"));	
			System.out.println("Start Playing!");
			}
			catch (Exception e) {
			System.out.println("You didn't played");
			}
	}
//14
//14
	@Test
	 void EnterSpaceInTeheQuestionFields () { //BUG- Able to proceed .. ASSERT?

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys(" ");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys(" ");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys(" ");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			assertTrue(driver.getPageSource().contains("play!!"));	//איך לכתוב את הAssert?
			System.out.println("Start Playing!");
			}
			catch (Exception e) {
			System.out.println("");
			}
	}
//15
//15
	@Test
	 void EnterSpaceInTeheAnswersFields () {  //BUG- Able to proceed

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys(" ");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys(" ");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys(" ");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys(" ");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys(" ");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys(" ");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys(" ");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys(" ");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys(" ");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys(" ");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys(" ");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys(" ");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			assertTrue(driver.getPageSource().contains("play!!"));	
			System.out.println("Start Playing!");
			}
			catch (Exception e) {
			System.out.println("You didn't played");
			}	
	}
//16
//16
	@Test
	void ExitFromThePageWhileFillingTheQuestions() { //NOT DONE

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			driver.close();
			assertTrue(driver.getPageSource().contains(" "));	//?

		}
		catch (Exception e) {
			System.out.println(""); //?
			}			
	}
//17
//17
	@Test
	void RunSanityOffLine () {       
	

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		
		assertTrue(driver.getPageSource().contains("אין אינטרנט"));	
		System.out.println("Connect to the internet");
		}
		catch (Exception e) {
		System.out.println("Offline test has failed!");
		}
	}
//18
//18
	@Test 
	void FillTheSecondAnswerPageInHebrew() { //BUG- Able to proceed
		
		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
	
	
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("א");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("ב");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("ג");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("ד");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			assertTrue(driver.getPageSource().contains("question"));	
			System.out.println("Fill the anwers field (1) - V");
			}
			catch (Exception e) {
			System.out.println("Fill the anwers field(1) - ERROR");
			}	
		}
//19	
//19
	@Test
	void FillTheThirdAnswerPageInHebrew() { //BUG- Able to proceed

		try {			
			this.driver.get(MyClass.myPath);
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Test")==true) {
			}
			else {
				fail("Home page- Error");
			}
	
	
		MyClass.setStartButton("startB");
		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
		this.Start.click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to first question page");
		}
		
		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
		this.QuestionInput.sendKeys("A?");       
		Thread.sleep(1000);

		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("possible")==true) {
		} else {
			fail("ERROR: Didn't got to first build answers page");
		}


		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
		this.WriteAnswer.sendKeys("A");
		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
		this.WriteAnswer1.sendKeys("B");
		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
		this.WriteAnswer2.sendKeys("C");
		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
		this.WriteAnswer3.sendKeys("D");
		Thread.sleep(1000);
		
		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
		this.MarkAnswer1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		MyClass.setNextButtonBuildGame("nextquest");
		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
		this.NextButtonBuildGame.click();
		
		if(driver.getPageSource().contains("Please")==true) {
		} else {
			fail("ERROR: Didn't got to Second question page");
		}

			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("possible")==true) {
			} else {
				fail("ERROR: Didn't got to second build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("A");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("B");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("C");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("D");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third question page");
			}
 
			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			Thread.sleep(1000);
			if(driver.getPageSource().contains("Please")==true) {
			} else {
				fail("ERROR: Didn't got to third build answers page");
			}	
		
			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
			this.WriteAnswer.sendKeys("א");
			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
			this.WriteAnswer1.sendKeys("ב");
			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
			this.WriteAnswer2.sendKeys("ג");
			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
			this.WriteAnswer3.sendKeys("ד");
			Thread.sleep(1000);
			
			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			MyClass.setNextButtonBuildGame("nextquest");
			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			assertTrue(driver.getPageSource().contains("3"));	
			System.out.println("Didn't accept Hebrew");
			}
			catch (Exception e) {
			System.out.println("Accept Hebew");
			}
	}
	
//Integration
	//Integration
	
     @Test
   void IntegrationWithFaceBook () { //  BUG- Error 404  .. ASSERT?
    		
 		try {			
 			this.driver.get(MyClass.myPath);
 			Thread.sleep(2000);
 			if(driver.getPageSource().contains("Test")==true) {
 			}
 			else {
 				fail("Home page- Error");
 			}
 		

 		MyClass.setStartButton("startB");
 		this.Start = driver.findElement(By.id(MyClass.getStartButton()));
 		this.Start.click();
 		Thread.sleep(1000);
 		if(driver.getPageSource().contains("Please")==true) {
 		} else {
 			fail("ERROR: Didn't got to first question page");
 		}
 		
 	
 		this.QuestionInput = driver.findElement(By.name(MyClass.getQuestion()));    
 		this.QuestionInput.sendKeys("A?");       
 		Thread.sleep(1000);

 		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
 		this.NextButtonBuildGame.click();
 		Thread.sleep(2000);
 		if(driver.getPageSource().contains("possible")==true) {
 		} else {
 			fail("ERROR: Didn't got to first build answers page");
 		}
 		

 		
 		this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
 		this.WriteAnswer.sendKeys("A");
 		this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
 		this.WriteAnswer1.sendKeys("B");
 		this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
 		this.WriteAnswer2.sendKeys("C");
 		this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
 		this.WriteAnswer3.sendKeys("D");
 		Thread.sleep(1000);

 		this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
 		this.MarkAnswer1.click();
 		Thread.sleep(1000);

 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 		MyClass.setNextButtonBuildGame("nextquest");
 		this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
 		this.NextButtonBuildGame.click();

 		if(driver.getPageSource().contains("Please")==true) {
 		} else {
 			fail("ERROR: Didn't got to Second question page");
 		}
 	
 			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
 			this.QuestionInput.findElement(By.name("question")).sendKeys("B?");
 			Thread.sleep(1000);

 			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
 			this.NextButtonBuildGame.click();
 			Thread.sleep(1000);
 			if(driver.getPageSource().contains("possible")==true) {
 			} else {
 				fail("ERROR: Didn't got to second build answers page");
 			}
 		

 	
 			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
 			this.WriteAnswer.sendKeys("A");
 			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
 			this.WriteAnswer1.sendKeys("B");
 			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
 			this.WriteAnswer2.sendKeys("C");
 			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
 			this.WriteAnswer3.sendKeys("D");
 			Thread.sleep(1000);
 			
 			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
 			this.MarkAnswer1.click();
 			Thread.sleep(1000);
 			
 			JavascriptExecutor js1 = (JavascriptExecutor) driver;
 			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 			MyClass.setNextButtonBuildGame("nextquest");
 			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
 			this.NextButtonBuildGame.click();
 			
 			if(driver.getPageSource().contains("Please")==true) {
 			} else {
 				fail("ERROR: Didn't got to third question page");
 			}
 	
 			this.QuestionInput = driver.findElement(By.id(MyClass.getQuestion()));
 			this.QuestionInput.findElement(By.name("question")).sendKeys("C?");
 			Thread.sleep(1000);

 			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
 			this.NextButtonBuildGame.click();
 			Thread.sleep(1000);
 			if(driver.getPageSource().contains("Please")==true) {
 			} else {
 				fail("ERROR: Didn't got to third build answers page");
 			}
 	
 			this.WriteAnswer = driver.findElement(By.xpath(MyClass.getAnswerFieldA()));
 			this.WriteAnswer.sendKeys("A");
 			this.WriteAnswer1 = driver.findElement(By.xpath(MyClass.getAnswerFieldB()));
 			this.WriteAnswer1.sendKeys("B");
 			this.WriteAnswer2 = driver.findElement(By.xpath(MyClass.getAnswerFieldC()));
 			this.WriteAnswer2.sendKeys("C");
 			this.WriteAnswer3 = driver.findElement(By.xpath(MyClass.getAnswerFieldD()));
 			this.WriteAnswer3.sendKeys("D");
 			Thread.sleep(1000);
 			
 			this.MarkAnswer1 = driver.findElement(By.xpath(MyClass.getMarkAnswer1()));
 			this.MarkAnswer1.click();
 			Thread.sleep(1000);
 			
 			JavascriptExecutor js2 = (JavascriptExecutor) driver;
 			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 			MyClass.setNextButtonBuildGame("nextquest");
 			this.NextButtonBuildGame = driver.findElement(By.id(MyClass.getNextButtonBuildGame()));
 			this.NextButtonBuildGame.click();
 			if(driver.getPageSource().contains("finished")==true) {
 			} else {
 				fail("ERROR: Didn't got to main page before palying");
 			}

 			
 			this.Play = driver.findElement(By.xpath(MyClass.getPlayButton()));
 			this.Play.click();
 			if(driver.getPageSource().contains("C")==true) {
 			} else {
 				fail("ERROR: Didn't got to first page of game");
 			}
 	 
 			
 			this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame11()));
 			this.ChooseAnswerGame.click();
 			Thread.sleep(1000);

 			JavascriptExecutor js5 = (JavascriptExecutor) driver;
 			js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 			MyClass.setNextButtonGame("btnnext");
 			this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
 			this.GameNextButtonIn.click();
 			if(driver.getPageSource().contains("B")==true) {
 			} else {
 				fail("ERROR: Didn't got to second page of game");
 			}


 		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame21()));
 		this.ChooseAnswerGame.click();
 		Thread.sleep(1000);

 		JavascriptExecutor js3 = (JavascriptExecutor) driver;
 		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 		MyClass.setNextButtonGame("btnnext");
 		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
 		this.GameNextButtonIn.click();
 		if(driver.getPageSource().contains("A")==true) {
 		} else {
 			fail("ERROR: Didn't got to third page of game");
 		}

 		
 		this.ChooseAnswerGame = driver.findElement(By.xpath(MyClass.getChooseAnswerGame31()));
 		this.ChooseAnswerGame.click();
 		Thread.sleep(1000);

 		JavascriptExecutor js4 = (JavascriptExecutor) driver;
 		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 		MyClass.setNextButtonGame("btnnext");
 		this.GameNextButtonIn = driver.findElement(By.id(MyClass.getNextButtonInGame()));
 		this.GameNextButtonIn.click();
 		if(driver.getPageSource().contains("Sucsses")==true) {
 		} else {
 			fail("ERROR: Didn't got to last page of game/ result is wrong");
 		}
 
		this.FacebookButton = driver.findElement(By.xpath(MyClass.getFacebookButton()));
		this.FacebookButton.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		assertTrue(driver.getPageSource().contains("404"));	
		System.out.println("Test has faild");
		}
		catch (Exception e) {
		System.out.println("Check if the pop up for facebook came up");   // ASSERT איך?
			}
		}
//Compatibility
     //Compatibility
     @Test
   void Before11 () throws InterruptedException { // להשלים עם שם
   try {
    	 WebDriver driver = new InternetExplorerDriver();
    		driver.get("https://svcollegetest.000webhostapp.com/");
    		driver.manage().window().maximize();
    		Thread.sleep(3000);
	}
	catch (Exception e) {
		System.out.println("FATAL ERROR");
     }
     }

     //Sanity
}
	
					
	
	

