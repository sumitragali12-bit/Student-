package Student_management;

import java.util.ArrayList;
import java.util.Scanner;

	public class StudentManagement {

		static ArrayList<Student1> al = new ArrayList();
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {

			while (true) {
				System.out.println("========== Student Management System ==========");
				System.out.println(" 1. Add Students");
				System.out.println(" 2. Display Students");
				System.out.println(" 3. Search Students");
				System.out.println(" 4. Update Students");
				System.out.println(" 5. Delete Students");
				System.out.println(" 6. Exit");

				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					addStudent();
					break;

				case 2:
					displayStudents();
					break;

				case 3:
					searchStudent();
					break;

				case 4:
					updateStudent();
					break;

				case 5:
					deleteStudent();
					break;

				case 6:
					System.out.println("Thank You...!!!!");
					break;

				default:
					System.out.println("Invalid choice");

				}
			}

		}

//		-----------to add student-------------

		
		public static void addStudent() {
			System.out.println("Enter Id : ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter name : ");
			String name = sc.nextLine();

			System.out.println("Enter age : ");
			int age = sc.nextInt();

			System.out.println("Enter marks : ");
			double marks = sc.nextDouble();

			Student1 s = new Student1(id, name, age, marks);
			al.add(s);
			System.out.println("Student added successfully");

		}

		public static void displayStudents() {
			if (al.isEmpty()) {
				System.out.println("No student found !!!");
				return;
			}
			for (Student1 o : al) {
				o.display();
			}
		}

		public static void searchStudent() {
			System.out.println("Enter Student Id : ");
			int id = sc.nextInt();

			for (Student1 s : al) {
				if (s.getId() == id) {
					s.display();
					return;
				}
			}
			System.out.println("Student not found");
		}

		public static void updateStudent() {
			System.out.println("Enter student id : ");
			int id = sc.nextInt();

			for (Student1 s : al) {
				if (s.getId() == id) {
					sc.nextLine();

					System.out.println("Enter new name : ");
					String name = sc.nextLine();

					System.out.println("Enter new age : ");
					int age = sc.nextInt();

					System.out.println("Enter new marks : ");
					double marks = sc.nextDouble();

					s.setName(name);
					s.setAge(age);
					s.setMarks(marks);

					System.out.println("Student updates successfully...");
					return;
				}
			}
			System.out.println("Student not found...!!");
		}

		public static void deleteStudent() {
			System.out.println("Enter Student Id : ");
			int id = sc.nextInt();

			for (Student1 s : al) {
				if (s.getId() == id) {
					al.remove(s);
					System.out.println("Student deleted successfullyy..!!");
					return;
				}
			}
			System.out.println("Student not found !!!!");
		}

	}