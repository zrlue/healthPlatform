
package com.projects.modular.system.factory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import com.projects.core.common.constant.factory.ManagerStatus;
import com.projects.modular.system.entity.User;
import com.projects.modular.system.model.UserDto;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.stylefeng.roses.core.util.ToolUtil;

/**
 * 用户创建工厂

 */
public class UserFactory {

	/**
	 * 根据请求创建实体
	 */
	public static User createUser(UserDto userDto, String md5Password, String salt) {
		if (userDto == null) {
			return null;
		} else {
			User user = new User();
			user.setCreateUser(1L);
			BeanUtils.copyProperties(userDto, user);
			user.setCreateTime(new Date());
			user.setStatus(ManagerStatus.OK.getCode());
			user.setPassword(md5Password);
			user.setSalt(salt);
			return user;
		}
	}



	/**
	 * 更新user
	 */
	public static User editUser(UserDto newUser, User oldUser) {
		if (newUser == null || oldUser == null) {
			return oldUser;
		} else {
			if (ToolUtil.isNotEmpty(newUser.getAvatar())) {
				oldUser.setAvatar(newUser.getAvatar());
			}
			if (ToolUtil.isNotEmpty(newUser.getName())) {
				oldUser.setName(newUser.getName());
			}
			if (ToolUtil.isNotEmpty(newUser.getBirthday())) {
				oldUser.setBirthday(newUser.getBirthday());
			}
			
			if (ToolUtil.isNotEmpty(newUser.getSex())) {
				oldUser.setSex(newUser.getSex());
			}
			if (ToolUtil.isNotEmpty(newUser.getEmail())) {
				oldUser.setEmail(newUser.getEmail());
			}
			if (ToolUtil.isNotEmpty(newUser.getPhone())) {
				oldUser.setPhone(newUser.getPhone());
			}
		
			
			if (ToolUtil.isNotEmpty(newUser.getDeptId())) {
				oldUser.setDeptId(newUser.getDeptId());
			}
			return oldUser;
		}
	}

	/**
	 * 过滤不安全字段并转化为map
	 */
	public static Map<String, Object> removeUnSafeFields(User user) {
		if (user == null) {
			return new HashMap<>();
		} else {
			Map<String, Object> map = BeanUtil.beanToMap(user);
			map.remove("password");
			map.remove("salt");
			map.put("birthday", DateUtil.formatDate(user.getBirthday()));
			return map;
		}
	}

	
}
