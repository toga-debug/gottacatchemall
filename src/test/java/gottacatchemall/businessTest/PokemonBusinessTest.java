package gottacatchemall.businessTest;

import org.junit.Test;
import org.premiumminds.gottacatchemall.business.PokemonBusiness;
import org.premiumminds.gottacatchemall.mapper.RouteMapper;
import org.premiumminds.gottacatchemall.model.Trainer;

import static org.assertj.core.api.Assertions.assertThat;

public class PokemonBusinessTest {
    private RouteMapper routeMapper = new RouteMapper();

    private int pokemonCatch_1 = 4;
    private String routeString_1 = "NESO";
    private int pokemonCatch_2 = 3;
    private String routeString_2 = "EE";
    private int pokemonCatch_3 = 2;
    private String routeString_3 = "NSNSNSNSNS";
    private int pokemonCatch_4 = 2;
    private String routeString_4 = "NSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNSNS";


    @Test
    public void testCases() {
        givenRouteAndTrainer_TheCorrectNumberOfPokemonsIsReturned(pokemonCatch_1, routeString_1);
        givenRouteAndTrainer_TheCorrectNumberOfPokemonsIsReturned(pokemonCatch_2, routeString_2);
        givenRouteAndTrainer_TheCorrectNumberOfPokemonsIsReturned(pokemonCatch_3, routeString_3);
        givenRouteAndTrainer_TheCorrectNumberOfPokemonsIsReturned(pokemonCatch_4, routeString_4);
    }

    private void givenRouteAndTrainer_TheCorrectNumberOfPokemonsIsReturned(int pokemonCatch, String routeString) {
        Trainer trainer = new Trainer();
        PokemonBusiness pokemonBusiness = new PokemonBusiness();

        assertThat(pokemonBusiness.execute(trainer, routeMapper.createRoute(routeString))).isEqualTo(pokemonCatch);

    }
}
