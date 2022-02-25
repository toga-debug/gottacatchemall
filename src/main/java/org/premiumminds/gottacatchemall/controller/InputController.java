package org.premiumminds.gottacatchemall.controller;

import org.premiumminds.gottacatchemall.business.PokemonBusiness;
import org.premiumminds.gottacatchemall.mapper.RouteMapper;
import org.premiumminds.gottacatchemall.model.Route;
import org.premiumminds.gottacatchemall.model.Trainer;

public class InputController {
    private Trainer trainer = new Trainer();
    private RouteMapper routeMapper = new RouteMapper();
    private PokemonBusiness pokemonBusiness = new PokemonBusiness();

    public int processInput(String input) {
        Route route = routeMapper.createRoute(input);

        return pokemonBusiness.execute(trainer, route);
    }
}
