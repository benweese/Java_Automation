package APITesting;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@RunWith(DataProviderRunner.class)
public class SwapiAPITest {
    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @DataProvider
    public static Object[][] episodesAndNames() {
        return new Object[][]{
                {1, 4, "A New Hope"},
                {2, 5, "The Empire Strikes Back"},
                {3, 6, "Return of the Jedi"},
                {4, 1, "The Phantom Menace"},
                {5, 2, "Attack of the Clones"},
                {6, 3, "Revenge of the Sith"},
                {7, 7, "The Force Awakens"},
                {8, 8, "The Last Jedi"},
                {9, 9, "Rise of Skywalker"}
        };
    }

    @BeforeClass
    public static void createRequestSpecification() {
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://swapi.co/").
                setBasePath("api/films/").
                build();
    }

    @BeforeClass
    public static void createResponseSpecification() {
        responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build();
    }

    @Test
    @UseDataProvider("episodesAndNames")
    public void episode_test(int ID, int episode, String title) {
        given().
                spec(requestSpec).
                pathParam("id", ID).
        when().
                get("/{id}").
        then().
                spec(responseSpec).
        and().
                assertThat().
                body("episode_id", equalTo(episode)).
        and().
                assertThat().
                body("title", equalTo(title));
    }
}
