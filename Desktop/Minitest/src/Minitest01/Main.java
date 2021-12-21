package Minitest01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số sản phẩm muốn tạo ");
        int size = scanner.nextInt();
        Product[] products = new Product[size];
        createProductArray(scanner, products);

        System.out.println("Nhập vào id muốn muốn sửa: ");
        int editId = scanner.nextInt();
        editProducts(products, scanner, editId);
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void createProductArray(Scanner scanner, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập vào sản phầm thứ "+ (i+1));
            products[i] = createProduct(scanner);
        }
    }

    public static Product createProduct(Scanner scanner) {
        System.out.println("Nhập vào mã sản phẩm: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào loại sản phẩm: ");
        String type = scanner.nextLine();
        Product product = new Product(id, name, price, type);
        return product;
    }

    public static void editProducts(Product[] products, Scanner scanner, int  id) {
        scanner.nextLine();
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("Nhập vào tên mới: ");
                String name = scanner.nextLine();
                p.setName(name);
                System.out.println("Nhập vào loại mới: ");
                String type = scanner.nextLine();
                p.setType(type);
                System.out.println("Nhập vào giá mới: ");
                double price = scanner.nextDouble();
                p.setPrice(price);
            }
        }
    }
}
