//package com.mmi.ayo.api.model;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import static java.util.Objects.requireNonNull;
//
//@Entity
//@Table(name = "users")
//public class User implements UserDetails {
//
//	private static final long serialVersionUID = -7803305978259106383L;
//
//	private String id;
//	private String username;
//	private String password;
//	private String token;
//
//	@JsonCreator
//	public User(@JsonProperty("username") final String username, @JsonProperty("password") final String password) {
//		super();
//		this.username = requireNonNull(username);
//		this.password = requireNonNull(password);
//	}
//
//	@JsonCreator
//	public User(@JsonProperty("username") final String username, @JsonProperty("password") final String password,
//			@JsonProperty("id") final String token) {
//		super();
//		this.username = requireNonNull(username);
//		this.password = requireNonNull(password);
//		this.token = requireNonNull(token);
//	}
//
//	@JsonIgnore
//	@Override
//	@Transient
//	public Collection<GrantedAuthority> getAuthorities() {
//		return new ArrayList<>();
//	}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id", unique = true, nullable = false)
//	@JsonIgnore
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@JsonIgnore
//	@Override
//	@Column(name = "password", nullable = false, length = 50)
//	public String getPassword() {
//		return password;
//	}
//
//	@JsonIgnore
//	@Override
//	@Transient
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@JsonIgnore
//	@Column(name = "token", nullable = false, length = 255)
//	public String getToken() {
//		return token;
//	}
//
//	public void setToken(String token) {
//		this.token = token;
//	}
//
//	@JsonIgnore
//	@Override
//	@Transient
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@JsonIgnore
//	@Override
//	@Transient
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	@Transient
//	public boolean isEnabled() {
//		return true;
//	}
//
//	@Override
//	@Column(name = "username", nullable = false, length = 50)
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//}