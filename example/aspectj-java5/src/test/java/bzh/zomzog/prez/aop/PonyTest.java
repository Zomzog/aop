package bzh.zomzog.prez.aop;


import bzh.zomzog.prez.aop.domain.Pegasus;
import bzh.zomzog.prez.aop.domain.Pony;
import bzh.zomzog.prez.aop.domain.Unicorn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;


public class PonyTest {
    @Test
    public void make_walk_100_is_good_for_pegasus() {
        Pegasus pegasus = new Pegasus("Rainbow Dash");
        
        // When
        pegasus.makeItWalk(100);

        // Then
        assertThat(pegasus.getDistance()).isEqualTo(100);
    }

    @Test
    public void make_walk_100_is_too_long_for_unicorns() {
        try {
            // When
            Unicorn unicorn = new Unicorn("Rarity");
            unicorn.makeItWalk(100);
            failBecauseExceptionWasNotThrown(RuntimeException.class);
        } catch (RuntimeException e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }
}