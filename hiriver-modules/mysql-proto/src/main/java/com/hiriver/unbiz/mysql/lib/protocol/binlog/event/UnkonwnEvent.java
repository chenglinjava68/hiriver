package com.hiriver.unbiz.mysql.lib.protocol.binlog.event;

import com.hiriver.unbiz.mysql.lib.protocol.Position;
import com.hiriver.unbiz.mysql.lib.protocol.binlog.BinlogEvent;

/**
 * 未知事件，直接丢弃
 * 
 * @author hexiufeng
 *
 */
public class UnkonwnEvent extends AbstractBinlogEvent implements BinlogEvent {

    public UnkonwnEvent(long eventBinlogPos, boolean hasCheckSum) {
        super(eventBinlogPos, hasCheckSum);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void parse(byte[] buf, Position pos) {
        // do nothing
    }

}
