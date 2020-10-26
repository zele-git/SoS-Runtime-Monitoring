package runtimeproperty.pattern;

import log.Snapshot;
import runtimeproperty.Event;
import runtimeproperty.RuntimeProperty;
import runtimeproperty.Scope;

import java.util.StringTokenizer;

public class RuntimeExistence extends RuntimeProperty {
    Event targetEvent;

    public RuntimeExistence(Event event, Scope scope) {
        super(scope);
        this.targetEvent = event;
        this.name = event.getName() + " holds eventually";
    }

    protected void evaluateState(Snapshot snapshot) {
        this.isHolding = targetEvent.checkHold(snapshot);

        if (isHolding) {
            this.beConfirmed(snapshot);
        }
    }
}
