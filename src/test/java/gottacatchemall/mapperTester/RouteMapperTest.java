package gottacatchemall.mapperTester;

import org.junit.Before;
import org.junit.Test;
import org.premiumminds.gottacatchemall.mapper.RouteMapper;
import org.premiumminds.gottacatchemall.model.Direction;
import org.premiumminds.gottacatchemall.model.Route;

import static org.assertj.core.api.Assertions.assertThat;

public class RouteMapperTest {

    static final String VALID_ROUTE = "NESO";

    private Route route= new Route();

    private RouteMapper routeMapper= new RouteMapper();

    @Before
    public void init(){
        this.route.addDirection(Direction.NORTH);
        this.route.addDirection(Direction.EAST);
        this.route.addDirection(Direction.SOUTH);
        this.route.addDirection(Direction.WEST);
    }

    @Test
    public void givenString_WhenMap_validRoutIsReturned(){
        Route validRoute= routeMapper.createRoute(VALID_ROUTE);

        assertThat(validRoute.getRoute()).isEqualTo(route.getRoute());
    }
}
