import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CalculationLog {
    public static final Logger LOG = LogManager.getLogger(CalculationLog.class);

    private CalculationLog() {
    }

    public static void plus(double a, double b) {
        double res = a + b;
        LOG.info(a + " + " + b + " = " + res );
    }

    public static void minus(double a, double b) {
        double res = a - b;
        LOG.info(a + " - " + b + " = " + res );
    }

    public static void multiple(double a, double b) {
        double res = a * b;
        LOG.info(a + " × " + b + " = " + res );
    }

    public static void divide(double a, double b) {
        double res = a / b;
        LOG.info(a + " ÷ " + b + " = " + res );
    }
}
