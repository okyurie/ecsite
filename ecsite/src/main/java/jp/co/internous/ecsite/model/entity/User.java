package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//これでこのクラスはEntity（実在）として振る舞うぞ
@Table(name = "user")
//DBのuserテーブルの実体として指定したぞ
public class User {

	@Id
	// ぼくプライマリーキーです
	@Column(name = "id")
	// テーブルのidカラムとマッピングします ほかのカラムもまずはマッピングする
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 振る舞い方を指定するぞ userにあるAuto_incrementとして振る舞うゾ
	private long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "is_admin")
	private int isAdmin;

	// セッターとゲッターを指定するのは作業としてはあとからになる
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

}
