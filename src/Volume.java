// Understands imperial volumes
public class Volume {

    private final Length length;

    public Volume(float value, VolumeUnit unit) {
        this.length = new Length(value, unit);
    }


}
