package com.devsuperior.dsmeta.dto;

public class SummaryMinDTO {

    public String sellerName;
    public Double total;

    public SummaryMinDTO(String sellerName, Double total) {
        this.sellerName = sellerName;
        this.total = total;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "SummaryMinDTO{" +
                "sellerName='" + sellerName + '\'' +
                ", total=" + total +
                '}';
    }
}
