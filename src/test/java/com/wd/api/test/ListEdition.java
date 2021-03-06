package com.wd.api.test;

import java.util.Map;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wd.api.util.CaseUtil;
import com.wd.api.util.ExcelUtil;
import com.wd.api.util.HttpUtil;
import com.wd.api.util.RestUtil;

public class ListEdition extends BaseCase{
	@DataProvider
	public Object[][] datas() {
		String[] cellNames = { "ApiId", "Params" };
		Object[][] datas = CaseUtil.getCaseDatasByApiId("2", cellNames);
		return datas;
	}
}
