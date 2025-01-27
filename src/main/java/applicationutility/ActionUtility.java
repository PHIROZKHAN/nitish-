package applicationutility;

import org.openqa.selenium.WebElement;

public interface ActionUtility {
	
	public void doubleclick(WebElement ele);
	public void click(WebElement ele);
	public void rightClick(WebElement ele);
	public void dragAndDrop(WebElement ele);
	public void mouseOver(WebElement ele);
	void singleClick(WebElement ele);

}
