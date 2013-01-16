package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class ViewWindow {
  


	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("豆瓣图书搜索");
		f.setLocation(300, 300);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(new GridLayout(10,2));
		//建立输入图书ISBN码项
		final TextField id = new TextField("输入图书ISBN:",10);
		f.add(id);
		Button butt = new Button("搜索");
		f.add(butt);
		
		//
		final TextField bookName = new TextField("图书名",10);
		f.add(new Label("图书名:",Label.CENTER));
		f.add(bookName);
		//
		final TextField authorName = new TextField("图书作者",10);
		f.add(new Label("图书作者:",Label.CENTER));
		f.add(authorName);
		//
		final TextField bookIsbn10 = new TextField("图书ISBN10码",10);
		f.add(new Label("图书ISBN10码:",Label.CENTER));
		f.add(bookIsbn10);
		//
		final TextField bookIsbn13 = new TextField("图书ISBN13码",10);
		f.add(new Label("图书ISBN13码:",Label.CENTER));
		f.add(bookIsbn13);
		//
		final TextField bookPage = new TextField("图书页数",10);
		f.add(new Label("图书页数:",Label.CENTER));
		f.add(bookPage);
		//
		final TextField bookPrice = new TextField("图书价格",10);
		f.add(new Label("图书价格:",Label.CENTER));
		f.add(bookPrice);
		//
		final TextField bookBinding = new TextField("图书装订方式",10);
		f.add(new Label("图书装订方式:",Label.CENTER));
		f.add(bookBinding);
		//
		final TextField publisher = new TextField("图书出版社",10);
		f.add(new Label("图书出版社:",Label.CENTER));
		f.add(publisher);
		//
		final TextField pubdate = new TextField("图书出版日期",10);
		f.add(new Label("图书出版日期:",Label.CENTER));
		f.add(pubdate);
		//
		final TextField bookDetail = new TextField("图书内容概要",10);
		f.add(new Label("图书内容概要:",Label.CENTER));
		f.add(bookDetail);
		//设置按钮监听
		butt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Books book;
				ISBN isbnTest = new ISBN();
				String isbn = id.getText();//获取输入的图书ISBN码
				String bookjson;
				try {
					bookjson = isbnTest.fetchBookInfoByXML(isbn);
					JSONObject jsonobj=isbnTest.stringToJson(bookjson);				    
				    book = (Books)isbnTest.setBookData();
				    bookName.setText(book.getTitle());
				    authorName.setText(book.getAuthor());
				    bookIsbn10.setText(book.getIsbn10());
				    bookIsbn13.setText(book.getIsbn13());
				    bookBinding.setText(book.getBinding());
				    bookDetail.setText(book.getSummary());
				    bookPage.setText(book.getPage());
				    bookPrice.setText(book.getPrice());
				    publisher.setText(book.getPublisher());
				    pubdate.setText(book.getPubdate());
				    
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    
			}
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent args) {
			   System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
