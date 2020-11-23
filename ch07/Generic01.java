package ch07;

import lombok.Data;

@Data
class ResponseDto<T> {
	private int statusCode; // 200(성공), 300(다시 요청해), 400(잘못된 요청)
	private T data; // 아직 정해지지 않은 타입
}

class Dog {
	
}

public class Generic01 {

	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		
		if(dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}

	}

}
