package bzh.zomzog.prez.aop.domain;

import bzh.zomzog.prez.aop.Slow;

@Slow
public class Unicorn extends Pony {

    public Unicorn(String name) {
        super(name);
    }

    @Override
    public boolean makeItWalk(int distance) {
        return super.makeItWalk(distance);
    }
}
