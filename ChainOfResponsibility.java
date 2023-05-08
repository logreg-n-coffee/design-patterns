public class ChainOfResponsibility {
    static abstract class Handler {
        protected Handler successor;

        public void setSuccessor(Handler successor) {
            this.successor = successor;
        }

        abstract void handleRequest(int request);
    }

    static class ConcreteHandler1 extends Handler {
        void handleRequest(int request) {
            if (request < 10) {
                System.out.println("Handled by ConcreteHandler1");
            } else if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
