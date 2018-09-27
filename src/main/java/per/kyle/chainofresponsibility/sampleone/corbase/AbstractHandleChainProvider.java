package per.kyle.chainofresponsibility.sampleone.corbase;

public abstract class AbstractHandleChainProvider {

    /**
     * 配置责任链
     * @return
     */
    public abstract void configHandleChain();

    /**
     * 开始处理请求
     * @param abstractHandleRequest
     */
    public abstract void start(AbstractHandleRequest abstractHandleRequest);
}