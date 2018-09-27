package per.kyle.chainofresponsibility.sampleone.corbase;

public interface IHandler {
    /**
     * 处理请求
     * @param handlerRequest
     */
    void handleRequest(HandlerRequest handlerRequest);

    /**
     * 设置下一处理单元
     * @param handler
     */
    void setNextHandler(IHandler handler);

    /**
     * 获得下一处理单元
     */
    IHandler nextHandler();

    /**
     * 判断是否有下一处理单元
     * @return
     */
    boolean haveNextHandler();
}