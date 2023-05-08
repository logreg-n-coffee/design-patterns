class AbstractFactory {
    interface Button {
        void render();
    }

    static class WindowsButton implements Button {
        public void render() {
            System.out.println("Windows button rendered.");
        }
    }

    static class LinuxButton implements Button {
        public void render() {
            System.out.println("Linux button rendered.");
        }
    }

    interface ButtonFactory {
        Button createButton();
    }

    static class WindowsButtonFactory implements ButtonFactory {
        public Button createButton() {
            return new WindowsButton();
        }
    }

    static class LinuxButtonFactory implements ButtonFactory {
        public Button createButton() {
            return new LinuxButton();
        }
    }
}
