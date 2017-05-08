package com.back4app.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "client")
public class Client {
	public String toValueString() {
		return "Client [id=" + id + ", mobile_number=" + mobile_number + ", company_name=" + company_name + ", website="
				+ website + ", address=" + address + ", state=" + state + ", datetime=" + datetime + ", updated_at="
				+ updated_at + ", object_id=" + object_id + ", referrer=" + referrer + ", business_category="
				+ business_category + ", fb_page_url=" + fb_page_url + ", fb_page_id=" + fb_page_id + ", meta_data="
				+ meta_data + ", business_logo_url=" + business_logo_url + ", ext_id=" + ext_id + ", is_responsive="
				+ is_responsive + ", is_ssl_enabled=" + is_ssl_enabled + ", is_updated=" + is_updated
				+ ", custom_audience_id=" + custom_audience_id + ", catalog_id=" + catalog_id + ", feed_id=" + feed_id
				+ ", product_audience_id=" + product_audience_id + ", product_set_id=" + product_set_id
				+ ", website_audience_id=" + website_audience_id + ", is_facebook_access_granted="
				+ is_facebook_access_granted + ", instagram_id=" + instagram_id + ", partner=" + partner
				+ ", all_product_set_id=" + all_product_set_id + ", ad_account=" + ad_account + ", pixel_id=" + pixel_id
				+ ", account_id=" + account_id + ", city=" + city + ", gender=" + gender + ", min_age=" + min_age
				+ ", max_age=" + max_age + ", is_updated_adset=" + is_updated_adset + "]";
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "mobile_number")
	private BigInteger mobile_number;

	@Column(name = "company_name")
	private String company_name;

	@Column(name = "website")
	private String website;

	@Column(name = "address")
	private String address;

	@Column(name = "state")
	private String state;

	@Column(name = "datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;

	@Column(name = "object_id")
	private String object_id;

	@Column(name = "referrer")
	private String referrer;

	@Column(name = "business_category")
	private String business_category;

	@Column(name = "fb_page_url")
	private String fb_page_url;

	@Column(name = "fb_page_id")
	private String fb_page_id;

	@Column(name = "meta_data")
	private String meta_data;

	@Column(name = "business_logo_url")
	private String business_logo_url;

	@Column(name = "ext_id")
	private String ext_id;

	@Column(name = "is_responsive")
	private String is_responsive;

	@Column(name = "is_ssl_enabled")
	private String is_ssl_enabled;

	@Column(name = "is_updated")
	private Integer is_updated;

	@Column(name = "custom_audience_id")
	private String custom_audience_id;

	@Column(name = "catalog_id")
	private String catalog_id;

	@Column(name = "feed_id")
	private String feed_id;

	@Column(name = "product_audience_id")
	private String product_audience_id;

	@Column(name = "product_set_id")
	private String product_set_id;

	@Column(name = "website_audience_id")
	private String website_audience_id;

	@Column(name = "is_facebook_access_granted")
	private String is_facebook_access_granted;

	@Column(name = "instagram_id")
	private String instagram_id;

	@Column(name = "partner")
	private String partner;

	@Column(name = "all_product_set_id")
	private String all_product_set_id;

	@Column(name = "ad_account")
	private String ad_account;

	@Column(name = "pixel_id")
	private String pixel_id;

	@Column(name = "account_id")
	private String account_id;

	@Column(name = "city")
	private String city;

	@Column(name = "gender")
	private String gender;

	@Column(name = "min_age")
	private Integer min_age;

	@Column(name = "max_age")
	private Integer max_age;

	@Column(name = "is_updated_adset")
	private Integer is_updated_adset;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(BigInteger mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getObject_id() {
		return object_id;
	}

	public void setObject_id(String object_id) {
		this.object_id = object_id;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getBusiness_category() {
		return business_category;
	}

	public void setBusiness_category(String business_category) {
		this.business_category = business_category;
	}

	public String getFb_page_url() {
		return fb_page_url;
	}

	public void setFb_page_url(String fb_page_url) {
		this.fb_page_url = fb_page_url;
	}

	public String getFb_page_id() {
		return fb_page_id;
	}

	public void setFb_page_id(String fb_page_id) {
		this.fb_page_id = fb_page_id;
	}

	public String getMeta_data() {
		return meta_data;
	}

	public void setMeta_data(String meta_data) {
		this.meta_data = meta_data;
	}

	public String getBusiness_logo_url() {
		return business_logo_url;
	}

	public void setBusiness_logo_url(String business_logo_url) {
		this.business_logo_url = business_logo_url;
	}

	public String getExt_id() {
		return ext_id;
	}

	public void setExt_id(String ext_id) {
		this.ext_id = ext_id;
	}

	public String getIs_responsive() {
		return is_responsive;
	}

	public void setIs_responsive(String is_responsive) {
		this.is_responsive = is_responsive;
	}

	public String getIs_ssl_enabled() {
		return is_ssl_enabled;
	}

	public void setIs_ssl_enabled(String is_ssl_enabled) {
		this.is_ssl_enabled = is_ssl_enabled;
	}

	public int getIs_updated() {
		return is_updated;
	}

	public void setIs_updated(int is_updated) {
		this.is_updated = is_updated;
	}

	public String getCustom_audience_id() {
		return custom_audience_id;
	}

	public void setCustom_audience_id(String custom_audience_id) {
		this.custom_audience_id = custom_audience_id;
	}

	public String getCatalog_id() {
		return catalog_id;
	}

	public void setCatalog_id(String catalog_id) {
		this.catalog_id = catalog_id;
	}

	public String getFeed_id() {
		return feed_id;
	}

	public void setFeed_id(String feed_id) {
		this.feed_id = feed_id;
	}

	public String getProduct_audience_id() {
		return product_audience_id;
	}

	public void setProduct_audience_id(String product_audience_id) {
		this.product_audience_id = product_audience_id;
	}

	public String getProduct_set_id() {
		return product_set_id;
	}

	public void setProduct_set_id(String product_set_id) {
		this.product_set_id = product_set_id;
	}

	public String getWebsite_audience_id() {
		return website_audience_id;
	}

	public void setWebsite_audience_id(String website_audience_id) {
		this.website_audience_id = website_audience_id;
	}

	public String getIs_facebook_access_granted() {
		return is_facebook_access_granted;
	}

	public void setIs_facebook_access_granted(String is_facebook_access_granted) {
		this.is_facebook_access_granted = is_facebook_access_granted;
	}

	public String getInstagram_id() {
		return instagram_id;
	}

	public void setInstagram_id(String instagram_id) {
		this.instagram_id = instagram_id;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getAll_product_set_id() {
		return all_product_set_id;
	}

	public void setAll_product_set_id(String all_product_set_id) {
		this.all_product_set_id = all_product_set_id;
	}

	public String getAd_account() {
		return ad_account;
	}

	public void setAd_account(String ad_account) {
		this.ad_account = ad_account;
	}

	public String getPixel_id() {
		return pixel_id;
	}

	public void setPixel_id(String pixel_id) {
		this.pixel_id = pixel_id;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMin_age() {
		return min_age;
	}

	public void setMin_age(int min_age) {
		this.min_age = min_age;
	}

	public int getMax_age() {
		return max_age;
	}

	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}

	public int getIs_updated_adset() {
		return is_updated_adset;
	}

	public void setIs_updated_adset(int is_updated_adset) {
		this.is_updated_adset = is_updated_adset;
	}

}