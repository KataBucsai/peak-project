import static spark.Spark.*;
import static spark.debug.DebugScreen.enableDebugScreen;

import controller.GameController;
import spark.Request;
import spark.Response;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class Main {

    public static void main(String[] args) {
        exception(Exception.class, (e, req, res) -> e.printStackTrace());
        staticFileLocation("/public");
        port(8888);

        get("/index", (Request req, Response res) -> {
            return new ThymeleafTemplateEngine().render( GameController.renderGames(req, res) );
        });
      
        enableDebugScreen();
    }


}
