package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// DTO = Data Transfor Object = ��ſ��� ���� ����
class UserDto {
	private int id;
	private String name;
	
}
public class String01 {

	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿";
		
		// �Ľ� pasing (���� �м�)
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("ȫ�浿");
		System.out.println(dto);
		
		String s[] = data.split("");
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и��� ���ڿ�" + i + " : " + s[i]);
		}
	}

}
