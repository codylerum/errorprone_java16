package demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class Demo {

    @Inject
    private DemoActions demoActions;

    public void execute() {
        System.out.println("Executing");
        demoActions.execute();
    }
}
