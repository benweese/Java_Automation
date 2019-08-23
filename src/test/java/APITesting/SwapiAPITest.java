package APITesting;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class SwapiAPITest {
    private String url = "https://swapi.co/";

    private void episode_test(int ID, int episode, String title) {
        given()
                .baseUri(url)
                .basePath("api/films/")
                .pathParam("id", ID).
                when().
                get("/{id}").
                then().
                assertThat().
                body("title", equalTo(title))
                .and()
                .assertThat().
                body("episode_id", equalTo(episode))
                .and()
                .statusCode(200);

    }

    @Test
    public void newHope() {
        episode_test(1, 4, "A New Hope");
    }

    @Test
    public void empire() {
        episode_test(2, 5, "The Empire Strikes Back");
    }

    @Test
    public void jediReturn() {
        episode_test(3, 6, "Return of the Jedi");
    }

    @Test
    public void phantomMenace() {
        episode_test(4, 1, "The Phantom Menace");
    }

    @Test
    public void cloneAttack() {
        episode_test(5, 2, "Attack of the Clones");
    }

    @Test
    public void sithRevenge() {
        episode_test(6, 3, "Revenge of the Sith");
    }

    @Test
    public void forceAwakens() {
        episode_test(7, 7, "The Force Awakens");
    }

    @Test
    public void lastJedi() {
        episode_test(8, 8, "The Last Jedi");
    }

    @Test
    public void skywalkerRises() {
        episode_test(9, 9, "The Rise of Skywalker");
    }
}
