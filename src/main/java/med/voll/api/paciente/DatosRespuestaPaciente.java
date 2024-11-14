package med.voll.api.paciente;

import med.voll.api.direccion.DatosDireccion;

public record DatosRespuestaPaciente(
        Long id,
        String nombre,
        String email,
        String documentoIdentidad,
        String telefono,
        DatosDireccion direccion
) {
    public DatosRespuestaPaciente (Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumentoIdentidad(), paciente.getTelefono(),
                new DatosDireccion(paciente.getDireccion().getCalle(), paciente.getDireccion().getDistrito(),
                paciente.getDireccion().getCiudad(), paciente.getDireccion().getNumero(), paciente.getDireccion().getComplemento()));
    }
}
