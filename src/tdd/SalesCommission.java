package tdd;

public class SalesCommission {
    private double grossPercentage;
    private int salesBonus;
    private double salesCommission;
    private double totalSales;

    public SalesCommission(double grossPercentage, int salesBonus, double totalSales, double salesCommission){
        this.grossPercentage = grossPercentage;
        this.salesBonus = salesBonus;
        this.totalSales = totalSales;
        this.salesCommission = salesCommission;
    }


    public void setGrossPercentage(double grossPercentage) {
        this.grossPercentage = grossPercentage;
    }
    public double getGrossPercentage(){
        return grossPercentage;
    }

    public void setSalesBonus(int salesBonus) {
        this.salesBonus = salesBonus;
    }

    public int getSalesBonus() {
        return salesBonus;
    }
    public void setTotalSales(double totalSales){
        this.totalSales = totalSales;
    }
    public double getTotalSales(){
        return totalSales;
    }
    public void setSalesCommission(int salesBonus, double grossPercentage, double totalSales){
       salesCommission = salesBonus + (grossPercentage * totalSales);
    }
    public double getSalesCommission(){
        return salesCommission;
    }
}
