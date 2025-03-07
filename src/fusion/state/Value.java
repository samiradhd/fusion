package fusion.state;

import fusion.core.FusionCore;

public class Value<BaseType> extends FusionCore {
    public BaseType _valueHolder;

    public Value(BaseType value) {
        if (!(value instanceof BaseType) && (_valueHolder != null)) {
            // throw new Exception("You must have a proper type of value or include a null");
        } else {
            _valueHolder = value;
        }

        super.setType(1);
    }

    public BaseType get(boolean asDependency) {
        // dependency resolver
        return _valueHolder;
    }

    public BaseType get() {
        return get(true);
    }

    public void set(BaseType value) {
        if (value.equals(_valueHolder) || value == _valueHolder) return;
        
        boolean matching = false;

        if (matching) return;
        BaseType previousValue = _valueHolder;
        _valueHolder = value;

        // dependency resolver
    }

    public String toString() {
        if (_valueHolder!=null) {
            return _valueHolder.toString();
        } else return null;
    }
}
