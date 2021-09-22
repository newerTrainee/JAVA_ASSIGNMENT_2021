public class Q13 {
    public static void main(String[] args){
        try {
            throw new SuppressableStacktraceException("Not suppressed", false);
        } catch (SuppressableStacktraceException e) {
            e.printStackTrace();
        }
        try {
            throw new SuppressableStacktraceException("Suppressed", true);
        } catch (SuppressableStacktraceException e) {
            e.printStackTrace();
        }
    }

}
class SuppressableStacktraceException extends Exception {

    private boolean suppressStacktrace = false;

    public SuppressableStacktraceException(String message, boolean suppressStacktrace) {
        super(message, null, suppressStacktrace, !suppressStacktrace);
        this.suppressStacktrace = suppressStacktrace;
    }

    @Override
    public String toString() {
        if (suppressStacktrace) {
            return getLocalizedMessage();
        } else {
            return super.toString();
        }
    }
}