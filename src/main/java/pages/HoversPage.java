package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By imageBox = By.className("figure");
    private By imageCaptionBox = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    public ImageCaption hoverOverImage(int index ){
        WebElement figure = driver.findElements(imageBox).get(index-1);  // Although findElements method returns list,
                                                                        // but we have selected get method to select single option based on input index
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();   // at this step we have hovered over the image

        //now to access the text of the image after hovering, we could either create a separate page or create new class within this class also

        return new ImageCaption(figure.findElement(imageCaptionBox));  //here we have moved the handle to new class of the hover image text by passing WebElement as argument
    }

    public class ImageCaption{
        private WebElement caption;
        private By imageCaptionHeader = By.tagName("h5");
        private By imageCaptionProfileLink = By.linkText("View profile");

        public ImageCaption(WebElement caption){
            this.caption=caption;
        }

        public boolean captionIsDisplayed(){            //method to verify image caption box is displayed or not
            return caption.isDisplayed();
        }

        public String getImageCaptionHeader(){          //method to verify image caption header text
            return caption.findElement(imageCaptionHeader).getText();
        }

        public String getImageCaptionProfileLink(){         // method to get the link (actual)
            return caption.findElement(imageCaptionProfileLink).getAttribute("href");
        }

        public String getImageCaptionProfileLinkText(){
            return caption.findElement(imageCaptionProfileLink).getText();
        }
    }
}
