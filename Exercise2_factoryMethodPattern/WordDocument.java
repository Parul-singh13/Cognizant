// WordDocument.java
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
    @Override
    public void save() {
        System.out.println("Saving Word Document...");
    }
    @Override
    public void close() {
        System.out.println("Closing Word Document...");
    }
}

// PdfDocument.java
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
    @Override
    public void save() {
        System.out.println("Saving PDF Document...");
    }
    @Override
    public void close() {
        System.out.println("Closing PDF Document...");
    }
}

// ExcelDocument.java
public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
    @Override
    public void save() {
        System.out.println("Saving Excel Document...");
    }
    @Override
    public void close() {
        System.out.println("Closing Excel Document...");
    }
}
