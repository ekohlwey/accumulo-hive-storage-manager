package org.apache.accumulo.storagehandler.predicate.compare;

/**
 * Created with IntelliJ IDEA.
 * User: bfemiano
 * Date: 4/22/13
 * Time: 1:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class LessThan implements CompareOp {

    private PrimitiveCompare comp;

    public LessThan(){}

    public LessThan(PrimitiveCompare comp) {
        this.comp = comp;
    }

    @Override
    public void setPrimativeCompare(PrimitiveCompare comp) {
        this.comp = comp;
    }

    @Override
    public PrimitiveCompare getPrimativeCompare() {
        return comp;
    }

    @Override
    public boolean accept(byte[] val) {
        return comp.lessThan(val);
    }
}
