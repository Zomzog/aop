package bzh.zomzog.prez.aop;

public aspect PonyAspect {

    pointcut callMakeItWalk(int distance, Pony pony) :
            call(boolean Pony.makeItWalk(int)) && args(distance) && target(pony);

    before(int distance, Pony pony) : callMakeItWalk(distance, pony) {
        if (distance > 10) {
            throw new RuntimeException("Distance is too long for a pony");
        }
    }

    boolean around(int distance, Pony pony) : callMakeItWalk(distance, pony) {
        long startTime = System.nanoTime();
        boolean result = proceed(distance, pony);
        long endTime = System.nanoTime();
        System.out.println("Duration : " + (endTime-startTime));
        return result;
    }

    after(int distance, Pony pony) : callMakeItWalk(distance, pony) {
        System.out.println("After " + pony);
    }
}
