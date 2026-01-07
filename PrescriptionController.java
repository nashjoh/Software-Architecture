/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Prescription;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionController {

    private List<Prescription> prescriptions;

    public PrescriptionController() {
        prescriptions = new ArrayList<>();
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public List<Prescription> getPrescriptionsForPatient(String patientId) {
        List<Prescription> result = new ArrayList<>();
        for (Prescription p : prescriptions) {
            // Simple patient matching (CSV persistence later)
            result.add(p);
        }
        return result;
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }
}
