package serverwofacade;

public class shutdownServer {
    public void releaseProcesses() {
        System.out.println("Releasing processes...");
    }

    public void destory() {
        System.out.println("Destorying...");
    }

    public void destroySystemObjects() {
        System.out.println("Destroying system objects...");
    }

    public void destoryListeners() {
        System.out.println("Destroying listeners...");
    }

    public void destoryContext() {
        System.out.println("Destroying context...");
    }

    public void shutdown() {
        System.out.println("Shutting down...");
    }
}
