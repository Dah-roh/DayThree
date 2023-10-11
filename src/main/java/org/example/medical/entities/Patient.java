package org.example.medical.entities;

import java.time.LocalDateTime;

public class Patient extends User{
    private String diagnosis;
    private LocalDateTime LAST_APPOINTMENT;
    private LocalDateTime NEXT_APPOINTMENT;
    private String lastPrescription;
    private String doctorName;
}
