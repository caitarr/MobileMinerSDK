package waterhole.miner.core;

import waterhole.commonlibs.NoProGuard;

/**
 * 通用挖矿回调，供接入方使用.
 *
 * @author kzw on 2018/03/14.
 */
public interface CommonMinerCallback<T> extends NoProGuard {

    /**
     * 开始连接矿池.
     */
    void onConnectPoolBegin();

    /**
     * 连接矿池成功.
     */
    void onConnectPoolSuccess();

    /**
     * 连接矿池失败.
     *
     * @param reason 连接失败原因
     */
    void onConnectPoolFail(String reason);

    /**
     * 与矿池连接断开.
     */
    void onPoolDisconnect();

    /**
     * 矿池推送的数据.
     *
     * @param message 数据信息
     */
    void onMessageFromPool(String message);

    /**
     * 挖矿进度回调.
     *
     * @param value 挖矿进度，如 1 sols/s
     */
    void onMiningSpeed(T value);

    /**
     * 提交share到矿池.
     *
     * @param total   总数量
     * @param average 平均进度
     */
    void onSubmitShare(T total, T average);
}
