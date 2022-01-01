package ya.baytsan;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentsRegistrationForm {

@Test
    void shouldCheckRegistrationForm(){
    //открыть ссылку
    //
    open("https://demoqa.com/automation-practice-form");
    $("#firstName").setValue("aaa").pressEnter();
    $("#lastName").setValue("bbb").pressEnter();
    $("#userEmail").setValue("aaa@bbb.dd").pressEnter();
    $("#genterWrapper").$(byText("Male")).click();
    $("#userNumber").setValue("8999999999").pressEnter();



}
}
