package Adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeed() {
        return converMPHtoKMPH(movable.getSpeed());
    }

    private double converMPHtoKMPH(double speed) {
        return speed * 1.60934;
    }
}
