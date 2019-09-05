package creational;

class Door {
    // if final then we need constructor for immutable obj
    // if one or more variable is optional then we need multiple constructor
    private final float height;
    private final float width;
    private final String color;

    // The Builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor anti-pattern.
    // Builder pattern is useful when there could be several flavors of an object. Or when there are a lot of steps involved in creation of an object.
    private Door(final Builder builder) {
        height = builder.height;
        width = builder.width;
        color = builder.color;
    }

    static class Builder {
        private float height;
        private float width;
        private String color;

        Builder setHeight(final float height) {
            this.height = height;
            return this;
        }

        Builder setWidth(final float width) {
            this.width = width;
            return this;
        }

        Builder setColor(final String color) {
            this.color = color;
            return this;
        }

        Door create() {
            return new Door(this);
        }
    }
}

public class Builder {
    public static void main(String[] args) {
        // It simplifies object creation in very clean and readable way.
        new Door.Builder()
                .setHeight(80)
                .setWidth(32)
                .setColor("gray")
                .create();
    }
}
