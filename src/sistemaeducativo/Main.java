package sistemaeducativo;

public class Main {
    public static void main(String[] args) {
        // Crear cuatro instancias de Profesor usando los cuatro constructores
        Profesor prof1 = new Profesor("Ana López", "12345678", 2500.0, 35, true);
        Profesor prof2 = new Profesor("Carlos Ruiz", "87654321", 2000.0);
        Profesor prof3 = new Profesor();
        Profesor prof4 = new Profesor("Marta Pérez", "23456789");

        // Mostrar la información de cada profesor
        System.out.println("\n----- Profesor 1 -----");
        prof1.mostrarInformacion();
        System.out.println("\n----- Profesor 2 -----");
        prof2.mostrarInformacion();
        System.out.println("\n----- Profesor 3 -----");
        prof3.mostrarInformacion();
        System.out.println("\n----- Profesor 4 -----");
        prof4.mostrarInformacion();

        System.out.println("\nSalario anual de prof1: $" + prof1.calcularSalarioAnual());
        System.out.println("Salario anual con bono ($1000) de prof1: $" + prof1.calcularSalarioAnual(1000.0));
        System.out.println("Salario para 6 meses de prof1: $" + prof1.calcularSalarioAnual(6));

        System.out.println("\nEvaluación de carga horaria de prof1: " + prof1.evaluarCargaHoraria());
        System.out.println("Evaluación de carga horaria de prof1 con límite 30: " + prof1.evaluarCargaHoraria(30));

        System.out.println("\nHoras anuales de prof1: " + prof1.calcularHorasAnuales());

        Curso cursoMatematicas = new Curso("Matemáticas");
        prof1.asignarCurso(cursoMatematicas);
        System.out.println("\nInformación del curso:");
        cursoMatematicas.mostrarInformacionCurso();

        System.out.println("\nActualizando horas semanales de prof1 a 45 (debería quedar en 40):");
        prof1.asignarHorasSemanales(45);
        prof1.mostrarInformacion();
    }
}