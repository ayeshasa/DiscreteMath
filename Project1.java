import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.*;
import java.io.FileOutputStream;
import java.io.PrintStream;
 
public class Project1 {
    public static void main(String[] args) throws IOException {
    	 PrintStream out = new PrintStream(new FileOutputStream("/Users/Ayesha/Desktop/output.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("/Users/Ayesha/Desktop/inputfile.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
           list.add(line);
        }
        out.println("Entire list sorted:");
        String data[] = list.toArray(new String[list.size()]);
        reader.close();
        for (int i = 0; i < data.length - 1; ++i)
        {
          int minIndex = i;
          for (int j = i + 1; j < data.length-1; ++j)
          {
            if (data[j].compareTo(data[minIndex]) < 0)
            {
              minIndex = j;
            }
          }
          String temp = data[i];
          data[i] = data[minIndex];
          data[minIndex] = temp;
          out.println(data[i]);
        }   
        
        String[][] studentdata = new String[25][3];
        double all=0.00;
        double number=0.00;
        for (int i=0; i<25; i++){
         
            studentdata[i][0]=data[i].substring(0,20);
            studentdata[i][1]=data[i].substring(21,30);
            studentdata[i][2]=data[i].substring(31,35);
            String str=studentdata[i][2];
            
          number = Double.valueOf(str);
           
           all= number+all;   
        }     
        out.println("****************************************");
        out.println("GPA of entire college is "+ all/25);      
        out.println("****************************************");
      
        double freshAvegpa=0.00;
        int freshCount=0;
        out.println("Freshman list is: ");
        for(int i=0; i<25;i++){
        	if(studentdata[i][1].trim().equals("Freshman")){
        		freshAvegpa+=Double.valueOf(studentdata[i][2]);	
        		freshCount++; 
        		out.println(studentdata[i][0]);
        	}
        }
        out.println("****************************************");
        	out.println("Average Freshman GPA is "+ freshAvegpa/freshCount);
        
        
        double sophAvegpa=0.00;
        int sophCount=0;
        out.println("****************************************");
        out.println("Sophomore list is: ");
        for(int i=0; i<25;i++){
        	if(studentdata[i][1].trim().equals("Sophomore")){
        		sophAvegpa+=Double.valueOf(studentdata[i][2]);	
        		sophCount++; 
        		out.println(studentdata[i][0]);
        	}
        }
        out.println("****************************************");
        	out.println("Average Sophomore GPA is "+ sophAvegpa/sophCount);
        	 out.println("****************************************");
        	double junAvegpa=0.00;
            int junCount=0;
            out.println("Junior list is: ");
            for(int i=0; i<25;i++){
            	if(studentdata[i][1].trim().equals("Junior")){
            		junAvegpa+=Double.valueOf(studentdata[i][2]);	
            		junCount++; 
            		out.println(studentdata[i][0]);
            	}
            }
            out.println("****************************************");
            	out.println("Average Junior GPA is "+ junAvegpa/junCount); 
            	 out.println("****************************************");
            	double senAvegpa=0.00;
                int senCount=0;
                out.println("Senior list is: ");
                for(int i=0; i<25;i++){
                	if(studentdata[i][1].trim().equals("Senior")){
                		senAvegpa+=Double.valueOf(studentdata[i][2]);	
                		senCount++; 
                		out.println(studentdata[i][0]);
                	}
                }
                out.println("****************************************");
                out.println("Average Senior GPA is "+ senAvegpa/senCount);
           
                       	
                
        }// closes method
        	
		}// closes class

