package org.premiumminds.gottacatchemall.model;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private List<Direction> route= new ArrayList<>();

    public void addDirection(Direction direction){
        this.route.add(direction);

    }
    public List<Direction> getRoute(){
        return route;
    }


}
