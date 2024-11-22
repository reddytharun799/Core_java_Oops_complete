package GenericInterfaceExample;

public class VItech<K> extends LogicCode<K>{
    public VItech(K UI, K Backendpy) {
        super(UI, Backendpy);
    }

    @Override
    public K FrontEndDesign() {
        return null;
    }

    @Override
    public K BackEnd() {
        return null;
    }
}
