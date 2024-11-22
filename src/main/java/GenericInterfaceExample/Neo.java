package GenericInterfaceExample;

public class Neo<K> extends LogicCode<K>{


    public Neo(K uiComponent, K backendComponent) {
        super(uiComponent, backendComponent);
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
