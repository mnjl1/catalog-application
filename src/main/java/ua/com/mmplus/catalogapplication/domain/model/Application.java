package ua.com.mmplus.catalogapplication.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "promo-application")
public class Application {
    private Long id;
    private final String PROMO_TYPE = "Гаряча ціна.";
    private String companyName;
    private String email;
    private String itemName;
    private String barcode;
    private String weight;
    private String brand;
    private String manufacturerCountry;
    private long regularPrice;
    private long promoPrice;
    private long retailMargin;
    private int promoAndRegularPriceDifference;
    private Date applicationDate;
    private boolean approveStatus;

    public Application(){
    }

    public Application(long id, String companyName, String email, String itemName, String barcode, String weight,
                       String brand, String manufacturerCountry, long regularPrice, long promoPrice,
                       long retailMargin, int promoAndRegularPriceDifference, Date applicationDate) {
        this.id = id;
        this.companyName = companyName;
        this.email = email;
        this.itemName = itemName;
        this.barcode = barcode;
        this.weight = weight;
        this.brand = brand;
        this.manufacturerCountry = manufacturerCountry;
        this.regularPrice = regularPrice;
        this.promoPrice = promoPrice;
        this.retailMargin = retailMargin;
        this.promoAndRegularPriceDifference = promoAndRegularPriceDifference;
        this.applicationDate = applicationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPROMO_TYPE() {
        return PROMO_TYPE;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public long getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(long regularPrice) {
    		this.regularPrice = regularPrice;
    }

    public long getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(long promoPrice) {
        this.promoPrice = promoPrice;
    }

    public long getRetailMargin() {
        return retailMargin;
    }

    public void setRetailMargin(long retailMargin) {
        this.retailMargin = retailMargin;
    }

    public int getPromoAndRegularPriceDifference() {
        return promoAndRegularPriceDifference;
    }

    public void setPromoAndRegularPriceDifference(int promoAndRegularPriceDifference) {
        this.promoAndRegularPriceDifference = promoAndRegularPriceDifference;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public boolean isApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(boolean approveStatus) {
        this.approveStatus = approveStatus;
    }
}
