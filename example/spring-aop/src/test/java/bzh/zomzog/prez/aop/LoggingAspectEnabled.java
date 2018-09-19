package bzh.zomzog.prez.aop;


import bzh.zomzog.prez.aop.domain.Pony;
import bzh.zomzog.prez.aop.service.PonyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("loggingAspect")
public class LoggingAspectEnabled {

    private PonyService service;

    @BeforeEach
    public void before() {
        service = new PonyService();
    }

    @Test
    public void make_walk_5_is_ok() {
        // Given
        Pony pony = new Pony();

        // When
        service.makeItWalk(pony);

        // Then
        assertThat(pony.getDistance()).isEqualTo(5);
    }
}