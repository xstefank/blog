@Saga
public class AxonSaga {

    @StartSaga
    @SagaEventHandler(associationProperty = "myProp1")
    public void on(StartSagaEvent event) {
        ...
    }

    @EndSaga
    @SagaEventHandler(associationProperty = "myProp2")
    public void on(EndSagaEvent event) {
        ...
    }
}
