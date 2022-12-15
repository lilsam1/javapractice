package mvc_school_db;

import java.util.ArrayList;
import java.util.Scanner;

import mvc_account._db.AccountDTO;
import mvc_book_db.Book;
import mvc_book_db.BookDAO;

public class StudentManage {
	String[] className = {"JAVA", "PYTHON", "C"};
	
	private ArrayList<Student> students;
	private Scanner input;
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;
	private CourseDAO courseDAO;
	
	public StudentManage() {
		studentDAO = new StudentDAO();
		subjectDAO = new SubjectDAO();
		courseDAO = new CourseDAO();
		students = new ArrayList<Student>();
		input = new Scanner(System.in);
	}
	
	public void disConnect() {
		studentDAO.disConnect();
		subjectDAO.disConnect();
		courseDAO.disConnect();
	}
	
	private Student findStudentInform(int studentNumber) {
		for (Student student : students) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다");
				System.out.println("이름 : " + student.getName());
				System.out.println("전화번호 : " + student.getPhoneNumber());
				System.out.println("메모 : " + student.getMemo());
				return student;
			}
		}return null;
	}
	
	// 1. 학생 추가
	public void addStudent() {
		Student student = new Student();
		
		System.out.print("학생의 학번을 입력하세요 ");
		student.setStudentNumber(input.nextInt());
		
		System.out.print("이름을 입력하세요");
		student.setName(input.next());
		
		System.out.print("전화번호를 입력하세요 ");
		student.setPhoneNumber(input.next());
		
		System.out.println("메모를 입력하세요");
		student.setMemo(input.next());
		
		if(studentDAO.insertStudentNumber(student)) {
			System.out.println("학생 추가가 완료되었습니다");
		}
		else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	// 2. 학생 삭제 메뉴
	public void removeStudent() {
		Student student = new Student();
		
		System.out.print("학생의 학번을 입력하세요 >>>");
		student.setStudentNumber(input.nextInt());	// 학번 입력받음
		
		if(studentDAO.deleteStudentNumber(student)) {
			System.out.println("학생 삭제가 완료되었습니다");
		}
		else {
			System.out.println("다시 입력해주세요");
		}
	
	}
	
	// 3. 수강신청 메뉴
	public void addClass() {
		System.out.println("학번을 입력하세요");
		System.out.print("학번 : ");
		int studentNumber = input.nextInt();
		
		Student student = studentDAO.selectOne(studentNumber);
		if (student == null) {
			System.out.println("해당되는 학번이 없습니다");
			return;
		}
		
		while(true) {
			System.out.println("메뉴를 선택하세요: 1. 수강신청 / 2. 수강포기 / 3. 종료");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					System.out.println("수강신청할 과목코드를 입력하세요");
					break;
				case 2:
					System.out.println("수강포기할 과목코드를 입력하세요");
					break;
				case 3:
					System.out.println("메인메뉴로 돌아갑니다");
					return;
			}
		}
	}

	// 4. 성적 입력 메뉴
	public void setScore() {
		System.out.print("학생의 학번을 입력하세요 >>>");
		int studentNumber = input.nextInt();	// 학번 입력받음
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {	// 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다");
			return;	// 메서드 종료
		}
		
		while(true) {
			System.out.println("성적을 입력/수정할 과목을 선택하세요 1. JAVA / 2. PYTHON / 3. C / 4. 종료");
			int classMenu = input.nextInt();
			if(classMenu == 4) {	// 종료 체크
				break;	// while문 종료
			}
			if(!newStudent.getClassCheck()[classMenu-1]) {	// 미신청 체크
				System.out.println(className[classMenu-1] + "과목은 미신청 과목입니다");
				continue;	// 미신청이기 떄문에 처음으로 돌아간다
			}
			System.out.print("성적을 입력하세요 >>>");
			int score = input.nextInt();
			if(score < 0 || score > 100) {	// 성적이 0 ~ 100 까지인지 체크
				System.out.println("Error : 성적은 0부터 100 사이 숫자만 입력해 주세요");
				continue;	// 처음으로 돌아감
			}
			// 정상적인 과목과 성적이 입력이 된 경우
			newStudent.setClassScore(classMenu-1, score);	// 해당 학생의 Score를 업데이트 한다
			System.out.println(className[classMenu-1] + "성적 입력이 완료되었습니다");	// 출력
		}
	}
	
	
	// 5. 학생 정보 조희 메뉴
	
	public void informStudent() {	// 출력
		System.out.println("메뉴를 선택해주세요. 1. 특정 학생만 / 2. 전체 학생");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // 특정 학생의 정보
			System.out.println("조회할 학생의 학번을 입력하세요");
			System.out.print("학번 : ");
			int studentNumber = input.nextInt();
			
			Student student = studentDAO.selectOne(studentNumber);
			if (student != null) {
				System.out.println();
				System.out.println("이름 : " + student.getName() + "\n" + "연락처 : " + student.getPhoneNumber() + "\n" + "기록사항 : " + student.getMemo() + "\n" + "학번 : " + student.getStudentNumber() + "\n");
			}
			else {
				System.out.println("해당 학번의 학생은 존재하지 않습니다");
			}
			break;
		case 2:	// 전체 학생의 정보
			ArrayList<Student> list = studentDAO.selectAll();
			for (Student student1 : list) {
				System.out.println("이름 : " + student1.getName() + "\n" + "연락처 : " + student1.getPhoneNumber() + "\n" + "기록사항 : " + student1.getMemo() + "\n" + "학번 : " + student1.getStudentNumber() + "\n");
			}
			break;
		}
	}
	
	
	
	// 6. 수강과목 관리
	public void management() {
		System.out.println("메뉴를 선택 해주세요. 1. 과목을 조회합니다 / 2. 과목을 추가합니다 / 3. 과목을 삭제합니다 / 4. 종료");
		int menu = input.nextInt();
		switch(menu) {
		case 1: // 과목 조회
			ArrayList<Subject> list = subjectDAO.selectAll();
			for (Subject subject : list) {
				System.out.println(subject.getCode() + "\t" + subject.getSubjectName() + "\t");
			}
			break;
		case 2:	// 과목 추가
			Subject subject = new Subject();
			
			System.out.print("추가하려는 과목의 코드를 입력하세요 ");
			subject.setCode(input.nextInt());
			
			System.out.print("과목 이름을 입력하세요");
			subject.setSubjectName(input.next());
			
			if(subjectDAO.insertCode(subject)) {
				System.out.println("과목 추가가 완료되었습니다");
			}
			else {
				System.out.println("다시 입력해주세요");
			}
			break;
		case 3:	// 과목 삭제
			Subject subject1 = new Subject();
			
			System.out.print("삭제하려는 과목의 코드를 입력하세요 >>>");
			subject1.setCode(input.nextInt());	// 학번 입력받음
			
			if(subjectDAO.deleteCode(subject1)) {
				System.out.println("과목 삭제가 완료되었습니다");
			}
			else {
				System.out.println("다시 입력해주세요");
			}
			break;
		case 4:	// 메인메뉴로
			System.out.println("메인메뉴로 돌아갑니다");
			return;
		
		}
	}
	

	
}
