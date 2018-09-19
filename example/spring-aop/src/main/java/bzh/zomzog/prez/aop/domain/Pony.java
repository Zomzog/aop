package bzh.zomzog.prez.aop.domain;


public class Pony {

    private int distance = 0;

    public boolean makeItWalk(int distance){
        this.distance += distance;
        return true;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Pony{" +
                "distance=" + distance +
                '}';
    }
}
