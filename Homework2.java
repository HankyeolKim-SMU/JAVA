import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] stdarray = new Student[3];

        stdarray[0] = new Student();
        stdarray[1] = new Student();
        stdarray[2] = new Student();

        String[] stinfo;
        stinfo = new String[4];
        String[] stinfo2;
        stinfo2 = new String[4];
        String[] stinfo3;
        stinfo3 = new String[4];

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        stinfo[0] = sc.next();
        stinfo[1] = sc.next();
        stinfo[2] = sc.next();
        stinfo[3] = sc.next();

        stdarray[0].getMajor(stinfo);
        stdarray[0].getName(stinfo);
        stdarray[0].getStnum(stinfo);
        stdarray[0].getPhonenum(stinfo);

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        stinfo2[0] = sc.next();
        stinfo2[1] = sc.next();
        stinfo2[2] = sc.next();
        stinfo2[3] = sc.next();

        stdarray[1].getMajor(stinfo2);
        stdarray[1].getName(stinfo2);
        stdarray[1].getStnum(stinfo2);
        stdarray[1].getPhonenum(stinfo2);

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        stinfo3[0] = sc.next();
        stinfo3[1] = sc.next();
        stinfo3[2] = sc.next();
        stinfo3[3] = sc.next();

        stdarray[2].getMajor(stinfo3);
        stdarray[2].getName(stinfo3);
        stdarray[2].getStnum(stinfo3);
        stdarray[2].getPhonenum(stinfo3);

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + stdarray[0].stnum + " " + stdarray[0].name + " " + stdarray[0].major + " " + stdarray[0].phonenum);
        System.out.println("두번째 학생: " + stdarray[1].stnum + " " + stdarray[1].name + " " + stdarray[1].major + " " + stdarray[1].phonenum);
        System.out.println("세번째 학생: " + stdarray[2].stnum + " " + stdarray[2].name + " " + stdarray[2].major + " " +stdarray[2].phonenum);
    }
}

class Student{
    String major;
    String name;
    String stnum;
    String phonenum;

    void getMajor(String[] s){
        major = s[2];
    }
    void getName(String[] s){
        name = s[1];
    }
    void getStnum(String[] s){
        stnum = s[0];
    }
    void getPhonenum(String[] s){
        phonenum = s[3];
    }
}