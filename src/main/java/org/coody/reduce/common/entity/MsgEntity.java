package org.coody.reduce.common.entity;

import java.util.HashMap;
import java.util.Map;

import org.coody.framework.core.model.BaseModel;
import org.coody.reduce.common.enm.ResultCode;

/**
 * @remark 消息机制容器。
 * @author Savage.LEE
 * @date 2020年7月10日
 */
@SuppressWarnings("serial")
public class MsgEntity extends BaseModel {

	public Integer code;
	public String msg;
	public Object datas;

	public MsgEntity(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public MsgEntity() {
	}

	public MsgEntity(ResultCode result) {
		this.code = result.getCode();
		this.msg = result.getMsg();
	}

	public MsgEntity(Integer code, String msg, Object datas) {
		super();
		this.code = code;
		this.msg = msg;
		this.datas = datas;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setDataField(String fieldName, Object value) {
		if (datas == null) {
			datas = new HashMap<String, Object>();
		}
		if (!Map.class.isAssignableFrom(datas.getClass())) {
			return;
		}
		try {
			((Map) datas).put(fieldName, value);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Object getDatas() {
		return datas;
	}

	public void setDatas(Object datas) {
		this.datas = datas;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
