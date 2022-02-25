package gottacatchemall.mapperTester;

import org.junit.Test;
import org.premiumminds.gottacatchemall.exception.InvalidDirectionException;
import org.premiumminds.gottacatchemall.mapper.DirectionMapper;
import org.premiumminds.gottacatchemall.model.Direction;

import static org.assertj.core.api.Assertions.*;

public class DirectionMapperTest {
    static final char VALID_DIRECTION_NORTH = 'N';
    static final char VALID_DIRECTION_SOUTH = 'S';
    static final char VALID_DIRECTION_EAST = 'E';
    static final char VALID_DIRECTION_WEST = 'O';
    static final char INVALID_DIRECTION = 'X';

    private DirectionMapper directionMapper = new DirectionMapper();

    @Test
    public void givenDirectionStringNorth_WhenMapped_validDirectionIsReturned(){
       Direction direction = directionMapper.createDirection(VALID_DIRECTION_NORTH);

       assertThat(direction).isEqualTo(Direction.NORTH);
    }

    @Test
    public void givenDirectionStringSouth_WhenMapped_validDirectionIsReturned(){
        Direction direction = directionMapper.createDirection(VALID_DIRECTION_SOUTH);

        assertThat(direction).isEqualTo(Direction.SOUTH);
    }

    @Test
    public void givenDirectionStringEast_WhenMapped_validDirectionIsReturned(){
        Direction direction = directionMapper.createDirection(VALID_DIRECTION_EAST);

        assertThat(direction).isEqualTo(Direction.EAST);
    }

    @Test
    public void givenDirectionStringWest_WhenMapped_validDirectionIsReturned(){
        Direction direction = directionMapper.createDirection(VALID_DIRECTION_WEST);

        assertThat(direction).isEqualTo(Direction.WEST);
    }

    @Test
    public void givenInvalidDirectionString_WhenMapped_InvalidDirectionIsThrown(){
        assertThatExceptionOfType(InvalidDirectionException.class).isThrownBy(() -> directionMapper.createDirection(INVALID_DIRECTION));
    }

}
