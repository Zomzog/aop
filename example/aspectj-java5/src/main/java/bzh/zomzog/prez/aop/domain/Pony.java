package bzh.zomzog.prez.aop.domain;


public abstract class Pony {

    private final String name;

    private int distance = 0;

    public Pony(String name) {
        this.name = name;
    }

    public boolean makeItWalk(int distance){
        this.distance += distance;
        return true;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pony{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
