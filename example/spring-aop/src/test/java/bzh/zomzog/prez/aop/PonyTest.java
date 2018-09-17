package bzh.zomzog.prez.aop;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;


public class PonyTest {
    private Pony pony;

    @BeforeEach
    public void before() {
        pony = new Pony();
    }

    @Test
    public void make_walk_5_is_ok() {

        // When
        pony.makeItWalk(5);

        // Then
        assertThat(pony.getDistance()).isEqualTo(5);
    }

    @Test
    public void make_walk_100_is_too_long() {
        try {
            // When
            pony.makeItWalk(100);
            failBecauseExceptionWasNotThrown(RuntimeException.class);
        } catch (RuntimeException e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }
}