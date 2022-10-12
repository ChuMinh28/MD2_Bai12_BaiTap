package baitap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private Float importPrice;
    private Float exportPrice;

    public Product() {
    }

    public Product(String id, String name, Float importPrice, Float exportPrice) {
        this.id = id;
        this.name = name;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Float importPrice) {
        this.importPrice = importPrice;
    }

    public Float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(Float exportPrice) {
        this.exportPrice = exportPrice;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhap id san pham: ");
        this.id = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        this.name = scanner.nextLine();
        System.out.println("Gia nhap san pham: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        this.exportPrice = this.importPrice*2f;
    }
    public void displayData(){
        System.out.printf("%-15s%-20s%-20f%-20f\n", this.id,this.name,this.importPrice,this.exportPrice);
    }
}
