public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override
    public void ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.println(this.getName() + " flies upward, altitude: " + this.altitude + " metres.");
        }
    }

    @Override
    public void glide(){
        System.out.print("glides into the air.");
    }

    @Override
    public void descend(int meters){
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + " flies downward, altitude: " + this.altitude + " metres.");
        }
    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 5) {
            this.flying = false;
            System.out.println(this.getName() + " atterrit sur le sol.");
        } else {
            System.out.println(this.getName() + " est trop haut, il ne peut pas atterrir.");
        }
    }
}
