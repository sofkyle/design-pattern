package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.AbstractHandleRequest;

/**
 * GroupLeader
 */
public class GroupLeader extends AbstractManager {

	@Override
	public void handleRequest(AbstractHandleRequest handleRequest) {
		// 处理请假请求
        if (handleRequest instanceof AskForLeaveRequest) {
            AskForLeaveRequest askForLeaveRequest = (AskForLeaveRequest) handleRequest;
            if (askForLeaveRequest.getDayOfAskForLeave() < 3) {
                System.out.println("小组领导审批通过");
            } else {
                if (haveNextHandler()) {
                    nextHandler().handleRequest(handleRequest);
                }
            }
        }
	}
}
