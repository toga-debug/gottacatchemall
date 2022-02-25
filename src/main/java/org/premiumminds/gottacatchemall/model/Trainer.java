package org.premiumminds.gottacatchemall.model;

import org.premiumminds.gottacatchemall.model.Position;

import java.util.HashSet;

public class Trainer {

    private Position position;
    private int pokemons;
    private HashSet<Position> visitedPosition;

    public Trainer(){
        this.position=new Position(0,0);
        this.pokemons=1;
        this.visitedPosition=new HashSet<>();
        visitedPosition.add(this.position);
    }
    public void MoveNorth(){
       this.position = new Position(this.position.getX()+1,this.position.getY());
    }
    public void MoveSouth(){
        this.position=new Position(this.position.getX()-1,this.position.getY());
    }

    public void MoveEast(){
        this.position=  new Position(this.position.getX(),this.position.getY()+1);
    }

    public void MoveWest(){
        this.position= new Position(this.position.getX(),this.position.getY()-1);
    }

    public int getPokemons(){
        return this.pokemons;
    }

    public void catchPokemons(){
        this.pokemons++;
        visitedPosition.add(this.position);
    }

    public boolean AlreadyVisitedLocation(){
        if(visitedPosition.contains(this.position)){
            return true;
        }else{
            return false;
        }
    }

}
