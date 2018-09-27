package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.*;

/**
 * AskForLeaveChainProvider
 */
public class AskForLeaveChainProvider extends AbstractHandleChainProvider {

    private AbstractManager manager;

    @Override
    public void configHandleChain() {
        GroupLeader groupLeader = new GroupLeader();
        HumanResource humanResource = new HumanResource();
        ExecutiveManager executiveManager = new ExecutiveManager();
        
        groupLeader.setNextHandler(humanResource);
        humanResource.setNextHandler(executiveManager);

        this.manager = groupLeader;
    }

    @Override
    public void start(AbstractHandleRequest handleRequest) {
		if (manager != null) {
            this.manager.handleRequest(handleRequest);
        }
	}

}