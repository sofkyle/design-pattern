package per.kyle.chainofresponsibility.sampleone.corbase;

public abstract class HandlerChainProvider {

    /**
     * 配置责任链
     * @return
     */
    public abstract void configHandlerChain();

    /**
     * 开始处理请求
     * @param handlerRequest
     */
    public abstract void start(HandlerRequest handlerRequest);
}