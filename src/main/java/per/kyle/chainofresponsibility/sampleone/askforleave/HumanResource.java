package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.AbstractHandleRequest;

/**
 * HumanResource
 */
public class HumanResource extends AbstractManager {

    @Override
    public void handleRequest(AbstractHandleRequest handleRequest) {
        if (handleRequest instanceof AskForLeaveRequest) {
            AskForLeaveRequest askForLeaveRequest = (AskForLeaveRequest) handleRequest;
            if (askForLeaveRequest.getDayOfAskForLeave() < 7) {
                System.out.println("人力资源审批通过");
            } else {
                if (haveNextHandler()) {
                    nextHandler().handleRequest(handleRequest);
                }
            }
        }
	}
}