package fusion.core;

public class FusionCore {
    private boolean _typeChanged = false;
    private int _typePriority;

    public double lastCalledTimeStamp = 0;

    public void setType(int type) {
        if (_typeChanged) return;
        _typeChanged = true;
        _typePriority = type;
    }

    public int getType() {
        return _typePriority;
    }

    public void useDependency(FusionCore core) {
    }
}
