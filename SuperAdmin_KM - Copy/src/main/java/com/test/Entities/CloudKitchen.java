package com.test.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cloud_kitchen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CloudKitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate kitchen ID
    private Integer kitchenId;
      public Integer getKitchenId() {
		return kitchenId;
	}
	public void setKitchenId(Integer kitchenId) {
		this.kitchenId = kitchenId;
	}
	@Column(nullable = false)
    private String kitchenName;
	

    public String getKitchenName() {
		return kitchenName;
	}
	public void setKitchenName(String kitchenName) {
		this.kitchenName = kitchenName;
	}
	@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private KitchenType kitchenType;
	

    public KitchenType getKitchenType() {
		return kitchenType;
	}
	public void setKitchenType(KitchenType kitchenType) {
		this.kitchenType = kitchenType;
	}
	@Column(nullable = false)
    private String cuisineType;
	

    public String getCuisineType() {
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	@Column(nullable = false)
    private String operatingTime;
	

    public String getOperatingTime() {
		return operatingTime;
	}
	public void setOperatingTime(String operatingHours) {
		this.operatingTime = operatingHours;
	}
	

    @Column(nullable = false)
    private Integer hygieneRating;
    

    public Integer getHygieneRating() {
		return hygieneRating;
	}
	public void setHygieneRating(Integer hygieneRating) {
		this.hygieneRating = hygieneRating;
	}
	@Column(nullable = false)
    private String location;
    public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(nullable = false, length = 100)
    private String region;
	 public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	private String country;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	private String state;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	private String googleMapsLocation;
	public String getGoogleMapsLocation() {
		return googleMapsLocation;
	}
	public void setGoogleMapsLocation(String googleMapsLocation) {
		this.googleMapsLocation = googleMapsLocation;
	}

	 private String managerName;
	 
	 public String getManagerName() {
			
			return managerName;
		}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Lob
    @Column(columnDefinition = "LONGBLOB")  // Store binary data
    private byte[] fssaiLicenseDocument;

   
	public byte[] getFssaiLicenseDocument() {
		return fssaiLicenseDocument;
	}
	public void setFssaiLicenseDocument(byte[] fssaiLicenceDocument) {
		this.fssaiLicenseDocument = fssaiLicenceDocument;
	}
	private String gstNumber;
	

    public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	@Column(nullable = false)
    private String paymentMethods;
	
	private String documentName;
	
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	@Lob
    @Column(columnDefinition = "LONGBLOB")  // Store binary data
    private byte[] necessaryDocument;
	
	public byte[] getNecessaryDocument() {
		return necessaryDocument;
	}
	public void setNecessaryDocument(byte[] necessaryDocument) {
		this.necessaryDocument = necessaryDocument;
	}
	public String getPaymentMethods() {
		return paymentMethods;
	}
	public void setPaymentMethods(String paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	@Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
	

    public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    public enum KitchenType { VEG, NON_VEG, MIXED }
    public enum Status { ACTIVE, INACTIVE }
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}