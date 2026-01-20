package com.ratultester.RestfulBooker_CRUD.GET.BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class getOperationBDDStyle {
    @Test
    public void getRequestBDDStyle(){
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking").log().all()

                .when().log().all().get()

                .then().log().all().statusCode(200);
    }
}
