package com.springtest.framework.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/23 10:54.
 */
public class BaseModel implements Serializable {
    /**
     * 统一的toString方法
     * @return
     */
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
