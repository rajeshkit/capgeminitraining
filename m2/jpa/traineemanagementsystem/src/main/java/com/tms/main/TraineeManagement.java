package com.tms.main;
// add a trainee, find a trainee, update a trainee, delete a trainee

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tms.entity.Trainee;

public class TraineeManagement {
	public static void main(String[] args) {
		// TraineeManagement.addTrainee();
		// TraineeManagement.addTrainee();
		// TraineeManagement.updateTrainee();
		// TraineeManagement.deleteTrainee();
	}
	public static void deleteTrainee() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the trainee ID you would like to delete: ");
		int tId=s.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("traineeunit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Trainee t = em.find(Trainee.class, tId);
		if (t != null) {
			em.remove(t);
		}
		if (t == null) {
			System.out.println("The trainee Id: " + tId + " " + "not found!! Delete Failed");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void updateTrainee() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the trainee ID you would like to update: ");
		int tId=s.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("traineeunit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Trainee t = em.find(Trainee.class, tId);
		if (t != null) {
			s.nextLine();
			System.out.println("Enter the new trainee name");
			t.setTraineeName(s.nextLine());
			System.out.println("Enter the new doj:");
			t.setDateOfJoining(LocalDate.parse(s.next()));
			System.out.println("Enter the new email: ");
			t.setEmail(s.next());
			System.out.println("Enter the new phone");
			t.setPhone(s.nextLong());
			em.merge(t);
		}
		if (t == null) {
			System.out.println("The trainee Id: " + tId + " " + "not found");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public static void findTraineeById() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the trainee ID: ");
		int tId = s.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("traineeunit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Trainee t = em.find(Trainee.class, tId);
		if (t != null) {
			System.out.println(t.getTraineeId() + " " + t.getTraineeName() + " " + t.getPhone() + " " + t.getEmail());
		}
		if (t == null) {
			System.out.println("The trainee Id: " + tId + " " + "not found");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void addTrainee() {
		Scanner s = new Scanner(System.in);
		System.out.println("Add the Trainee");
		System.out.println("Enter trainee name: ");
		String name = s.nextLine();
		System.out.println("Enter the date of joining: ");
		String doj = s.next();
		LocalDate df = LocalDate.parse(doj);
		System.out.println("Enter the Email: ");
		String email = s.next();
		System.out.println("Enter the phone");
		long phone = s.nextLong();
		Trainee t1 = new Trainee(0, name, df, email, phone);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("traineeunit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
