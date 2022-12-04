package test;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class LoginNegativeTest {
    @Test
    public void loginTest(){
        open("https://project-tools.webphpdev.site/auth/login");
        $(By.id("loginform-email")).setValue("k4872319@gmail.com")
                .shouldBe(Condition.value("k4872319@gmail.com"));

        $(By.id("loginform-password")).setValue("qwerty1")
                .shouldBe(Condition.value("qwerty1"));

        $x("//button")
                .shouldBe(Condition.visible).click();

        $(By.cssSelector("#login-form > div.form-group.field-loginform-password.required.has-error > p"))
                .shouldBe(Condition.text("Incorrect email or password."));

    }
}
