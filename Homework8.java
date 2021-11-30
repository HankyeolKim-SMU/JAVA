import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> idPass = new HashMap<>();
        idPass.put("myId", "myPass");
        idPass.put("myId2", "myPass2");
        idPass.put("myId3", "myPass3");
        String id;
        String pass;


        while(true) {
            System.out.print("ID와 PassWord를 입력해주세요.\n");
            System.out.print("id : ");
            id = sc.nextLine();
            id = id.trim();
            if (idPass.containsKey(id) != true) {
                System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("password : ");
            pass = sc.nextLine();
            pass = pass.trim();
            if(pass.equals(idPass.get(id))){
                System.out.println("id와 비밀번호가 일치합니다.\n");
                break;
            }
            else{
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
        }
    }
}
