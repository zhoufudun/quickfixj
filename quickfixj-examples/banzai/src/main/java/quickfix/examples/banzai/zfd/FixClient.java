package quickfix.examples.banzai.zfd;

import lombok.extern.slf4j.Slf4j;
import quickfix.*;

import java.io.InputStream;

@Slf4j
public class FixClient {

    /**
     * The Initiator.
     */
    private Initiator initiator = null;
    /**
     * The Initiator started.
     */
    private boolean initiatorStarted = false;

    /**
     * The Client application.
     */
    private FixClientApplication clientApplication;

    /**
     * Start.
     */
    public FixClient(FixClientApplication clientApplication) {
        this.clientApplication = clientApplication;
        try (InputStream inputStream = FixClient.class.getResourceAsStream("/quickfix/examples/banzai/zfd_client.cfg")) {
            SessionSettings settings = new SessionSettings(inputStream);
//            MessageStoreFactory storeFactory = new FileStoreFactory(settings);
            MessageStoreFactory storeFactory1 = new MemoryStoreFactory();
            LogFactory logFactory = new FileLogFactory(settings);
            MessageFactory messageFactory = new DefaultMessageFactory();
            initiator = new SocketInitiator(clientApplication, storeFactory1, settings, logFactory, messageFactory);
            logon();
        } catch (Exception e) {
            log.error("start failed", e);
        }
    }

    /**
     * Logon.
     */
    public synchronized void logon() {
        if (!initiatorStarted) {
            try {
                initiator.start();
                initiatorStarted = true;
                log.warn("fix client started!");
            } catch (Exception e) {
                log.error("logon failed", e);
            }
        } else {
            for (SessionID sessionId : initiator.getSessions()) {
                Session.lookupSession(sessionId).logon();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        FixClient fixClient = new FixClient(new FixClientApplication());

        Thread.currentThread().join();
    }

}
