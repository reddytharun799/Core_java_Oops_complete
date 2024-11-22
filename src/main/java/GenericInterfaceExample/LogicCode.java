package GenericInterfaceExample;

public abstract class LogicCode<K> implements Appliaction<K> {
    private K uiComponent;
    private K backendComponent;

    public LogicCode(K uiComponent, K backendComponent){
        this.uiComponent=uiComponent;
        this.backendComponent=backendComponent;
    }

    public K getUiComponent() {
        return uiComponent;
    }

    @Override
    public K Servlets() {
        return null;
    }
   public abstract K FrontEndDesign();

    public abstract  K BackEnd();
    //===================================================

}
