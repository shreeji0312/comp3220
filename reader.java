import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class reader {
	
	private ArrayList<ArrayList<String>> list;
	
    public reader(String fileName) {
    	list = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            String[] input;
            while (scan.hasNextLine()) {
            	input = scan.nextLine().split(",");
            	ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < input.length; i++) {
                    row.add(input[i].trim());
                }
                list.add(row);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public int numberOfRows() {
        return list.size();
    }

    public int numberOfFields(int row) {
        return list.get(row).size();
    }

    public String field(int row, int column) {
        return list.get(row).get(column);
    }

	public void printrow() {
		
		for (int i = 0 ; i< list.size() ;i++) {
			
			System.out.println(list.get(i));
		}
		
	}
		
    
}