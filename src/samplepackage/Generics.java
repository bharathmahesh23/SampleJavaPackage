package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Generics {

	public void Select_The_Checkbox(WebElement element){
		try{
			if(element.isSelected()){
				System.out.println("Checkbox: "+ "is already selected");
			}else{
				element.click();
			}
		}catch(Exception e){
			System.out.println("Unable to select the checkbox: "+element);
		}
	}
	
	public void Deselect_The_Checkbox(WebElement element){
		try{
			if(element.isSelected()){
				element.click();
			}else{
				System.out.println("Checkbox: "+element+"is already deselected");
			}
		}catch(Exception e){
			System.out.println("Unable to deselect checkbox: "+element);
		}
	}
	
	public void Select_The_Checkbox_from_List(WebElement element,String valueToSelect){
		List<WebElement> allOptions=element.findElements(By.tagName("input"));
		for(WebElement option:allOptions){
			System.out.println("Option value "+option.getText());
			if(valueToSelect.equals(option.getText())){
				option.click();
				break;
			}
		}
	}
}
