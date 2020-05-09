package com.service;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 */
@ServerEndpoint("/ssss/{id}")
public class Ee {

	/**
	 * 连接建立成功调用的方法
	 * @param session  可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
	 */
	@OnOpen //连接创建成功时调用下面的方法
	public void abcd1(Session session,@PathParam(value="id")String id) {
		System.out.println(id);
		
//		DL d=Singleton.getdl();
//		int uid=Integer.parseInt(id);
//		d.saveuid(uid,session);
		
	}
	
	@OnClose //连接创建关闭时调用下面的方法
	public void abcd2(@PathParam(value="id")String id) {
//		DL d=DL.getdl();
//		int uid=Integer.parseInt(id);
//		d.removeuid(uid);
	}

	/**
	 * 发生错误时调用
	 * @param session
	 * @param error
	 */
	@OnError //连接创建出错时调用下面的方法
	public void abcd3(Throwable error) {
//		DL d=DL.getdl();
//		int uid=Integer.parseInt(id);
//		d.removeuid(uid);
	}

	/**
	 * 收到客户端消息后调用的方法
	 * @param message 客户端发送过来的消息
	 * @param session 可选的参数
	 */
	@OnMessage //客户端向服务器发送消息时调用下面的方法
	public void abcd4(Session session,@PathParam(value="id")String id,String message) {
		
		
	}
	
	
}
