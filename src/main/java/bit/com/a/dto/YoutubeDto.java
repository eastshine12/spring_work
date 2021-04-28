package bit.com.a.dto;

import java.io.Serializable;

/*
 
DROP TABLE YOUTUBE
CASCADE CONSTRAINTS;

DROP SEQUENCE SEQ_YOUTUBE;

CREATE TABLE YOUTUBE(
    SEQ NUMBER PRIMARY KEY,
    ID VARCHAR2(50) NOT NULL,
    TITLE VARCHAR2(200) NOT NULL,
    URL VARCHAR2(100) NOT NULL,
    WDATE DATE NOT NULL
);

CREATE SEQUENCE SEQ_YOUTUBE
START WITH 1
INCREMENT BY 1;

ALTER TABLE YOUTUBE
ADD CONSTRAINT
FK_YOUTUBE FOREIGN KEY(ID)
REFERENCES MEMBER(ID);
 
 */


public class YoutubeDto implements Serializable {
	
	private int seq;
	private String id;
	private String title;
	private String url;
	private String wDate;
	
	public YoutubeDto() {
	}

	public YoutubeDto(int seq, String id, String title, String url, String wDate) {
		this.seq = seq;
		this.id = id;
		this.title = title;
		this.url = url;
		this.wDate = wDate;
	}

	public YoutubeDto(String id, String title, String url) {
		this.id = id;
		this.title = title;
		this.url = url;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getwDate() {
		return wDate;
	}

	public void setwDate(String wDate) {
		this.wDate = wDate;
	}

	@Override
	public String toString() {
		return "YoutubeDto [seq=" + seq + ", id=" + id + ", title=" + title + ", url=" + url + ", wDate=" + wDate + "]";
	}

	
	
}
