/**
 * 
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.projects.core.common.constant.factory;

import lombok.Getter;

/**
 * 管理员的状态

 */
@Getter
public enum ManagerStatus {

	OK("ENABLE", "启用"), FREEZED("LOCKED", "冻结"), DELETED("DELETED", "被删除"), PASS("1", "审核通过"), UNPASS("2", "未通过"),
	PASSING("0", "待审核");

	String code;
	String message;

	ManagerStatus(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public static String getDescription(String value) {
		if (value == null) {
			return "";
		} else {
			for (ManagerStatus ms : ManagerStatus.values()) {
				if (ms.getCode().equals(value)) {
					return ms.getMessage();
				}
			}
			return "";
		}
	}
}
