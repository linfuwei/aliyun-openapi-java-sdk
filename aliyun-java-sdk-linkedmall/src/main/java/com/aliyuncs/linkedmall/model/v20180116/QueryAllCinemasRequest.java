/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryAllCinemasRequest extends RpcAcsRequest<QueryAllCinemasResponse> {
	
	public QueryAllCinemasRequest() {
		super("linkedmall", "2018-01-16", "QueryAllCinemas", "linkedmall");
	}

	private String bizId;

	private Long cityCode;

	private Long pageNumber;

	private String extJson;

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Long getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putQueryParameter("CityCode", cityCode.toString());
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
		}
	}

	@Override
	public Class<QueryAllCinemasResponse> getResponseClass() {
		return QueryAllCinemasResponse.class;
	}

}