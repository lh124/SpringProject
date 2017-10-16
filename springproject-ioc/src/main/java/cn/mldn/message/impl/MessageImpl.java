package cn.mldn.message.impl;

import cn.mldn.message.IMessage;

public class MessageImpl implements IMessage{

	@Override
	public String echo(String msg) {
		return msg;
	}

}
