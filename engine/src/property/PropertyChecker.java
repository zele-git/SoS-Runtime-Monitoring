package property;

import log.Log;
import log.Snapshot;

public abstract class PropertyChecker {
    /**
     * A method to evaluate a property satisfaction for a snapshot.
     *
     * @param snapshot             the snapshot
     * @param verificationProperty the verification property
     * @return the boolean
     */
// this method is for inherited classes' check call
    protected abstract boolean evaluateState(Snapshot snapshot, Property verificationProperty);

    protected abstract boolean evaluateState(Log log, Property verificationProperty);

    public abstract boolean check(Log log, Property verificationProperty);

    public abstract boolean check(Log log, Property verificationProperty, int until);

    public abstract boolean check(Log log, Property verificationProperty, double prob, int T);

    public abstract boolean check(Log log, Property verificationProperty, double prob, int t, int T);

    public abstract boolean check(Log log, Property verificationProperty, int t, int T);
}
