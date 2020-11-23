package sms;

public class Response {
	String group_id;
	String error_list;
	String succes_count;
	String error_count;
	
	
	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GBP84VFPtr98eS\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		
		Response res = new Response();
		
		
		data = data.substring(1, 90);
		
		String a[] = data.split(",");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		String b0[] = a[0].split(":");
		b0[1] = b0[1].substring(1, 17);
		System.out.println(b0[1]);
		
		
		String b1[] = a[1].split(":");
		b1[2] = b1[2].substring(1, 5);
		System.out.println(b1[2]);
		
		String b2 = a[2].substring(16);
		System.out.println(b2);
		
		String b3 = a[3].substring(14);
		System.out.println(b3);
	}

}
