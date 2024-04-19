package Bitwise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SymbolTable {
    private Map<String, String> table;

    public SymbolTable() {
        this.table = new HashMap<>();
    }

    public void addSymbol(String symbol, String type) {
        if (table.containsKey(symbol)) {
            System.out.println("Error: Symbol '" + symbol + "' already exists in the table.");
        } else {
            table.put(symbol, type);
            System.out.println("Symbol '" + symbol + "' added to the table.");
        }
    }

    public void deleteSymbol(String symbol) {
        if (table.containsKey(symbol)) {
            table.remove(symbol);
            System.out.println("Symbol '" + symbol + "' deleted from the table.");
        } else {
            System.out.println("Error: Symbol '" + symbol + "' not found in the table.");
        }
    }

    public void searchSymbol(String symbol) {
        if (table.containsKey(symbol)) {
            System.out.println("Symbol '" + symbol + "' found in the table with type '" + table.get(symbol) + "'.");
        } else {
            System.out.println("Symbol '" + symbol + "' not found in the table.");
        }
    }

    public void printTable() {
        System.out.println("\nSymbol Table");
        System.out.println("Symbol\tType");
        for (Map.Entry<String, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your registration number: ");
        String regno = scanner.nextLine();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add symbol");
            System.out.println("2. Delete symbol");
            System.out.println("3. Search symbol");
            System.out.println("4. Print table");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter symbol: ");
                    String symbol = scanner.nextLine();
                    System.out.print("Enter symbol type: ");
                    String symbolType = scanner.nextLine();
                    symbolTable.addSymbol(symbol, symbolType);
                    break;
                case "2":
                    System.out.print("Enter symbol to delete: ");
                    String symbolToDelete = scanner.nextLine();
                    symbolTable.deleteSymbol(symbolToDelete);
                    break;
                case "3":
                    System.out.print("Enter symbol to search: ");
                    String symbolToSearch = scanner.nextLine();
                    symbolTable.searchSymbol(symbolToSearch);
                    break;
                case "4":
                    symbolTable.printTable();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
