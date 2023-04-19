package com.springexample.springexample.model.dto;

import com.springexample.springexample.model.enums.FlightStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {

    private Long id;

    private String origin;

    private String destination;

    private String airline;

    private Date departureDate;

    private Date arrivalDate;

    private FlightStatus status;

    @Override
    public String toString() {
        return "FlightDTO{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", airline='" + airline + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", status=" + status +
                '}';
    }
}



