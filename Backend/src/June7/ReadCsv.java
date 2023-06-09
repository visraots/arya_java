package June7;
import java.io.*;
import java.util.*;
public class ReadCsv {
	

	public static void main(String[] args) {
		String csvFile = "/Users/aryavishnu/Downloads/Data.csv";
	    String line = "";
	    String cvsSplitBy = ",";
	    List<List<String>> llp = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	        while ((line = br.readLine()) != null) {
	            llp.add(Arrays.asList(line.split(cvsSplitBy)));
	        }
	        llp.sort(new Comparator<List<String>>() {
	            
	            public int compare(List<String> o1, List<String> o2) {
	                return o1.get(1).compareTo(o2.get(1));
	            }
	        });
	        System.out.println(llp);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	
	}
}
