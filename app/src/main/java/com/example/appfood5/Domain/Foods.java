package com.example.appfood5.Domain;

import java.io.Serializable;

public class Foods implements Serializable {
    private int CategoryId;
    private String Description;
    private boolean BestFood;
    private int Id;
    private int LocationId;
    private double Price;
    private String ImagePath;
    private int PriceId;
    private double Star;
    private int TimeId;
    private int TimeValue;
    private String Title;
    private int numberInCart;

    public Foods() {
    }

    public Foods(int CategoryId, String Description, boolean BestFood, int Id, int LocationId, double Price, String ImagePath, int PriceId, double Star, int TimeId, int TimeValue, String Title,int numberInCart) {
        this.CategoryId = CategoryId;
        this.Description = Description;
        this.BestFood = BestFood;
        this.Id = Id;
        this.LocationId = LocationId;
        this.Price = Price;
        this.ImagePath = ImagePath;
        this.PriceId = PriceId;
        this.Star = Star;
        this.TimeId = TimeId;
        this.TimeValue = TimeValue;
        this.Title = Title;
        this.numberInCart = numberInCart;
    }

    @Override
    public String toString() {
        return Title;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        this.CategoryId = categoryId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public boolean isBestFood() {
        return BestFood;
    }

    public void setBestFood(boolean bestFood) {
        this.BestFood = bestFood;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        this.LocationId = locationId;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        this.ImagePath = imagePath;
    }

    public int getPriceId() {
        return PriceId;
    }

    public void setPriceId(int priceId) {
        this.PriceId = priceId;
    }

    public double getStar() {
        return Star;
    }

    public void setStar(double star) {
        this.Star = star;
    }

    public int getTimeId() {
        return TimeId;
    }

    public void setTimeId(int timeId) {
        this.TimeId = timeId;
    }

    public int getTimeValue() {
        return TimeValue;
    }

    public void setTimeValue(int timeValue) {
        this.TimeValue = timeValue;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}

