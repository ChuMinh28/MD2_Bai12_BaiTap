package baitap1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> listProduct = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("1.Them san pham");
            System.out.println("2.Sua thong tin san pham theo id");
            System.out.println("3.Xoa san pham theo id");
            System.out.println("4.Hien thi danh sach san pham");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Sap xep san pham tang dan theo gia ban");
            System.out.println("7,.Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    ProductManager.addNewProduct(scanner);
                    break;
                case 2:
                    ProductManager.editProduct(scanner);
                    break;
                case 3:
                    ProductManager.deleteProduct(scanner);
                    break;
                case 4:
                    System.out.printf("%-15s%-20s%-20s%-20s\n","Id san pham","Ten san pham","Gia nhap","Gia ban");
                    for (Product pro:listProduct
                         ) {
                        pro.displayData();
                    }
                    break;
                case 5:
                    ProductManager.searchProduct(scanner);
                    break;
                case 6:
                    ProductManager.sortProduct();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Chon tu 1 den 7");
            }
        }while (true);
    }
    public static void addNewProduct(Scanner scanner){
        System.out.println("Nhap so luong san pham muon nhap: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            Product product = new Product();
            product.inputData(scanner);
            listProduct.add(product);
        }
        System.out.println("Da nhap xong thong tin");
    }
    public static void editProduct(Scanner scanner){
        System.out.println("Nhp id san pham muon sua: ");
        String id = scanner.nextLine();
        boolean exitEdit = false;
        for (Product pro:listProduct) {
            if (pro.getId().equals(id)){
                System.out.println("sua ten san pham: ");
                String name = scanner.nextLine();
                if (name!=""&&name.length()!=0){
                    pro.setName(name);
                }
                System.out.println("Sua gia nhap vao");
                String importPrice = scanner.nextLine();
                if (importPrice!=""&& importPrice.length()!=0){
                    pro.setImportPrice(Float.parseFloat(importPrice));
                    pro.setExportPrice(Float.parseFloat(importPrice));
                }
                System.out.println("Da cap nhat xong");
                exitEdit = true;
                break;
            }
        }
        if (!exitEdit){
            System.out.println("Khong tim thay san pham");
        }
    }
    public static void deleteProduct(Scanner scanner){
        System.out.println("Nhap id san pham muon xoa");
        String id = scanner.nextLine();
        boolean exitPro = false;
        for (Product pro:listProduct) {
            if (pro.getId().equals(id)){
                listProduct.remove(pro);
                System.out.println("Xoa thanh cong");
                exitPro = true;
                break;
            }
        }
        if (!exitPro){
            System.out.println("Khong tim thay san pham can xoa");
        }
    }
    public static void searchProduct(Scanner scanner){
        System.out.println("Nhap ten san pham muon tim kiem: ");
        String name = scanner.nextLine();
        boolean exitPro = false;
        for (Product pro:listProduct) {
            if (pro.getName().equals(name)){
                pro.displayData();
                exitPro = true;
            }
        }
        if (!exitPro){
            System.out.println("Khong tim thay san pham");
        }
    }
    public static void sortProduct(){
        listProduct.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getExportPrice() - o2.getExportPrice());
            }
        });
        for (Product pro:listProduct
             ) {
            pro.displayData();
        }
    }
}
