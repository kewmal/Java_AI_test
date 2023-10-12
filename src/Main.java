import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		//AlgoProg AI 2023 Kewin Malicki
		//Sztuczna inteligencja zaprogramowana na Javie
		
		//SztuczneNeurony
		ArrayList<String> powitanie=new ArrayList<>();
		ArrayList<String> odpowiedzi=new ArrayList<>();
		ArrayList<String> pytania=new ArrayList<>();
		
		
		System.out.println("Przenoszenie danych z plikow TXT do neuronów....");
		try{
			BufferedReader buf=new BufferedReader(new FileReader("/storage/emulated/0/PAM/pow.txt"));
			String line=buf.readLine();
			while(line!=null){
				powitanie.add(line);
				line=buf.readLine();
			}
			buf.close();
		}catch(IOException e){
		}
		try{
			BufferedReader buf=new BufferedReader(new FileReader("/storage/emulated/0/PAM/odp.txt"));
			String line=buf.readLine();
			while(line!=null){
				odpowiedzi.add(line);
				line=buf.readLine();
			}
			buf.close();
		}catch(IOException e){
		}
		try{
			BufferedReader buf=new BufferedReader(new FileReader("/storage/emulated/0/PAM/pyt.txt"));
			String line=buf.readLine();
			while(line!=null){
				pytania.add(line);
				line=buf.readLine();
			}
			buf.close();
		}catch(IOException e){
		}
		
		System.out.println("Witaj, jestem AlgoProg AI");
		System.out.println("___________________");
		System.out.println("Brain DataBase Load.... OK");
		System.out.println("___________________");
        System.out.println(powitanie);
		System.out.println(odpowiedzi);
		System.out.println(pytania);
		System.out.println("___________________");
		Scanner stringsc=new Scanner(System.in);
		String mowa=stringsc.next();
		System.out.println("\nTest czytania:"+mowa);
		
		
		System.out.println("Zapisywanie danych z neuronów do plików TXT....");
		try{
			File my =new File("/storage/emulated/0/PAM/pow.txt");
			if(my.createNewFile()){
			System.out.println("Plik nie istnieje, wiec go tworze.... OK");
			}else{
				System.out.println("Plik istnieje... ");
			}
		}catch(IOException e){
			System.out.println("error");
		}
		try{
			File my =new File("/storage/emulated/0/PAM/odp.txt");
			if(my.createNewFile()){
				System.out.println("Plik nie istnieje, wiec go tworze.... OK");
			}else{
				System.out.println("Plik istnieje...");
			}
		}catch(IOException e){
			System.out.println("error");
		}
		try{
			File my =new File("/storage/emulated/0/PAM/pyt.txt");
			if(my.createNewFile()){
				System.out.println("Plik nie istnieje, wiec go tworze.... OK");
			}else{
				System.out.println("Plik istnieje...");
			}
		}catch(IOException e){
			System.out.println("error");
		}
		
		
		
		try{
			FileWriter mam=new FileWriter("/storage/emulated/0/PAM/pow.txt");
			
			
			for(String ja:powitanie){
				mam.write(ja+"\n");
			}
			mam.close();
		}
		catch(IOException e){
			System.out.println("error");
		}
		try{
			FileWriter mam=new FileWriter("/storage/emulated/0/PAM/odp.txt");


			for(String ja:odpowiedzi){
				mam.write(ja+"\n");
			}
			mam.close();
		}
		catch(IOException e){
			System.out.println("error");
		}
		try{
			FileWriter mam=new FileWriter("/storage/emulated/0/PAM/pyt.txt");


			for(String ja:pytania){
				mam.write(ja+"\n");
			}
			mam.close();
		}
		catch(IOException e){
			System.out.println("error");
		}
		
	}
}
