package org.example;

import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.enums.Role;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MedicalPersonnel doctor = new MedicalPersonnel();
        doctor.setName("Ogboni Doctor");
        doctor.setGrade("Special Physician");
        doctor.setRole(Role.DOCTOR);

    }
}