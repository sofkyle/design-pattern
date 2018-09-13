package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.HandlerRequest;

/**
 * HumanResource
 */
public class HumanResource extends Manager {

    @Override
    public void handleRequest(HandlerRequest handlerRequest) {
        if (handlerRequest instanceof AskForLeaveRequest) {
            AskForLeaveRequest askForLeaveRequest = (AskForLeaveRequest) handlerRequest;
            if (askForLeaveRequest.getDayOfAskForLeave() < 7) {
                System.out.println("人力资源审批通过");
            } else {
                if (hasSuperior()) {
                    nextHandler().handleRequest(handlerRequest);
                }
            }
        }
	}
}