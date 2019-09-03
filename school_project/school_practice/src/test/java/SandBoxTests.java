/*
 * @(#)SandBoxTests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SandBoxTests {

    private static RequestSpecification spec;

    @BeforeAll
    public static void init() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setProxy("gate.swissre.com", 9443)
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @Test
    public void simpleBackEndTest(){
        Users[] users  = given()
                .spec(spec)
                .when()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(Users[].class);

        Posts[] posts  = given()
                .spec(spec)
                .when()
                .get("posts")
                .then()
                .statusCode(200)
                .extract().as(Posts[].class);

        assertTrue(Arrays.stream(posts).anyMatch(p -> p.getBody().startsWith("odio fugit voluptatum ducimus earum autem est incidunt")));
        assertTrue(Arrays.stream(users).anyMatch(u -> u.getName().equals("Chelsey Dietrich")));

        //        assertEquals(UsersId,PostId);

        //        int i =1;
        //        for (Posts post : posts){
        //            i = i +1;
        //            System.out.println(i);
        //            System.out.println(post.getBody());
        //        }






    }
}