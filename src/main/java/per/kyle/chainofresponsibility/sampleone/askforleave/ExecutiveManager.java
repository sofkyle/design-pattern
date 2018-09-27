package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.AbstractHandleRequest;

/**
 * ExecutiveManager
 */
public class ExecutiveManager extends AbstractManager {

    @Override
    public void handleRequest(AbstractHandleRequest handleRequest) {
        if (handleRequest instanceof AskForLeaveRequest) {
            System.out.println("总经理需要考虑一下");
        }
	}
}