package org.premiumminds.gottacatchemall.business;

import org.premiumminds.gottacatchemall.model.Route;
import org.premiumminds.gottacatchemall.model.Trainer;

public class PokemonBusiness {

    public int execute(Trainer trainer, Route route){
       for (int i=0; i<route.getRoute().size();i++){
           switch (route.getRoute().get(i)){
               case NORTH:
                   trainer.MoveNorth();
                   catchingPokemon(trainer);
                   break;
               case EAST:
                   trainer.MoveEast();
                   catchingPokemon(trainer);
                   break;
               case WEST:
                   trainer.MoveWest();
                   catchingPokemon(trainer);
                   break;
               case SOUTH:
                   trainer.MoveSouth();
                   catchingPokemon(trainer);
                   break;
           }
        }
       return trainer.getPokemons();
    }

    private void catchingPokemon(Trainer trainer){
        if(!trainer.AlreadyVisitedLocation()){
            trainer.catchPokemons();
        }
    }
}
