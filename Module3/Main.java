import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{
	HashSet<String> set = new HashSet<>();
	ArrayList <String> al = new ArrayList<>();
	HashMap <String,Integer> mp = new HashMap<>();
	ArrayList <String> dic = new ArrayList<>();
	public ArrayList <String> spell(String filename) {
		try
		{
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String data = "",s;
			while(true)
			{
				s = br.readLine();
				if(s==null)
					break;
				data = data+" "+s;
			}
			StringTokenizer st = new StringTokenizer(data," ");
			while(st.hasMoreTokens())
			{
				String ans = "";
				String w = st.nextToken();
				for(int k=0; k<w.length(); k++)
				{
					char c = w.charAt(k);
					int a =(int)w.charAt(k);
					if((a>=65 && a<=90) || (a>=97 && a<=122))
					{
						ans = ans + c;
					}
				}
				al.add(ans);
			}
			File fl = new File("dictionary.txt");
			FileReader frr = new FileReader(fl);
			BufferedReader brr = new BufferedReader(frr);
			String sr;
			while(true)
			{
				sr = brr.readLine();
				if(sr==null)
					break;
				mp.put(sr, 0);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0; i<al.size(); i++)
		{
			String str = al.get(i);
			if(!mp.containsKey(str) && str.length()>1)
			{
				try
				{
					int a = Integer.parseInt(str);
				}
				catch(Exception e)
				{
					set.add(str);
				}
			}
		}
		Iterator<String> itr = set.iterator();  
		while(itr.hasNext()){
			String l = itr.next();
			dic.add(l);  
		}
		return dic;
	}

	public void printNonDuplicates(ArrayList<String> all) 
	{
		for(int i=0; i<all.size(); i++)
		{
			System.out.println(all.get(i));
		}
	}

	public static void main(String[] args) 
	{
		Scanner scc = new Scanner(System.in);
		String filename;
		System.out.println("Enter the filename");
		filename = scc.nextLine();
		System.out.println("Unknown, Check the spelling of these:");
		Main sc = new Main();
		ArrayList<String> al = sc.spell(filename);
		sc.printNonDuplicates(al);
	}
}