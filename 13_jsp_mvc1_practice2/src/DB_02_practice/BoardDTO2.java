package DB_02_practice;
import java.sql.Date;

public class BoardDTO2 {
	
	@Override
	public String toString() {
		return "BoardDTO2 [writer=" + writer + ", email=" + email + ", subject=" + subject + ", password=" + password
				+ ", content=" + content + ", enrollDt=" + enrollDt + ", readCnt=" + readCnt + ", boardId=" + boardId
				+ ", getBoardId()=" + getBoardId() + ", getWriter()=" + getWriter() + ", getEmail()=" + getEmail()
				+ ", getSubject()=" + getSubject() + ", getPassword()=" + getPassword() + ", getContent()="
				+ getContent() + ", getEnrollDt()=" + getEnrollDt() + ", getReadCnt()=" + getReadCnt() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	private String writer;
	private String email;
	private String subject;
	private String password;
	private String content;
	private Date enrollDt;
	private long readCnt;

	
	private long boardId;
	public long getBoardId() {
		return boardId;
	}
	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getEnrollDt() {
		return enrollDt;
	}
	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}
	public long getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(long readCnt) {
		this.readCnt = readCnt;
	}
	
	
	

}
