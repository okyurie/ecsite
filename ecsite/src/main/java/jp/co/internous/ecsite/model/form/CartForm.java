package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

import jp.co.internous.ecsite.model.entity.Cart;

public class CartForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private List<Cart> cartList;
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserID(long userId) {
		this.userId = userId;
	}
	
	public List<Cart> getCartList(){
		return cartList;
	}
	
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

}
