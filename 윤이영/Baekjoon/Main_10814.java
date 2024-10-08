import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_10814 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Person[] p = new Person[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person(age, name);
		}
		
		Arrays.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.age-p2.age;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(p[i].age+" "+p[i].name+"\n");
		}
		
		System.out.println(sb);
	}

}

class Person {
	String name;
	int age;
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
		
}