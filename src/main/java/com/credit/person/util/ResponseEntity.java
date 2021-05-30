package com.credit.person.util;

import java.util.List;
import lombok.Value;
import reactor.core.publisher.Flux;

@Value
public class ResponseEntity {

	int total;
	int pageSize;
	long page;
	String success;
	public Flux<Object> getData() {
		return data;
	}
	public void setData(Flux<Object> data) {
		this.data = data;
	}
	Flux<Object> data;
	
	 
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getPage() {
		return page;
	}
	public void setPage(long page) {
		this.page = page;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

	
}
