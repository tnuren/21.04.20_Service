package day16;

public class BoardDTO {
private	int number;
private	String textTitle;
private	String pw;
private	String name;
private	String content;


BoardDTO(){
	
}



public BoardDTO(int number, String textTitle, String pw, String name, String content) {
	super();
	this.number = number;
	this.textTitle = textTitle;
	this.pw = pw;
	this.name = name;
	this.content = content;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getTextTitle() {
	return textTitle;
}
public void setTextTitle(String textTitle) {
	this.textTitle = textTitle;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return "BoardDTO [number=" + number + ", textTitle=" + textTitle + ", pw=" + pw + ", name=" + name + ", content="
			+ content + "]";
}

	
	
	
}
