package Json;


import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class Comment{
	private int id;
	private String content;
}

public class Json01 {

	public static void main(String[] args) {
		Comment ct1 = new Comment(1, "����1");
		
		// �ڹ� -> JSON (String)
		Gson gson = new Gson();
		String ctJson = gson.toJson(ct1);
		System.out.println(ctJson);
		
		// JSON (String) -> �ڹ�
		Comment ct2 = gson.fromJson(ctJson, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
		
	}

}
