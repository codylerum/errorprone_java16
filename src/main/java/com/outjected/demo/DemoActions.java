package com.outjected.demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@RequestScoped
public class DemoActions {

    @Inject
    private EventLogActions eventLogActions;

    @Inject
    private CommentActions commentActions;

    @Transactional
    public void execute() {
        eventLogActions.create();
        commentActions.create();
    }

}
