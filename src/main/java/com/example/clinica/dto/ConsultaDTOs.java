package com.example.clinica.dto;

import com.example.clinica.domain.model.StatusConsulta;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record ConsultaCreateDTO(
        @NotNull Long pacienteId,
        @NotNull Long medicoId,
        @NotNull @Future LocalDateTime dataHora
) {}

public record ConsultaResponseDTO(
        Long id,
        Long pacienteId,
        Long medicoId,
        LocalDateTime dataHora,
        StatusConsulta status
) {}