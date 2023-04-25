package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class Get_User_3 {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET user 3 endpoints")
    public String setApi3Endpoint(){

        return url + "users/3";
    }

    @Step("I send GET user 3 HTTP request")
    public void sendGet3HttpRequest(){
        SerenityRest.given()
                .when()
                .get(setApi3Endpoint());
    }


    @Step("I receive valid data user 3 for detail user")
    public void validateData3DetailUser(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(3)));
        restAssuredThat(response -> response.body("'data'.'first_name'", equalTo("Emma")));
    }
}
