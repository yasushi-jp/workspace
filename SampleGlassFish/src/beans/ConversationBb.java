package beans;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class ConversationBb implements Serializable {

	private String product;
	private Integer qty;
	private String name;
	private String address;

	@Inject
	Conversation conv;

	public String goto_1() {
		if (conv.isTransient()) {
			conv.begin();
			System.out.println("**第1画面　会話スコープ開始**");
		} else {
			System.out.println("**第1画面**");
		}
		return "view_1";
	}

	public String goto_2() {
		System.out.println("**第2画面**");
		return "view_2";
	}

	public String goto_3() {
		System.out.println("**第3画面**");
		return "view_3";
	}

	public String goto_0() {
		conv.end();
		System.out.println("**開始画面　会話スコープ終了**");
		return "view_0";
	}

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
