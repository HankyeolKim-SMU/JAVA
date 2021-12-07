import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Homework9 {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Scanner sc = new Scanner(new File("db.txt"));
            Scanner scan = new Scanner(System.in);
            Map<String, String> idPass = new HashMap<>();

            idPass.put(sc.nextLine(), sc.nextLine());
            idPass.put(sc.nextLine(), sc.nextLine());
            idPass.put(sc.nextLine(), sc.nextLine());

            String id;
            String pass;


            while (true) {
                System.out.print("ID와 PassWord를 입력해주세요.\n");
                System.out.print("id : ");
                id = scan.nextLine();
                id = id.trim();
                if (idPass.containsKey(id) != true) {
                    System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.\n");
                    continue;
                }
                System.out.print("password : ");
                pass = scan.nextLine();
                pass = pass.trim();
                if (pass.equals(idPass.get(id))) {
                    System.out.println("id와 비밀번호가 일치합니다.\n");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                    continue;
                }
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("파일이 발견되지 않았습니다.");
        }
    }
}
