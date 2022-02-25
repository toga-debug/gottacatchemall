package org.premiumminds.gottacatchemall.mapper;

import org.premiumminds.gottacatchemall.model.Route;

public class RouteMapper {
    public Route createRoute(String input){

        return mapInputToRoute(input);
    }

    private Route mapInputToRoute(String input){
        char[] routeString=input.toCharArray();
        Route route = new Route();

        for(int i=0;i< routeString.length;i++){
            DirectionMapper directionMapper=new DirectionMapper();
            route.addDirection(directionMapper.createDirection(routeString[i]));
        }
        return route;

    }
}
