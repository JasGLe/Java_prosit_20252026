package tn.esprit.gestionzoo.entities;

public final class Dolphin extends Aquatiques{
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed =swimmingSpeed;
    }

    @Override
    public String toString(){
        return super.toString() + "\n swimmingSpeed : "+swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}