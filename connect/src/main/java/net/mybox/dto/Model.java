package net.mybox.dto;

import java.util.Date;

public class Model {
	
String mobile;

int version;

String file;

Boolean status;

Date publishDate;

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public String getFile() {
	return file;
}

public void setFile(String file) {
	this.file = file;
}

public Boolean getStatus() {
	return status;
}

public void setStatus(Boolean status) {
	this.status = status;
}

public Date getPublishDate() {
	return publishDate;
}

public void setPublishDate(Date publishDate) {
	this.publishDate = publishDate;
}


}
