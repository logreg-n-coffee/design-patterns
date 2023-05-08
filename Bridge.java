class Bridge {
    static interface Renderer {
        void renderShape(String shape);
    }

    static class VectorRenderer implements Renderer {
        public void renderShape(String shape) {
            System.out.println("Rendering vector " + shape);
        }
    }

    static class RasterRenderer implements Renderer {
        public void renderShape(String shape) {
            System.out.println("Rendering raster " + shape);
        }
    }

    static abstract class Shape {
        protected Renderer renderer;

        public Shape(Renderer renderer) {
            this.renderer = renderer;
        }

        abstract void draw();
    }

    static class Circle extends Shape {
        public Circle(Renderer renderer) {
            super(renderer);
        }

        void draw() {
            renderer.renderShape("circle");
        }
    }

}
