package bzh.zomzog.prez.aop.service;

import bzh.zomzog.prez.aop.domain.Pony;
import org.springframework.stereotype.Service;

@Service
public class PonyService {

    public void makeItWalk(final Pony pony) {
        pony.makeItWalk(5);
    }
}
