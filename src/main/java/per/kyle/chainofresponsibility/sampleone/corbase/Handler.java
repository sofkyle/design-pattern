package per.kyle.chainofresponsibility.sampleone.corbase;

public interface Handler {
    /**
     * 处理请求
     * @param abstractHandleRequest
     */
    void handleRequest(AbstractHandleRequest abstractHandleRequest);

    /**
     * 设置下一处理单元
     * @param handler
     */
    void setNextHandler(Handler handler);

    /**
     * 获得下一处理单元
     */
    Handler nextHandler();

    /**
     * 判断是否有下一处理单元
     * @return
     */
    boolean haveNextHandler();
}