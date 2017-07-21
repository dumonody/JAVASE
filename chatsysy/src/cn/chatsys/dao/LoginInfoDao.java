package cn.chatsys.dao;

import java.util.Date;

import cn.chatsys.bean.LoginInfo;

/**
 * 登录信息借口
 * @author moy
 *
 */
public interface LoginInfoDao {
	/**
	 * 添加登录信息
	 * @param loginInfo
	 * @return
	 */
	public boolean doLoginInfo(String address,String ip,Date time,int uid);
	
}
