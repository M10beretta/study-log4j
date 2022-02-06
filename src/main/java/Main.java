import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Main {
    private static int count;
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            run();
        }
    }

    private static void run() {
        while (++count <= 5) {
            logging();
            calculation(getRandom(), getRandom());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count = 0;
    }

    private static double getRandom() {
        return new Random().nextInt(-100, 100);
    }

    private static void logging() {
        LOG.always().log(count);
        LOG.trace("trace logger");
        LOG.debug("debug logger");
        LOG.info("info logger | log level: " + LOG.getLevel());
        LOG.warn("warn logger");
        LOG.error("error logger");
        LOG.fatal("fatal logger");

    }

    private static void calculation(double a, double b) {
        CalculationLog.plus(a, b);
        CalculationLog.minus(a, b);
        CalculationLog.multiple(a, b);
        CalculationLog.divide(a, b);
        CalculationLog.divide(a, 0);
        CalculationLog.divide(0, 0);
    }
}
