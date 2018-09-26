package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.HandlerChainProvider;
import per.kyle.chainofresponsibility.sampleone.corbase.HandlerRequest;

/**
 * AskForLeaveChainProvider
 */
public class AskForLeaveChainProvider extends HandlerChainProvider {

    private Manager manager;

    @Override
    public void configHandlerChain() {
        GroupLeader groupLeader = new GroupLeader();
        HumanResource humanResource = new HumanResource();
        ExecutiveManager executiveManager = new ExecutiveManager();
        
        groupLeader.setNextHandler(humanResource);
        humanResource.setNextHandler(executiveManager);

        this.manager = groupLeader;
    }

    @Override
    public void start(HandlerRequest handlerRequest) {
		if (manager != null) {
            this.manager.handleRequest(handlerRequest);
        }
	}

}