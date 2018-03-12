package lab1zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File {
    private String __filename__ = "/Users/jakubnowak/Desktop/dane.txt";
    public String dataString;
    
    public void setData(String data) {
        this.dataString = data;
    }
    
    public String getData() {
        return this.dataString;
    }
    
    public void saveToFile(String data) throws IOException {
        System.out.println("Zapisujemy dane do pliku dane.txt.");
        FileWriter fw = new FileWriter(this.__filename__);
        fw.write(data);
        fw.close();
    }

    public String readDataFromFile() throws IOException {
      System.out.println("Odczytujemy dane z pliku dane.txt.");
      System.out.println();

      FileReader fr = new FileReader(this.__filename__);
      BufferedReader br = new BufferedReader(fr);
      this.setData(br.readLine());
      
      return this.getData();
  }

}
