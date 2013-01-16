package main;

public class Books {
  private String summary;
  private String author;
  private String title;
  private String page;
  private String isbn10;
  private String isbn13;
  private String price;
  private String publisher;
  private String binding;
  private String pubdate;
  /**
   * 获取图书概要信息
   * 注:数据量较大需要一定的空间用于分行显示
   * @return String
   */
public String getSummary() {
  return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
/**
 * 获取作者姓名
 * @return String
 */
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
/**
 * 获取图书名
 * @return String
 */
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
/**
 * 获取图书ISBN10编码
 * @return String
 */
public String getIsbn10() {
	return isbn10;
}
public void setIsbn10(String isbn10) {
	this.isbn10 = isbn10;
}
/**
 * 获取图书ISBN13编码
 * @return String
 */
public String getIsbn13() {
	return isbn13;
}
public void setIsbn13(String isbn13) {
	this.isbn13 = isbn13;
}
/**
 * 获取图书价格
 * @return String
 */
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
/**
 * 获取图书出版社
 * @return String
 */
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
/**
 * 获取图书装订方式
 * @return String
 */
public String getBinding() {
	return binding;
}
public void setBinding(String binding) {
	this.binding = binding;
}
/**
 * 获取图书出版日期
 * @return String
 */
public String getPubdate() {
	return pubdate;
}
public void setPubdate(String pubdate) {
	this.pubdate = pubdate;
}
public void setPage(String page) {
	this.page = page;
}
/**
 * 获取图书页数
 * @return String
 */
public String getPage() {
	return page;
}
  
}
