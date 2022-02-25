package org.premiumminds.gottacatchemall.mapper;

import org.premiumminds.gottacatchemall.exception.InvalidDirectionException;
import org.premiumminds.gottacatchemall.model.Direction;

public class DirectionMapper {
    public Direction createDirection(char direction){
        switch (direction){
            case 'N':
                return Direction.NORTH;
            case 'S':
                return Direction.SOUTH;
            case 'E':
                return Direction.EAST;
            case 'O':
                return Direction.WEST;
            default:
                throw new InvalidDirectionException("Invalid direction " +direction);
        }
    }
}
