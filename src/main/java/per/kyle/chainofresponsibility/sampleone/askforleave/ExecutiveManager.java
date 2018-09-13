package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.HandlerRequest;

/**
 * ExecutiveManager
 */
public class ExecutiveManager extends Manager {

    @Override
    public void handleRequest(HandlerRequest handlerRequest) {
        if (handlerRequest instanceof AskForLeaveRequest) {
            System.out.println("总经理需要考虑一下");
        }
	}
}