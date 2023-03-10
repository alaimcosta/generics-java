package application;

import entities.Product;
import services.CalculationService;
import services.PrintService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "/home/alaim/projetoJava/Udemy/courseGenerics/arquivo/testArquivo.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(","); //pega os valores entre as virgulas
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Integer x = CalculationService.max(list);
            System.out.println("Max");
            System.out.println(x);

        }catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
