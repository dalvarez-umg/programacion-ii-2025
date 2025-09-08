import java.time.*;

public class Cita {
    private long id;
    private Paciente paciente;
    private Dueno dueno;
    private LocalDateTime fecha;
    private String motivo;
    private estadoCita estado;

    public void setId(long id) { this.id = id; }
    public long getId(long id) { return id; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public Paciente getPaciente() { return paciente; }
    public void setDueno(Dueno dueno) { this.dueno = dueno; }
    public Dueno getDueno() { return dueno; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public LocalDateTime getFecha() { return fecha; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getMotivo() { return motivo; }
    public void setEstadoCita(estadoCita estado) { this.estado = estado; }
    public estadoCita getEstadoCita() { return estado; }

    public void reagendar(LocalDateTime fecha){
        setFecha(fecha);
    }

    public void cancelar(){
        setEstadoCita(estadoCita.CANCELADA);
    }
}
