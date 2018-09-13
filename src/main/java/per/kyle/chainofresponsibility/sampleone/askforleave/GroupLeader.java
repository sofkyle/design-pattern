package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.HandlerRequest;

/**
 * GroupLeader
 */
public class GroupLeader extends Manager {

	@Override
	public void handleRequest(HandlerRequest handlerRequest) {
		// 处理请假请求
        if (handlerRequest instanceof AskForLeaveRequest) {
            AskForLeaveRequest askForLeaveRequest = (AskForLeaveRequest) handlerRequest;
            if (askForLeaveRequest.getDayOfAskForLeave() < 3) {
                System.out.println("小组领导审批通过");
            } else {
                if (hasSuperior()) {
                    nextHandler().handleRequest(handlerRequest);
                }
            }
        }
	}
}
