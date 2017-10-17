package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class GameController extends BaseController {
    public static ModelAndView renderGames(Request req, Response res) {
        Map params = new HashMap<>();
        params.put("games", initGames());
        System.out.println("params" + params.toString());
        return new ModelAndView(params, "product/index");
    }
}
