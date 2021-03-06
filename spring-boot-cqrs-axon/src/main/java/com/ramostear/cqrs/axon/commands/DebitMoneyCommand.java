package com.ramostear.cqrs.axon.commands;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:28
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
public class DebitMoneyCommand extends BaseCommand<String> {

    public final double debitAmount;

    public final String currency;

    public DebitMoneyCommand(String id,double debitAmount,String currency){
        super(id);
        this.debitAmount = debitAmount;
        this.currency = currency;
    }
}
