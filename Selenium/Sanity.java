import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


class Sanity extends initClass { 

	
	@Test
	void testOpenBrowser() throws InterruptedException {
		
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
		assertTrue(driver.getPageSource().contains("Sucsses"));	
		System.out.println("EXELENTE!");
		}
		catch (Exception e) {
		System.out.println("GAME OVER");
		}
		}
}