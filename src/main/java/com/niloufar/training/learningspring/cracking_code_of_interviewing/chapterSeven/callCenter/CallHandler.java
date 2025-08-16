package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.callCenter;

import java.util.List;

public class CallHandler {
    private final int LEVEL = 3;

    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTORS = 2;
    List<List<Employee>> employeeLevels;
    List<List<Call>> callQueues;

    public CallHandler() {}
    //private com.niloufar.training.learningspring.java_features.streamAPI.Employee getHandlerForCall(Call call) {}
//
//    public <Caller> void dispatchCall(Caller caller) {
//        Call call = new Call(caller);
//        dispatchCall(call);
//    }

//    public void dispatchCall(Call call) {
//
//        com.niloufar.training.learningspring.java_features.streamAPI.Employee emp = getHandlerForCall(call);
//        if (emp != null) {
//            emp.receiveCall(call);
//            call.setHandler(emp);
//        } else {
//            /* Place the call into corresponding call queue according to its rank. */
//            call.reply("Please wait for free employee to reply");
//          //  callQueues.get(call.getRank().getValue()).add(call);
//        }
//    }

    public boolean assignCall(Employee emp) { return true;}

}
